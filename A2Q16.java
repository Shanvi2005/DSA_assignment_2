package Solutions;

import java.util.Scanner;

public class A2Q16
{
	public static void main(String[]args)
{
	  Scanner scn = new Scanner(System.in);
	  int n = scn.nextInt();
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(j);
		  }
		  for (int k=1;k<=2*(n-i)-1;k++)
		  {
			  System.out.print(" ");
		  }
		  if(i<n)
		  {
			  for(int l=i;l>=1;l--)
			  {
				  System.out.print(l);
			  }
		  }
		  else
		  {
			  for (int m=i-1;m>=1;m--)
			  {
				  System.out.print(m);
			  }
		  }
		  System.out.println();
	  }
		
}
}
