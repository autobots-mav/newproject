package sample;

import java.util.Scanner;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);   
		 char ch=in.next().charAt(0);
		 
		 if(ch=='*' || ch == '#' ||ch=='!')
		 {
         
		System.out.println("Enter the Character:");
		for (int i = 0; i <= 4 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
		in.close();
	}

	}
