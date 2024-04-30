package main.java.creature.character.race;

import main.java.creature.character.race.dragonborn.Dragonborn;
import main.java.creature.character.race.dwarf.Dwarf;
import main.java.creature.character.race.dwarf.HillDwarf;
import main.java.creature.character.race.dwarf.MountainDwarf;
import main.java.creature.character.race.elf.DarkElf;
import main.java.creature.character.race.elf.Elf;
import main.java.creature.character.race.elf.HighElf;
import main.java.creature.character.race.elf.WoodElf;
import main.java.creature.character.race.gnome.ForestGnome;
import main.java.creature.character.race.gnome.Gnome;
import main.java.creature.character.race.gnome.RockGnome;
import main.java.creature.character.race.half_elf.HalfElf;
import main.java.creature.character.race.half_orc.HalfOrc;
import main.java.creature.character.race.halfling.Halfling;
import main.java.creature.character.race.halfling.Lightfoot;
import main.java.creature.character.race.halfling.Stout;
import main.java.creature.character.race.human.Human;
import main.java.creature.character.race.tiefling.Tiefling;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RaceFactory {
	private final Map<String, Supplier<Race>> raceMap = new HashMap<>();
	
	public RaceFactory() {
		addRace(new Dragonborn());
		addRace(new Dwarf());
		addRace(new HillDwarf());
		addRace(new MountainDwarf());
		addRace(new Elf());
		addRace(new DarkElf());
		addRace(new HighElf());
		addRace(new WoodElf());
		addRace(new Gnome());
		addRace(new ForestGnome());
		addRace(new RockGnome());
		addRace(new HalfElf());
		addRace(new HalfOrc());
		addRace(new Halfling());
		addRace(new Lightfoot());
		addRace(new Stout());
		addRace(new Human());
		addRace(new Tiefling());
	}

	public void addRace(Race race) {
		this.raceMap.put(race.getRaceName(), () -> race);
	}
	
	public Race getRace(String raceName) throws IllegalArgumentException {
		Supplier<Race> race = this.raceMap.get(raceName);
		if (race != null) {
			return race.get();
		}
		throw new IllegalArgumentException(STR."Invalid race: \{raceName}");
	}

	public Map<String, Supplier<Race>> getRaceMap() {
		return raceMap;
	}
}
