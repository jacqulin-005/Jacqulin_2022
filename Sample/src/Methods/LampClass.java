package Methods;

public class LampClass {
	static void turnon() {
		boolean isOn = true;
		System.out.println("Light on? " + isOn);
	
	}
	static void turnoff() {
		boolean isOn = false;
		System.out.println("Light on? " + isOn);
	}

	public static void main(String[] args) {
		
        LampClass led = new LampClass();
        LampClass halogen = new LampClass();

        led.turnon();
        halogen.turnoff();

	}

}
