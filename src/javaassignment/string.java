package javaassignment;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse="" ;
		char ch[]= {'m','a','v','e','r','i','c'};
		String s=new String(ch);
		int Stringlength = s.length();
		for(int i=Stringlength-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
