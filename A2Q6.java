package Solutions;
import java.util.*;
public class A2Q6{
	public static void main(String[]args)
	{
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=1; j<=n+1-i;j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=2*i-1;k++)
			{
				System.out.print(" ");
			}
			for (int b=1; b<=n-i;b++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int m=1;m<=n-1;m++)
		{
			for ( int h =1; h<=m+1;h++)
			{
				System.out.print("*");
			}
			for (int g=1;g<=n-2*(m-1);g++)
			{
				System.out.print(" ");
			}
			for (int o=1; o<=m;o++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
