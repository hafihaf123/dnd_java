package main.java.race;

import main.java.race.dragonborn.Dragonborn;
import main.java.race.dwarf.Dwarf;
import main.java.race.dwarf.HillDwarf;
import main.java.race.dwarf.MountainDwarf;
import main.java.race.elf.DarkElf;
import main.java.race.elf.Elf;
import main.java.race.elf.HighElf;
import main.java.race.elf.WoodElf;
import main.java.race.gnome.ForestGnome;
import main.java.race.gnome.Gnome;
import main.java.race.gnome.RockGnome;
import main.java.race.half_elf.HalfElf;
import main.java.race.half_orc.HalfOrc;
import main.java.race.halfling.Halfling;
import main.java.race.halfling.Lightfoot;
import main.java.race.halfling.Stout;
import main.java.race.human.Human;
import main.java.race.tiefling.Tiefling;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RaceFactory {
	private Map<String, Supplier<Race>> raceMap = new HashMap<>();
	
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
	
	public Race getRace(String raceName) {
		Supplier<Race> race = raceMap.get(raceName);
		if (race != null) {
			return race.get();
		}
		throw new IllegalArgumentException(STR."Invalid race: \{raceName}");
	}
}
