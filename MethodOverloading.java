package OOP1;

public class MethodOverloading {
	private static void display(int a) {
		System.out.println("Arguments: "+a);
	}
	
	private static void display(String a) {
		System.out.println("Arguments: "+a);
	}
	
	private static void display(int a, int b) {
		System.out.println("Arguments: "+a + " and "+b);
	}
	
	public static void main(String[] args) {
		display(10);
		display("Nothing");
		display(20, 30);
		
		HelpService HS = new HelpService();
		System.out.println(HS.formatNumber(500));
		System.out.println(HS.formatNumber(89.352));
		System.out.println(HS.formatNumber("550"));
	}
}

class HelpService{
	protected String formatNumber(int value) {
		return String.format("%d", value);
	}
	
	protected  String formatNumber(double value) {
		return String.format("%.3f", value);
	}
	
	protected String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}
	
}