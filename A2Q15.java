package Solutions;
import java.util.*;
public class A2Q15
{
	public static void main (String[]args)
	{
	 Scanner scn= new Scanner(System.in);
	 int n = scn.nextInt();
	 for(int i=1; i<=n;i++)
	 {
		 for(int j=1;j<=n-i;j++)
		 {
			 System.out.print(" ");
		 }
		 for (int k=i;k<2*i;k++)
		 {
			System.out.print(k); 
		 }
		 
		 for (int l=2*i-2; l>=i;l--)
		 {
			 System.out.print(l);
		 }
		 System.out.println();
		 
		 
	 }
	 for(int m=1;m<=n-1;m++)
	 {
		 for(int g=1;g<=m;g++)
		 {
			 System.out.print(" ");
		 }
		 for(int f=n-m;f<=2*(n-m)-1;f++)
		 {
			 System.out.print(f);
		 }
		 if(2*(n-m)-2>0)
		 {for (int d=2*(n-m)-2;d>=n-m;d--)
		 {
			 System.out.print(d);
		 }}
		 System.out.println();
	 }
	 
	}
}
