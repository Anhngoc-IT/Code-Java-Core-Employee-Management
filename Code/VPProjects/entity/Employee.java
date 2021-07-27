package entity;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private String address;
	private String phone;
	private Department department;
	private Date dOB;
	
	
	
	public Employee() {
		
	
	}
	
	
	public Employee(int id, String name, String address, String phone, Department department, Date dOB) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.department = department;
		this.dOB = dOB;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", department="
				+ department + ", dOB=" + dOB + "]";
	}

	

}