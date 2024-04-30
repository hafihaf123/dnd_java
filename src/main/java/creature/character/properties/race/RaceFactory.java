package main.java.creature.character.properties.race;

import main.java.creature.character.properties.race.dragonborn.Dragonborn;
import main.java.creature.character.properties.race.dwarf.Dwarf;
import main.java.creature.character.properties.race.dwarf.HillDwarf;
import main.java.creature.character.properties.race.dwarf.MountainDwarf;
import main.java.creature.character.properties.race.elf.DarkElf;
import main.java.creature.character.properties.race.elf.Elf;
import main.java.creature.character.properties.race.elf.HighElf;
import main.java.creature.character.properties.race.elf.WoodElf;
import main.java.creature.character.properties.race.gnome.ForestGnome;
import main.java.creature.character.properties.race.gnome.Gnome;
import main.java.creature.character.properties.race.gnome.RockGnome;
import main.java.creature.character.properties.race.half_elf.HalfElf;
import main.java.creature.character.properties.race.half_orc.HalfOrc;
import main.java.creature.character.properties.race.halfling.Halfling;
import main.java.creature.character.properties.race.halfling.Lightfoot;
import main.java.creature.character.properties.race.halfling.Stout;
import main.java.creature.character.properties.race.human.Human;
import main.java.creature.character.properties.race.tiefling.Tiefling;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RaceFactory {
	private final Map<String, Supplier<Race>> raceMap = new HashMap<>();
	
	public RaceFactory() {
		raceMap.put("Dragonborn", Dragonborn::new);
		raceMap.put("Dwarf", Dwarf::new);
		raceMap.put("Hill Dwarf", HillDwarf::new);
		raceMap.put("Mountain Dwarf", MountainDwarf::new);
		raceMap.put("Elf", Elf::new);
		raceMap.put("Drow", DarkElf::new);
		raceMap.put("High Elf", HighElf::new);
		raceMap.put("Wood Elf", WoodElf::new);
		raceMap.put("Gnome", Gnome::new);
		raceMap.put("Forest Gnome", ForestGnome::new);
		raceMap.put("Rock Gnome", RockGnome::new);
		raceMap.put("Half-Elf", HalfElf::new);
		raceMap.put("Half-Orc", HalfOrc::new);
		raceMap.put("Halfling", Halfling::new);
		raceMap.put("Lightfoot", Lightfoot::new);
		raceMap.put("Stout", Stout::new);
		raceMap.put("Human", Human::new);
		raceMap.put("Tiefling", Tiefling::new);
	}
	
	public Race getRace(String raceName) throws IllegalArgumentException {
		Supplier<Race> race = raceMap.get(raceName);
		if (race != null) {
			return race.get();
		}
		throw new IllegalArgumentException(STR."Invalid race: \{raceName}");
	}

	public Map<String, Supplier<Race>> getRaceMap() {
		return raceMap;
	}
}