package Vehicle;

import java.util.UUID;

public class TestVehicle implements VehicleInterface {
	
	public static void main(String[] args){
		
		Person person_a = new Person("Ethan","Connelly", UUID.randomUUID());
		
		Car car_1 = new Car("Jeep", "Black", 4000, person_a, 4);
		 
		Truck truck_1 = new Truck("Chevorlet", "Black", 6000, person_a, 2);
		
		Person person_b = new Person("Connor", "Palermo", UUID.randomUUID());
		
		Motorcycle motorcycle_1 = new Motorcycle("Sport", "Black", 700, person_a, false);
		
		car_1.transfer_ownership(person_b);
		
		
		
		
		
	}

}
