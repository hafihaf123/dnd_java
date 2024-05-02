package main.java.utils.subclass_creators;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ItemSubclassFileCreator extends Item implements SubclassFileCreator {
    private final String coinType;

    private static final Path absoluteItemDirPath = Path.of("/home/user1/IdeaProjects/dnd_java/src/main/java/item");
    /** relative to the absolute path of the item directory */
    private final Path relativeDirPath;
    private final Path newFilePath;

    public ItemSubclassFileCreator(
        String name,
        int cost,
        String coinType,
        double weight,
        String relativeDirName
    ) {
        this.name = name;
        this.coinType = coinType;
        this.cost = new Coin(CoinType.valueOf(coinType), cost);
        this.weight = weight;
        this.relativeDirPath = absoluteItemDirPath.resolve(relativeDirName);
        this.newFilePath = relativeDirPath.resolve(STR."\{name}.java");
    }

    public void createFile() throws RuntimeException {
        setupDir();
        try(
            FileWriter writer = new FileWriter(newFilePath.toFile())
        ) {
            writer.write(createFileContent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setupDir() throws RuntimeException{
        try {
            Files.createDirectories(relativeDirPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String createFileContent() {
        return STR.
                """
               package main.java.item.\{absoluteItemDirPath.relativize(relativeDirPath).toString().replace('/', '.')};

               import main.java.item.Item;
               import main.java.item.coin.Coin;
               import main.java.item.coin.CoinType;

               public class \{this.name} extends Item {
                   public \{this.name}() {
                       this.name = "\{this.name}";
                       this.cost = new Coin(CoinType.\{this.coinType}, \{(int)this.cost.getAmount(CoinType.valueOf(this.coinType))});
                       this.weight = \{this.weight};
                   }
               }
               """;
    }
}
