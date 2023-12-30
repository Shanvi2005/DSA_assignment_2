package Solutions;
import java.util.*;
public class A2Q20
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			System.out.print("*");
			for (int j=1; j<=n-2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		System.out.print("*");
		for (int k=1; k<=n/2-1;k++)
		{
			System.out.print(" ");
		}
		System.out.print("*");
		for (int l=1; l<=n/2-1;l++)
		{
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		
		for(int m=1; m<=n/2-1;m++)
		 {
			System.out.print("*");
			for(int o=1;o<=(n-5)/2-m+1;o++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int p=1;p<=2*(m-1)+1;p++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int q=1;q<=(n-5)/2-m+1;q++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			System.out.println();
		 }
		System.out.print("*");
		for(int r=1;r<=n-2;r++)
		{
			System.out.print(" ");
		}
		System.out.print("*");
		
		
		
	}
}
