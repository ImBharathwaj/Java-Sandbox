package Test;

import java.util.Arrays;
import Test.arrayMethod;

public class test {
	public static void main(String[] args) {
		arrayMethod amd = new arrayMethod();
		
		int[] myArray = {1,2,3,4,5};
		amd.printFirstElement(myArray);
		
		int[] myArray2 = amd.returnArray();
		System.out.println(Arrays.toString(myArray2));
	}
}
