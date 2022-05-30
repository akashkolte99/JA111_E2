package Problem3;

public class Car {
	private int numberOfPassenger ;
	private int numberOfKms;
	public Car(int nop,int nok) {
		this.numberOfPassenger = nop;
		this.numberOfKms=nok;
	}
	public Car() {
		
	}
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int number) {
		this.numberOfKms = number;
	}
	
	
}
