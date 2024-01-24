import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();
        
     // Consume the newline character left in the buffer
        scanner.nextLine();
        
     // Create an array to store characters
        char[] charArray = new char[n];
        
     // System.out.print("Enter the characters: ");
        for (int i = 0; i < n; i++) {
        	System.out.print("Enter the characters: ");
            charArray[i] = scanner.nextLine().charAt(0);
        }
     // Now you have the character array (charArray) to work with

     // Print the characters in the array
        
        System.out.print("Characters in the array: ");
        for (int i = 0; i < n; i++) {
        	System.out.print(charArray[i] + " ");
        }
        
     // Close the scanner
        scanner.close();
	}

}
