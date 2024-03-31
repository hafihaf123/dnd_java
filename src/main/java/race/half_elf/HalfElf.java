package main.java.race.half_elf;

import main.java.race.Race;

public class HalfElf extends Race {
	public HalfElf() {
		this.raceName = "Half-Elf";
		this.charismaBonus = 2;
		//two other ability scores of your choice increase by 1
		this.ageMax = 200;
		this.speed = 30;
	}
}
