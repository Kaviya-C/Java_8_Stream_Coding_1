package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortGIvenListDecimalsReverse {
	public static void main(String... args) {
		// reverse order--Comparator.reverseOrder()--sorted
		List<Double> list = Arrays.asList(12.09, 22.88, 10.89, 3.08, 6.89);
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		// join with delimiter and prefix suffix
		// Collectors.joining(delim,prefix,siffix);
		List<String> string = Arrays.asList("Kaviya", "Java", "developer", "software", "field");
		String resultant = string.stream().collect(Collectors.joining(" , ", "[ ", " ]"));
		System.out.println(resultant);

		// given number multiple of 5
		List<Integer> multiples = Arrays.asList(1, 2, 3, 5, 10, 4, 15, 20, 55, 30);
		multiples.stream().filter((num) -> num % 5 == 0).forEach(System.out::println);

		// maximum and minimum of given numbers
		List<Integer> maxmin = Arrays.asList(120, 34, 56, 89, 98);
		Optional maximum = maxmin.stream().collect(Collectors.maxBy((first, second) -> first - second));
		Optional minimum = maxmin.stream().collect(Collectors.minBy((first, second) -> first - second));
		
		System.out.println("Given list: " + maxmin);
		System.out.println("Minimum number: " + minimum.get());
		System.out.println("Maximum number: " + maximum.get());
		
		int max = maxmin.stream().max((Comparator.naturalOrder())).get();
		int min = maxmin.stream().min(Comparator.naturalOrder()).get();

		System.out.println("Max element: " + max);
		System.out.println("Min element: " + min);

	}

}
