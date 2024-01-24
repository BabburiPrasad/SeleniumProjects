import java.util.Scanner;

public class ReverseSingleDimensionArray {

	public static void main(String[] args) {
		
		// Take input from user
		
		int a [] = new int [6]; //single dimention array with 6 elements
				
		Scanner scan = new Scanner (System.in);
		
		for(int i = 0; i<=5; i++) //iterates the loop with the size of array
        {
            System.out.print("Please enter the value on of " + i + " Element: ");
            
            a[i] = scan.nextInt();
            
            
        }
        
        System.out.println("Array elements are: ");
        
        for(int i = 0; i<a.length; i++)
        {
            //i = a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println(); // for new line
        System.out.println("Reverse of an array: ");
        
        // Print Reverse Array
        for(int i = a.length-1; i>=0; i--)
        {
            //i = a[i];
            System.out.print(a[i] + " ");
        }
        
	}

}
