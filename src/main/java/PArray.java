import java.util.Scanner;

public class PArray {

	public static void main(String[] args) {
		// Take input from user
		
		int a [] = new int [6]; //single dimention array with 6 elements
		
		Scanner scan = new Scanner (System.in);
		
		// Take input from user
		for(int i = 0; i<=5; i++) //loop iterates equal to the size of the array
		{
			System.out.print("Please enter the value on of " + i + " Element: ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("Array elements are: ");
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}

}
