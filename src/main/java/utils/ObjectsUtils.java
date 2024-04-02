package main.java.utils;

import java.util.List;
import java.util.Objects;

public class ObjectsUtils {
	@SafeVarargs
	public static <T> boolean isExcluded(T element, T... exclude) {
		for (T excludedElement : exclude) {
			if (Objects.equals(element, excludedElement))
				return false;
		}
		return true;
	}
	
	public static <T> boolean isExcluded(T element, List<T> exclude) {
		for (T excludedElement : exclude) {
			if (Objects.equals(element, excludedElement))
				return false;
		}
		return true;
	}
}
