package Problem3;

import java.util.Scanner;

public class Ola {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <=3) {
			return new HatchBack(numberOfPassenger,numberOfKMs);
			
		}else {
			return new Sedan(numberOfPassenger,numberOfKMs);
		}
		
		
	}
	
	public int calculateBill(Car car) {
		if(car instanceof Sedan) {
			Sedan s = new Sedan();
			int x = s.farePerKm;
			int y =s.getNumberOfKms();
			int bill = x * y; 
			System.out.println(y);
			return bill;
		}else if(car instanceof HatchBack){
			HatchBack hb=new HatchBack();
			int x =hb.farePerKm;
			int bill = x *hb.getNumberOfKms();
			return bill;
		}else {
			return 1;
		}
		
		
	}
	
	public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number Of Passengers :");
		int nop = sc.nextInt();
		System.out.println("Enter Number of kMs : ");
		int nok = sc.nextInt();
		
		Ola o =new Ola();
		Car c = o.bookCar(nop, nok);
		
		int bill = o.calculateBill(c);
		System.out.println("The total fare amount is"+ bill);
	}
}
