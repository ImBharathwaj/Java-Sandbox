package OOP1;

public class Lamp {
	boolean isOn = true;
	
	void turnOn() {
		isOn = true;
		System.out.println("Light is on? "+isOn);
	}
	
	void turnOff() {
		isOn = false;
		System.out.println("Light is on? "+isOn);
	}
}
