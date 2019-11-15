package sample;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'M', 'A', 'V', 'E', 'R', 'I', 'C'};
		String str=new String(ch);
		System.out.println(str);
		String rev="";
		for(int i= str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
