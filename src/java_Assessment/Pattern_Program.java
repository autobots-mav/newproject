package java_Assessment;

import java.util.Scanner;

public class Pattern_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_Program ob= new Pattern_Program();
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a=='*'  || a=='#' || a=='!')
		{
			ob.pattern(a);
		}
		else
		{
			System.out.println("Enter Valid Character!!");
		}
		sc.close();
	}
	void pattern(char c)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}


