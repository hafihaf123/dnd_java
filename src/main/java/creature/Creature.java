package main.java.creature;

import main.java.alignment.Alignment;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.size.SizeCategory;

import java.util.List;

public abstract class Creature {
    protected String name;
    protected int armorClass;
    protected int hp;
    /** in foot */
    protected int speed;
    protected Attributes attributes;
    protected List<Language> languages;
    protected Alignment alignment;
    protected SizeCategory size;
}
