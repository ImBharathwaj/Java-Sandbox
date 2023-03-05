package OOP1;

public class Constructor {
	String language;
	
//	No-Arg constructor
	public Constructor() {
		// TODO Auto-generated constructor stub
		this.language = "Java";
	}
	
	public Constructor(String language) {
		this.language = language;
	}
	
	public void getName() {
		System.out.println("Programming Language: "+this.language);
	}
	
	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor("Python");
		
		obj1.getName();
		obj2.getName();
	}
}