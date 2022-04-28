package praticalfile;
import java.util.Scanner;
public class Various_StringFunction {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str1="MCA";
		String str2="2nd sem";
		System.out.println("String1 = "+str1);
		System.out.println("String2 = "+str2);
		//lower case and upper case
		
		
		String str4=str1.toLowerCase();
		String str5=str2.toUpperCase();
		System.out.println("String1 to lower case = "+str4);
		System.out.println("String1 to upper case = "+str5);
		
		//comparing methods
		boolean b=str1.equals(str2);
		
		System.out.println("String 1 and String 2 is equal? "+ b);
		
		//find length of string
		int length=str1.length();
		System.out.println("Length of string1 = "+ length);
		
		//find character at index
		char c=str1.charAt(2);
		System.out.println("character of 2index of string1  ="+c);
		
		///string concatenation
		String str3= str1.concat(str2);
		System.out.println("Join two strings = "+str3);
		
		///contains methods
		
		boolean b2=str3.contains("MCA");
		System.out.println("string 3  is contains MCA? "+b2);
	}

}
