package main.java.char_sheet;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import main.java.creature.character.Character;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSheetCreator {
    private final File templateDoc = new File("/home/user1/IdeaProjects/dnd_java/documents/CharSheetPDF.pdf");

    public CharSheetCreator(Character character) {
    }

    public void createCharSheet(File destination) throws IOException, DocumentException {
        Document document = new Document();
        PdfCopy copy = new PdfCopy(document, new FileOutputStream(destination));
        document.open();
        PdfReader reader = new PdfReader(templateDoc.getAbsolutePath());
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            copy.addPage(copy.getImportedPage(reader, i));
        }
        document.close();
    }
}

