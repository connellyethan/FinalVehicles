package Vehicle;

public abstract class Vehicle {
	
	private String name;
	private String color;
	private double weight;
	private Person owner;
	
	public Vehicle(String name, String color, double weight, Person owner){
		this.name = name;
		this.color = color;
		this. weight = weight;
		this.owner = owner;
	}

	public void transfer_ownership(Person owner2){
		this.owner = owner2;
	}
}
