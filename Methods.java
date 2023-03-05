package OOP1;

public class Methods {
	public int addNumbers(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public void display1() {
		System.out.println("Method without parameter");
	}
	
	public void display2(int a) {
		System.out.println("Method with a single parameter passed : "+a);
	}
	
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 15;
		
		Methods obj = new Methods();
		int result = obj.addNumbers(num1, num2);
		System.out.println("Sum is : "+result);
		
		obj.display1();
		obj.display2(10);
		System.out.println("Square root of 4 is : "+Math.sqrt(4));
	}
}
