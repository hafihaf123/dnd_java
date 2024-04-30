package main.java.creature.properties.size;

public enum SizeCategory {
	TINY(2.5f),
	SMALL(5),
	MEDIUM(5),
	LARGE(10),
	HUGE(15),
	GARGANTUAN(20);
	
	private final float space;
	
	SizeCategory(float space) {
		this.space = space;
	}
	
	public float getSpace() {
		return space;
	}
}
