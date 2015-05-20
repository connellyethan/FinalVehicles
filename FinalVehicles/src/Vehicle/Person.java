package Vehicle;

import java.util.UUID;

public class Person {
	
	private String first_name;
	private String last_name;
	private UUID person_id;
	
	public Person(String first_name, String last_name, UUID person_id){
		this.first_name = first_name;
		this.last_name = last_name;
		this.person_id = person_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public UUID getPerson_id() {
		return person_id;
	}

	public void setPerson_id(UUID person_id) {
		this.person_id = person_id;
	}
	
	

}
