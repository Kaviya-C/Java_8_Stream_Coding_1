package com.coding.java_8.revise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateOddEvenNumbers {
	public static void main(String... args) {
		// seperate odd and even number;

		System.out.println("Even number");
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 14, 15, 16, 11, 17, 18, 19, 20));
		list.stream().filter((num) -> num % 2 == 0).forEach(number -> System.out.println(number));

		System.out.println("Oddnumber");
		list.stream().filter((num) -> num % 2 != 0).forEach(number -> System.out.println(number));

		
		System.out.println("Using map to print odd and even..");
		
		
		Map<Boolean, List<Integer>> oddeven = list.stream()
				.collect(Collectors.partitioningBy((number) -> number % 2 == 0));

		Set<Entry<Boolean, List<Integer>>> entrySet = oddeven.entrySet();

		for (var e : entrySet) {
			if (e.getKey()) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}

			List<Integer> last = e.getValue();
			for (int result : last) {
				System.out.println(result);
			}
		}

	}

}
