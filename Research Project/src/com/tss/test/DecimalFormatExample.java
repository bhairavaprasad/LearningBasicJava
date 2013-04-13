package com.tss.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * If you want to display some numbers that is formatted to a certain pattern,
 * either in a Java Swing application or in a JSP file, you can utilize
 * NumberFormat and DecimalFormat class to give you the format that you want.
 * Here is a small example that will show you how to do it.
 */
public class DecimalFormatExample
{
	public static void main(String[] args)
	{
		// We have some millions money here that we'll format its look.
		double money = 100550000.75;
		
		// By default to toString() method of the Double data type will print
		// the money value using a scientific number format as it is greater
		// than 10^7 (10,000,000.00). To be able to display the number without
		// scientific number format we can use java.text.DecimalFormat which
		// is a sub class of java.text.NumberFormat.
		
		// Below we create a formatter with a pattern of #0.00. The # symbol
		// means any number but leading zero will not be displayed. The 0
		// symbol will display the remaining digit and will display as zero
		// if no digit is available.
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		// Print the number using scientific number format.
		System.out.println(money);
		
		// Print the number using our defined decimal format pattern as above.
		System.out.println(formatter.format(money));
	}
}
