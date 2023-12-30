package Solutions;
import java.util.*;
public class A2Q17
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		if (n%2==0)
		{
			System.out.print("enter odd number");
		}
		else
		{   for(int j=1;j<=n/2;j++) 
		  {
			for(int i=1;i<=n/2;i++)
			{
				System.out.print("  ");
			}
			for (int k=1;k<=j;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		  }
		 for (int l=1;l<=n;l++)
		 {
			 System.out.print("* ");
		 }
		 System.out.println();
		 for (int u=1;u<=n/2;u++) {
		   for(int m=1;m<=n/2;m++)
			{
				System.out.print("  ");
			}
		   for(int h=1;h<=(n+1)/2-u;h++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
		 
		 }
		}
	}
}
