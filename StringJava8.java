package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJava8 {
	public static void main(String... args) {
		// Anagram or not:

		String s1 = "silent";
		String s2 = "listeN";

		s1 = Stream.of(s1.split("")).map((letter) -> letter.toUpperCase()).sorted().collect(Collectors.joining());

		s2 = Stream.of(s2.split("")).map((letter) -> letter.toUpperCase()).sorted().collect(Collectors.joining());

		if (s1.equals(s2)) {
			System.out.println("Two string are anagram");
		} else
			System.out.println("Two string are not anagram");

		// sum of all digits in a number;

		int number = 12345;
		Integer result = Stream.of(String.valueOf(number).split(""))
				.collect(Collectors.summingInt((num) -> Integer.parseInt(num)));
		System.out.println("Sum of digits: " + result);

		// second largest number in an integer array

		List<Integer> l = Arrays.asList(1, 4, 5, 20, 90);
		Integer num = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println("given list: " + l);
		System.out.println("second largest from the list: " + num);

		// sort the string according to increase order of length
		List<String> names = Arrays.asList("geetha", "John", "ram", "Seetha Ram");
		names.stream().sorted((first, second) -> first.length() - second.length()).forEach(System.out::println);
		names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}

}
