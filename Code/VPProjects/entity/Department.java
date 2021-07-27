package entity;

public class Department {

	private int id;
	private String name;

	
	public Department() {
		
	}
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return this.id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}