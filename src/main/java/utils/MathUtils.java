package main.java.utils;

public class MathUtils {
	private MathUtils() {
		throw new AssertionError("Utility class MathUtils cannot be instantiated");
	}
	
	public static int sumOfArrayExceptMin(int[] arr) {
		if (arr.length == 0)
			throw new IllegalArgumentException("Array cannot be empty");
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int num : arr) {
			sum += num;
			if (num < min)
				min = num;
		}
		return sum - min;
	}
}