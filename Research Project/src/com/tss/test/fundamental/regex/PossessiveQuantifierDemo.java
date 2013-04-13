package com.tss.test.fundamental.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The possessive quantifiers always eat the entire input string, trying once
 * (and only once) for a match. Unlike the greedy quantifiers, possessive
 * quantifiers never back off, even if doing so would allow the overall match to
 * succeed.
 */
public class PossessiveQuantifierDemo
{
	public static void main(String[] args)
	{
		String[] regexs = { "x?+", "x*+", "x++", "x{2}+", "x{2,}+", "x{2,5}+" };
		String input = "xxxxxxx";
		
		for (String r : regexs)
		{
			Pattern pattern = Pattern.compile(r);
			Matcher matcher = pattern.matcher(input);
			
			//
			// Find every match and print it
			//
			System.out.println("------------------------------");
			System.out.format("Regex:  %s %n", r);
			while (matcher.find())
			{
				System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());
			}
		}
	}
}
