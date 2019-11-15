package java_Assessment;

import java.util.Scanner;

public class Floyd_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_Program ob= new Pattern_Program();
		Scanner sc=new Scanner(System.in);
		int k=1;
		sc.close();
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}

	}

}
