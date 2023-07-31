package com.coding.java_8.revise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AgeOfPersonYears {
	public static void main(String... args) {
		LocalDate birthday = LocalDate.of(2001, 02, 04);
		LocalDate today = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthday, today));
		// last element of an array:

		List<String> list = Arrays.asList("first", "Java", "Developer");
		System.out.println("Given list: " + list);
		String lastElement = list.stream().skip(list.size() - 1).findFirst().get();
		System.out.println("Last element from the given list is: " + lastElement);

		// print 10 even number

		IntStream.rangeClosed(1, 10).map((num) -> num * 2).forEach(System.out::println);

		// print 10 odd numbers
		Stream.iterate(new int[] { 1, 3 }, num -> new int[] { num[1], num[1] + 2 }).limit(10).map(f -> f[0])
				.forEach(System.out::println);

		// fibonacci series
		Stream.iterate(new int[] { 0, 1 }, element -> new int[] { element[1], element[0] + element[1] }).limit(10)
				.map(first -> first[0]).forEach(System.out::println);

		Stream.iterate(1, i -> i < 100, i -> i * 5).forEach(System.out::println);

	}

}
