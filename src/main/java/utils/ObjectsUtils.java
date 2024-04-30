package main.java.utils;

import java.util.Objects;
import java.util.Set;

public class ObjectsUtils {
	public static <T> boolean isExcluded(T element, Set<T> exclude) {
		for (T excludedElement : exclude) {
			if (Objects.equals(element, excludedElement))
				return false;
		}
		return true;
	}
}
