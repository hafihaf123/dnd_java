package main.java.creature.character.properties.proficiency;

import java.util.HashSet;
import java.util.Set;

public class Proficiencies {
    private final Set<Proficiency> proficiencies;

    public Proficiencies() {
        this.proficiencies = new HashSet<>();
    }

    @SafeVarargs
    public Proficiencies(Set<Proficiency>... proficiencies) {
        this.proficiencies = new HashSet<>();
        for (Set<Proficiency> set: proficiencies) {
            if (!set.contains(null)) {
                this.proficiencies.addAll(set);
            }
        }
    }

    public void addProficiency(Proficiency proficiency) {
        this.proficiencies.add(proficiency);
    }

    public void removeProficiency(Proficiency proficiency) {
        this.proficiencies.remove(proficiency);
    }

    public boolean hasProficiency(Proficiency proficiency) {
        return this.proficiencies.contains(proficiency);
    }
}
