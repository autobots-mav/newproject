package javaassignment;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c=='*' ||c=='!' ||c=='#')
		{
			System.out.println();
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c);
			}
			System.out.println(" ");
		}
		
		}
		else
		{
			System.out.println("The character does not match");
		}
		
		
		

	}

}
