package com.coding.java_8.revise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharactersString
{
	public static void main(String...args)
	{
		String input=" kaviya java K developer";
		input=input.replaceAll("\\s+","").toLowerCase();
		System.out.println(input);
		
		Map<String,Long> map=
				Arrays.stream(input.split(""))
			.collect(Collectors.groupingBy((element)->element,()->new LinkedHashMap<>(),Collectors.counting()));
	
	String nonRepeat=map.entrySet().stream().filter(entry->entry.getValue()==1)
			.map(entry->entry.getKey()).findFirst().get();
	System.out.println("First Non repeated "+nonRepeat);
	
	
	String repeat=map.entrySet().stream().filter(entry->entry.getValue()>1)
			.map(entry->entry.getKey()).findFirst().get();
	System.out.println("First repeated: "+repeat);
	
	
	List<String> name=Arrays.asList("One","2renna","5raina","three");
	name.stream().filter(word->Character.isDigit(word.charAt(0))).forEach(System.out::println);
	}

}
