package com.tss.test.fundamental;

/**
 * The remainder or modulus operator (%) let you get the remainder of a division
 * of a two numbers. This operator can be used to obtain a reminder of an
 * integer or floating point types.
 */
public class RemainderOperatorDemo
{
	public static void main(String[] args)
	{
		int a = 10;
		double b = 49;
		
		//
		// The reminder operator (%) gives your the remainder of
		// an integer or floating point division operation.
		//
		System.out.println("The result of " + a + " % 5 = " + (a % 5));
		System.out.println("The result of " + b + " % 9.5 = " + (b % 9.5));
	}
}
