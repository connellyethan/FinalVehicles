package Vehicle;

public class Truck extends Vehicle implements VehicleInterface{
	
	private int axel_number;
	
	public Truck(String name, String color, double weight, Person owner, int axel_number){
		super(name, color, weight, owner);
		this.axel_number = axel_number;
	}

	public int getAxel_number() {
		return axel_number;
	}

	public void setAxel_number(int axel_number) {
		this.axel_number = axel_number;
	}

}
