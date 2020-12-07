package com.pharmacie.app.models;

public class Pharmacist extends Person {
	private String salary;
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary= salary;
	}
	
	public Pharmacist(int id, String firstName, String lastName,String email,int tel, String salary) {
		super (id , firstName, lastName,email,tel);
		this.salary= salary;
	}
	public Pharmacist() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Salary: " + salary;
	}

}
