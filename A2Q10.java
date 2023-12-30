package Solutions;
import java.util.*;
public class A2Q10
{
	public static void main (String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<=2*(i-1)-1;k++)
			{
				System.out.print(" ");
			}
			if(i>1)
			{
				System.out.print("*");	
			}
			
			System.out.println();
			
		}
		for(int a=1;a<n;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int c=1;c<=2*(n-a)-3;c++)
			{
				System.out.print(" ");
			}
			if(a<n-1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
