package Vehicle;

public class Car extends Vehicle implements VehicleInterface{
	
	private int door_number;
	
	public Car(String name, String color, double weight, Person owner, int door_number){
		super(name, color, weight, owner);
		this.door_number = door_number;
	}

	public int getDoor_number() {
		return door_number;
	}

	public void setDoor_number(int door_number) {
		this.door_number = door_number;
	}

}
