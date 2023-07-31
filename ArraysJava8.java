package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArraysJava8 {
	public static void main(String... args) {
		// merge two unsorted array into one sorted array
		int[] array1 = { 8, 4, 2, 1 };
		int[] array2 = { 3, 5, 3, 2, 6, 7 };
		int[] array3 = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
		System.out.println(Arrays.toString(array3));

		// merger two unsorted array into one sorted array without dupllicates:

		int[] array4 = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(array4));

		// three maximum and minimum three
		System.out.println("Maximum three numbers: ");
		Integer[] array5 = { 100, 800, 200, 400, 1200 };
		Arrays.stream(array5).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		System.out.println("Minimum three numbers: ");
		Arrays.stream(array1).sorted().limit(3).forEach(System.out::println);
	}

}
