package main.java.char_sheet;

import main.java.creature.character.Character;
import main.java.creature.properties.attributes.Attribute;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.form.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharSheetCreator {
    private final File templateDoc;
    private final Character character;

    public CharSheetCreator(File templateDoc, Character character) {
        this.templateDoc = templateDoc;
        this.character = character;
    }

    public void createCharSheet(File destination) throws IOException {
        try (
            PDDocument output = new PDDocument();
            PDDocument template = Loader.loadPDF(new RandomAccessReadBufferedFile(templateDoc))
        ) {
            for (PDPage page : template.getPages())
                output.addPage(page);

            PDDocumentCatalog docCatalog = template.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();
            PDFieldTree fieldTree = acroForm.getFieldTree();
            Map<String, String> fieldsMap = createFieldsMap();
            for (PDField field : fieldTree) {
                if (field instanceof PDTextField) {
                    field.setValue(fieldsMap.get(field.getFullyQualifiedName()));
                }
            }

            output.save(destination);
        }
    }

    public void createCharSheetFields(File destination) throws IOException {
        if (destination.exists()) return;
        try (
            PDDocument output = new PDDocument();
            PDDocument template = Loader.loadPDF(new RandomAccessReadBufferedFile(templateDoc))
        ) {
            for (PDPage page : template.getPages())
                output.addPage(page);
            PDDocumentCatalog docCatalog = template.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();
            PDFieldTree fieldTree = acroForm.getFieldTree();
            for (PDField field: fieldTree) {
                if (field instanceof PDTextField)
                    field.setValue(field.getFullyQualifiedName());
            }
            output.save(destination);
        }
    }

    public Map<String, String> createFieldsMap() {
        Map<String, String> map = new HashMap<>();
        map.put("CharacterName", character.getName());
        map.put("CharacterName 2", character.getName());
        map.put("ClassLevel", character.getCharacterClass().getClassName());
        map.put("Race ", character.getRace().getRaceName());
        map.put("Age", String.valueOf(character.getAge()));
        map.put("Alignment", character.getAlignment().toString());
        map.put("STR", String.valueOf(character.getAttributes().getAttribute(Attribute.STR)));
        map.put("STRmod", String.format("%+d",character.getAttributes().getModifier(Attribute.STR)));
        map.put("DEX", String.valueOf(character.getAttributes().getAttribute(Attribute.DEX)));
        map.put("DEXmod ", String.format("%+d",character.getAttributes().getModifier(Attribute.DEX)));
        map.put("CON", String.valueOf(character.getAttributes().getAttribute(Attribute.CON)));
        map.put("CONmod", String.format("%+d",character.getAttributes().getModifier(Attribute.CON)));
        map.put("INT", String.valueOf(character.getAttributes().getAttribute(Attribute.INT)));
        map.put("INTmod", String.format("%+d",character.getAttributes().getModifier(Attribute.INT)));
        map.put("WIS", String.valueOf(character.getAttributes().getAttribute(Attribute.WIS)));
        map.put("WISmod", String.format("%+d",character.getAttributes().getModifier(Attribute.WIS)));
        map.put("CHA", String.valueOf(character.getAttributes().getAttribute(Attribute.CHA)));
        map.put("CHamod", String.format("%+d",character.getAttributes().getModifier(Attribute.CHA)));
        map.put("ProfBonus", String.valueOf(character.getProficiencyBonus()));
        map.put("AC", String.valueOf(character.getArmorClass()));
        map.put("Speed", String.valueOf(character.getSpeed()));
        map.put("HPMax", String.valueOf(character.getMaxHP()));
        map.put("HPCurrent", String.valueOf(character.getCurrentHP()));
        map.put("HD", character.getCharacterClass().getHitDice().toString());
        return map;
    }
}

