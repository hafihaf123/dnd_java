package main.java.dice;

import java.util.Random;

public class Dice {
	private int sides;
	private final Random random;
	
	public Dice(int sides) {
		if (sides <= 0)
			throw new IllegalArgumentException("The number of sides must be grater than zero");
		this.sides = sides;
		random = new Random();
	}
	
	public int roll() {
		return random.nextInt(sides) + 1;
	}
	
	public int roll(int numberOfRolls) {
		if (numberOfRolls <= 0)
			throw new IllegalArgumentException("The number of rolls must be grater than zero");
		int total = 0;
		for (int i = 0; i < numberOfRolls; i++) {
			total += roll();
		}
		return total;
	}
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		if (sides <= 0)
			throw new IllegalArgumentException("The number of sides must be grater than zero");
		this.sides = sides;
	}
}
