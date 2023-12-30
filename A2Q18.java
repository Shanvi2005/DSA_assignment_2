package Solutions;
import java.util.*;
public class A2Q18
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for (int j=1;j<=n/2;j++)
		{
			for (int k=1;k<=j;k++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(n/2-j>0)
			{for (int l=1;l<=2*(n/2-j)-1;l++)
			{
				System.out.print(" ");
			}}
			if(n/2-j>0)
			{System.out.print("*");}
			
			System.out.println();
		}
		for(int u=1;u<=n/2-1;u++)
		{
			for(int a=1;a<=n/2-u;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=2*u+1;b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int c=1;c<=n;c++)
		{
			System.out.print("*");
		}
		
	}
}
