import java.util.Scanner;

public class TwoDimensionalRegularArray 
{

	public static void main(String[] args) 
	{
		
		int a[][] = new int[3][6];
        
        // Taking array elements input from user
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i<=a.length-1; i++) //iterates the loop with the size of array
        {
            for(int j = 0; j<=a[i].length-1; j++)
            {
                System.out.print("Enter the marks of class: " +i + " Student" +j+ " ");
                a[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Marks of students: ");
        for(int i =0; i<=a.length-1; i++)
        {
            for(int j = 0; j<=a[i].length-1; j++)
            {
                System.out.print("The marks of class: " +i+"Student " +j);
                System.out.println(a[i][j]+ " ");
            }
            
        }
        

	}
}
	
	
