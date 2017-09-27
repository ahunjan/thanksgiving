package com.starbucks;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BiMap<? super String, ? super String> englishSpanishDictionary = 
				HashBiMap.<CharSequence, CharSequence>create();
		englishSpanishDictionary.put("World", "Mundo");
		englishSpanishDictionary.put("Hello", "Hola");
		englishSpanishDictionary.put("Yes", "Si");

		BiMap<? super String, ? super String> spanishEnglishDictionary = 
				englishSpanishDictionary.inverse();

		System.out.print(spanishEnglishDictionary.get("Hola"));
		System.out.print(" ");
		System.out.print(spanishEnglishDictionary.get("Mundo"));
		System.out.println();

		List<? extends Number> numbers = new ArrayList<Integer>();
		Number number = numbers.get(40);
		System.out.println(number);
	}
}
