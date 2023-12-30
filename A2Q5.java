package Solutions;
import java.util.*;
public class A2Q5{
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=(2*i -1);k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=1;l<=n-1;l++)
		{
			for(int m =1;m<=l;m++)
			{
				System.out.print(" ");
			}
			for(int p=1; p<=2*(n-l)-1;p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
