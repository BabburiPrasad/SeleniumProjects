import java.util.Scanner;
public class ReverseaAndStoreinNewArray {

	public static void main(String[] args) {
		
		int a[] = new int[6];
		int r[] = new int[6];
        
        // Taking array elements input from user
        Scanner scan = new Scanner(System.in);
        
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
        
        // Print the array elements
        for(int i = a.length-1; i>0; i--)
        {
            r[i] = a[i];
            System.out.print(r[i] + " ");
        }

	}

}
