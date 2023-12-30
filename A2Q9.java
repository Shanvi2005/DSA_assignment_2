package Solutions;
import java.util.*;
public class A2Q9
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		if(n%2==0)
		{
			System.out.print("enter odd number");
		}
		
		else
		{
		  for (int i =1;i<=(n+1)/2;i++)
				{
					for(int j =1;j<=i-1;j++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
					for(int k=1;k<=(n+1)/2-2*(i-1);k++)
					{
						System.out.print(" ");
					}
					if(i<(n+1)/2)
					{
						System.out.print("*");
					}
					
					System.out.println();
				}
		  for(int b=1;b<=n/2;b++)
		  {
			  for(int l=1;l<=n/2-b;l++)
			  {
				  System.out.print(" ");
			  }
			  System.out.print("*");
			  for(int c=1;c<=2*b-1;c++)
			  {
				  System.out.print(" ");
			  }
			  System.out.print("*");
			  System.out.println();
		  }
		  
		  
			
		}
	}
}
