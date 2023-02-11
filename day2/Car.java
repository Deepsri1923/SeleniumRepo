package week1.day2;

public class Car {
	
	public static void main(String args[]) {
		
		// main method to invoke other methods from here..
		Car car = new Car();
		System.out.println("regNumber: " + car.getRegistrationNumber());
		System.out.println("regNumber: " + car.getOwnerName());
		System.out.println("Puncture Status: " + car.isPunctured());
		System.out.println("Subtrack Numbers: " + car.subNumbers());
		System.out.println("Multiply Numbers: " + car.multiplyNumbers());
		System.out.println("Divide Numbers: " + car.divideNumbers());

	}
	
	public int getRegistrationNumber() {	
		return 1234;
	}
	
	private String getOwnerName() {
		String ownerName = "Deepa Soma";
		return ownerName;
	}
	
	boolean isPunctured() {
		boolean punctureStatus = false;
		return punctureStatus;
	}
	
	public int subNumbers() {
		int a= 10;
		int b = 5;
		return a-b;
	}
	
	public int multiplyNumbers() {
		int a= 10;
		int b = 5;
		return a*b;
	}
	
	public float divideNumbers() {
		int a= 11;
		int b = 5;
		return a/b;
	}
}
