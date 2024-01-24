package patterns;

import java.util.Scanner;

public class triangle {
	public static int n;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		triangle patter = new triangle();
		
		patter.pattern1();
		patter.pattern2();
		patter.pattern3();
		patter.pattern4();
		patter.pattern5();
		patter.pattern6();
		patter.pattern7();
		
	}
	
	public void pattern1()
	{
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * *
		System.out.println("Enter required rows count: ");

		n = scan.nextInt();
		System.out.println("1st pattern: ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
	}
	
	public void pattern2()
	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter required rows count: ");
//		
//		n = scan.nextInt();
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		System.out.println("2nd pattern start: ");
		
		for(int i = n; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();// new line
	}
	
	public void pattern3()
	{
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		System.out.println(); // new line
		System.out.println("3rd Pattern: ");
		
		for (int i = 1; i <= n; i++) //for printing 1st part of the pattern from 1 to 5
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 0; i--) // for printing 2nd part of the pattern from 4 to 1
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
	}
		System.out.println(); // new line
	
	}
	public void pattern4()
	{
		System.out.println("4th Pattern: ");
		
//	      *
//	     **
//	    ***
//	   ****
//	  *****
//	 ******
		for (int i = 1; i <= n; i++) //for printing 1st part of the pattern from 1 to 5
		{
			for (int j = n-i; j >= 1; j--) 
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern5()
	{
		System.out.println();// new line
		System.out.println("5th Pattern: ");
		
//		1 1 1 1 1 * 
//		2 2 2 2 * * 
//		3 3 3 * * * 
//		4 4 * * * * 
//		5 * * * * * 
//		* * * * * *
		
		for (int i = 1; i <= n; i++) //for printing 1st part of the pattern from 1 to n
		{
			for (int j = n-i; j >= 1; j--) 
			{
				System.out.print(i + " ");
			}
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	public void pattern6()
	{
		System.out.println("6th pattern: ");
//		******
//		 *****
//		  ****
//		   ***
//		    **
//		     *
		for (int i = n; i >= 1; i--) //for printing 1st part of the pattern from 1 to n
		{
			for (int j = n; j >i; j--) 
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();// new line
	}
	
	public void pattern7()
	{
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
//		16 17 18 19 20 21
		
		int k = 1;
		for (int i = 1; i <= n; i++) //for printing 1st part of the pattern from 1 to n
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
