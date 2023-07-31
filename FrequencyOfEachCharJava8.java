package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharJava8 {
	public static void main(String... args) {

		// each character frequency...

		String input = "hello world";

		Map<Character, Long> map = input.chars().mapToObj((character) -> (char) character)
				.collect(Collectors.groupingBy((element) -> element, Collectors.counting()));

		System.out.println(map);

		// each element frequency or each word frequency

		List<String> list = Arrays.asList("Pen", "Pen", "Book", "pencil", "pencil");

		Map<String, Long> wordCount = list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(wordCount);

	}

}
