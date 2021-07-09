package com.bridgelabz.algorithmprograms.guessnumber;

import java.util.Scanner;
public class GuessNumber 
{
	public static void main(String args[])
	{
		int minBound =0;
		int maxBound =1000;
		System.out.println("Think a number b/w 0 to 100");
		while(true)
		{
			int mid = (minBound+maxBound)/2;
			Scanner scanner = new Scanner(System.in);
			System.out.println("is "+mid+ " is the correct answer: True or False?");
			String isCorrect1 = scanner.next();
			if(isCorrect1 == "True")
			{
				System.out.println("The correct answer is "+mid);
				break;
			}
			else
			{
				System.out.println("is the number greater or less than "+mid + " Enter Greater or Less");
				String grtOrLess = scanner.next();
				scanner.close();
				if (grtOrLess == "Greater")
				{
					minBound = mid;
				}
				else
				{
					maxBound = mid;
				}
			}

		}
	}
}
