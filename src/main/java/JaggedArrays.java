import java.util.Scanner;

public class JaggedArrays {

	public static void main(String[] args) {
		
		//Jagged Array
		
		int j[][] = new int [3][];
		
		j[0] = new int[4];
		j[1] = new int[3];
		j[2] = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<=j.length-1; i++)
		{
			for(int k =0; k<=j[i].length-1; k++)
			{
				System.out.print("Enter the marks of class " + i + " Student " +k +": "); // take input from user
				j[i][k] = scan.nextInt(); // assigns input to the particular element
			}
		}
		
		// Print Jagged Array elements
		
		System.out.println("Marks of studens are: ");
		for(int i = 0; i<=j.length-1; i++)
		{
			System.out.println("Marks of Class " + i);
			for(int k = 0; k<=j[i].length-1; k++)
			{
				System.out.print( j[i][k] + " ");
			}
			System.out.println(); //new line for each class
		}
		
		

	}

}
