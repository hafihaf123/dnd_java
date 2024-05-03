package main.java.creature.character.properties.proficiency;

import java.util.HashSet;
import java.util.Set;

public class Proficiencies {
    private final Set<Proficiency> proficiencies;

    public Proficiencies() {
        this.proficiencies = new HashSet<>();
    }

    public void addProficiency(Proficiency proficiency) {
        this.proficiencies.add(proficiency);
    }

    public <T extends Proficiency> void addProficiency(Set<T> proficiencies) {
        this.proficiencies.addAll(proficiencies);
    }

    public void addProficiency(Proficiency... proficiencies) {
        for (Proficiency proficiency: proficiencies) {
            addProficiency(proficiency);
        }
    }

    public void removeProficiency(Proficiency proficiency) {
        this.proficiencies.remove(proficiency);
    }

    public boolean hasProficiency(Proficiency proficiency) {
        return this.proficiencies.contains(proficiency);
    }

    public Set<Proficiency> getProficiencies() {
        return this.proficiencies;
    }
}
