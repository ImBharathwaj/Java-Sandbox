package OOP1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class strings {
	public static void strContains() {
		String str = "Java string contains()";
		boolean n = str.contains("Java");
		System.out.println(n);
	}
	
	public static void strSubString() {
		String str = "java is fun";
		System.out.println(str.substring(0, 4));
	}
	
	public static void strJoin() {
		String str1 = "I";
		String str2 = "Love";
		String str3 = "Computers";
		ArrayList<String> text = new ArrayList<String>();
		
		String result = String.join(" ", str1, str2, str3);
		text.add("Java");
		text.add("is");
		text.add("fun");
		
//		This didn't work properly
//		Raised an error
//		String result = String.join('-', text);
		System.out.println(result);
	}
	
	public static void strReplace() {
		String str = "bat ball";
		System.out.println(str.replace(" ball", "man"));
	}
	
	public static void strReplaceAll() {
		String str = "Java123is456Fun";
		String regex = "\\d+";
		
		System.out.println(str.replaceAll(regex, " "));
	}

	public static void strGetByte() {
		String str = "Java";
		byte[] byteArray;
		
		try {
			byteArray = str.getBytes("UTF-8");
			System.out.println(Arrays.toString(byteArray));
			
			byteArray = str.getBytes("UTF-16");
			System.out.println(Arrays.toString(byteArray));
			
			byteArray = str.getBytes("UTF-32");
			System.out.println(Arrays.toString(byteArray));
		}catch(Exception e) {
			System.out.println(e+" encoding is wrong");
		}
	}

	public static void strCompareToIgnoreCase() {
		String str = "Java is Fun";
		String str1 = "java is fun";
		System.out.println(str.compareToIgnoreCase(str1));
	}

	public static void strToCharArray() {
		String str = "Java is nothing";
		
		char[] a = str.toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	
	
	public static void main(String[] args) {
		strToCharArray();
	}
}
