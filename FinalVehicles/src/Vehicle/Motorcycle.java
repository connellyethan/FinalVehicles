package Vehicle;

public class Motorcycle extends Vehicle implements VehicleInterface{
	
	private Boolean has_side_car;
	
	public Motorcycle(String name, String color, double weight, Person owner, Boolean has_side_car){
		super(name, color, weight, owner);
		this.has_side_car = has_side_car;
	}

	public Boolean getHas_side_car() {
		return has_side_car;
	}

	public void setHas_side_car(Boolean has_side_car) {
		this.has_side_car = has_side_car;
	}

}
