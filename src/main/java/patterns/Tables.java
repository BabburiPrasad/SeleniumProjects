package patterns;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tables {
	
	public static int n;
	public static int m;
	public static int v;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Tables t = new Tables();
		t.table();

	}
	public void table()
	{
		System.out.print("Enter the n value: ");
		try {
			n = scan.nextInt();
			System.out.print("Enter the multiplier count: ");
			m = scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Enter the number of students values in numbers only: ");
			
		}
		
//		System.out.print("Enter the multiplier count: ");
//		m = scan.nextInt();
		
		for(int i = 1; i<= n; i++)
		{
			System.out.println(i + " table: ");
			for(int j = 1; j <= m; j++)
			{
				v = i * j;
				System.out.print(i+ "*" + j + "=" +v +"  ");
			}
			System.out.println();// new line
			System.out.println();// new line
		}
	}

}
