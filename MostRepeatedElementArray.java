package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostRepeatedElementArray
{
	public static void main(String...args)
	{
		//most frequent element in list:
		
		List<String> list=Arrays.asList("pen","pencil","banana","pen");
		
		Map<String,Long> map=
				list.stream()
				.collect(Collectors.groupingBy(word->word,Collectors.counting()));
		
		Entry<String,Long> most=map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(most.getKey());
		
		System.out.println(most.getValue());
		
		
		//palindrome using java 8
		
		String s="MALAYALAM";
		//4--0 1 2 3
		//
		boolean isPalindrome=IntStream.range(0, s.length()/2).
				noneMatch(letter->s.charAt(letter)!=s.charAt(s.length()-letter-1));
	
		System.out.println('m'!='m');
		
		if(isPalindrome)
		{
			System.out.println(s+ " is a palindrome ");
		}
		else
			System.out.println(s+" not a palindrome");
		
		
		
		
	}

}
