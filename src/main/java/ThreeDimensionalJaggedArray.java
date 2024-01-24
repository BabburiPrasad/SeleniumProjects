import java.util.Scanner;

public class ThreeDimensionalJaggedArray {

	public static void main(String[] args) {
		// Three Dimensional Jagged Array
		
		int j[][][] = new int[2][][];
		
		j[0] = new int[2][];
		j[1] = new int[3][];
		
		j[0][0] = new int[4];
		j[0][1] = new int[5];
		
		j[1][0] = new int[2];
		j[1][1] = new int[3];
		j[1][2] = new int[6];
		
		Scanner scan = new Scanner(System.in);
		// For loop to take input from user and store it in array
		for(int i = 0; i<=j.length-1; i++)
		{
			for(int k = 0; k<=j[i].length-1; k++)
			{
				for(int l = 0; l<=j[i][k].length-1; l++)
				{
					System.out.print("Enter the marks of School " +i+ " Class " +k+ " Student " +l+ " :");
					j[i][k][l] = scan.nextInt();
				}
			}
		}
		
		// for loop to print the elements of 3 dimensional jagged array
		for(int i = 0; i<=j.length-1; i++)
		{
			for(int k = 0; k<=j[i].length-1; k++)
			{
				System.out.println("Students Marks of School" +i+ " Class" +k+ " :");
				for(int l = 0; l<=j[i][k].length-1; l++)
				{
					System.out.print(j[i][k][l] + " ");
				}
				System.out.println();
			}
		}
	}

}
