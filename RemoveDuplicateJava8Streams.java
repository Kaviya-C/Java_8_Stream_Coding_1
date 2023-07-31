package com.coding.java_8.revise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateJava8Streams {
	public static void main(String... args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 14, 13, 1, 12));

		Set<Integer> set = new HashSet<>();

		list.stream().filter((number) -> set.add(number)).forEach((num) -> System.out.print(num + " "));

		List<Integer> l = list.stream().distinct().collect(Collectors.toList());

		System.out.println(l);

	}

}
