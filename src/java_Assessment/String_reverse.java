package java_Assessment;

public class String_reverse {
	public static void main(String[] args) {
		char[] ch= {'m','a','v','e','r','i','c'};
		String str = new String(ch);
	    System.out.println(str);
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}

}
