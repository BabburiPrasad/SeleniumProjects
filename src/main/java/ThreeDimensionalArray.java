import java.util.Scanner;

public class ThreeDimensionalArray {
	// Three dimensional regular array
	public static void main(String[] args) {
		
		int t[][][] = new int [2][3][2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<=t.length-1; i++)
		{
			for(int j = 0; j<=t[i].length-1; j++)
			{
				for(int k = 0; k<=t[i][j].length-1; k++)
				{
					System.out.print("Enter the marks of School " +i+ " Class " +j+ " Student" +k + ": ");
					
					t[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i = 0; i<=t.length-1; i++)
		{
			for(int j = 0; j<=t[i].length-1; j++)
			{
				System.out.println("Marks of School " +i+ " Class" +j+ " Marks: ");
				for(int k = 0; k<=t[i][j].length-1; k++)
				{
					System.out.print(t[i][j][k] + " ");
					
				}
				System.out.println();
			}
		}

	}

}
