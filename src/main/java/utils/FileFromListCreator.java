package main.java.utils;

import main.java.utils.subclass_creators.ItemSubclassFileCreator;
import main.java.utils.subclass_creators.SubclassFileCreator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class FileFromListCreator {
    private static final Path pathToListFile = Path.of("/home/user1/Documents/");
    /** relative to the absolute path of the item directory */
    private static final String relativeDirPathName = "";

    public static void main(String[] args) {
        createFiles(readList());
    }

    private static List<ItemSubclassFileCreator> readList() throws RuntimeException {
        try (
            BufferedReader fileReader = new BufferedReader(new FileReader(pathToListFile.toFile()))
        ) {
            return fileReader
                    .lines()
                    .map(line -> line.split(" "))
                    .map(parts -> {
                        String name = parts[0];
                        int cost = Integer.parseInt(parts[1]);
                        String coinType = parts[2].toUpperCase();
                        double weight = Double.parseDouble(parts[3]);
                        return new ItemSubclassFileCreator(name, cost, coinType, weight, relativeDirPathName);
                            }
                    )
                    .toList();
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }

    private static <T extends SubclassFileCreator> void createFiles(List<T> list) throws RuntimeException{
        try {
            list.forEach(SubclassFileCreator::createFile);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}