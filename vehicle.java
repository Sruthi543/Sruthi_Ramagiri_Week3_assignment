class  vehicle {
	void sart(){
		System.out.println("vehicle starts");
	}
	void accelerate(){
		System.out.println("vehicle accelerates");
	}
	void brake(){
		System.out.println("vehicle brakes");
	}
}
//Derived Class car
class Car extends Vehicle
{
	@override
		void start(){
		System.out.println("car starts with a key");
	} 
		void accelerate(){
		System.out.println("car accelerates quickly");
	}
	void honk(){
		System.out.println("car honks");
	}
}
class Bike extends Vehicle
{
	@override
		void accelerate(){
		System.out.println("Bike accelerates slowly");
	}
	@override
	    void ringBell(){
		System.out.println("Bike rings a Bells");
	}
}
public class Main {
	public static void main(String[] args){
		//polymorphism:vehicle refference can point to Car or Bike object
		Vehicle vehicle = new car();
		vehicle .start();
		vehicle.accelerate();
		vehicle .brake();
		vehicle =new Bike();
		vehicle.start();
		vehicle.accelerate();
		vehicle .brake();
		Car car=(car) vehicle;
		car.honk();
		Bike bike=(Bike) vehicle;
		bike.ringBell();
	}
}