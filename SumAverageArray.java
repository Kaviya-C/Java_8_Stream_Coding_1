package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumAverageArray {
	public static void main(String... args) {
		// sum and average of the given array
		int[] array = { 1, 2, 4, 5, 1 };

		int sum = Arrays.stream(array).sum();

		double average = Arrays.stream(array).average().getAsDouble();

		System.out.println("Sum of the array: " + sum);

		System.out.println("Average of the array: " + average);

		// common elements between two arrays;
		
		int[] array1= {12,45,32,34,45,90,12};
		
		int[] array2= {33,55,7,8,12,45};
		
		HashSet<Integer> set=Arrays.stream(array2).boxed()
				.collect(Collectors.toCollection(()->new HashSet<>()));
		System.out.println("Common elements in the given int array");
		Arrays.stream(array1).distinct().filter((element)->set.contains(element)).forEach(System.out::println);
		
		//common element to find for given list of integers
		
		List<Integer> l1=Arrays.asList(12,5,2,5,100);
		
		List<Integer> l2=Arrays.asList(12,100,5,6,3,9);
		
		Set<Integer> sets=new HashSet<>(l2); 
		
		System.out.println("common element in the list of integers: ");
		l1.stream().distinct().filter((element)->l2.contains(element)).forEach(System.out::println);
		
		
		//reverse each word of string using java  
		
		String s="Kaviya Java Developer";
		
		String reversed=Arrays.stream(s.split(" ")).map(word->new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reversed);
		
		int summing=IntStream.range(0, 11).sum();
		System.out.println(summing+"sum of first 10 number");
		
		
		int[] numbers= {1,2,3,4,5};
		int[] result=
				IntStream
			.rangeClosed(1, numbers.length)
			.map((num)->numbers[numbers.length-num])
			.toArray();
		
		
		System.out.println(Arrays.toString(result));
		
		//even number 10
		
		IntStream.rangeClosed(1, 10).map(value->value*2).forEach(System.out::println);
		
		
	}
}
