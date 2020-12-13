package com.pharmacie.app.models;

import java.util.ArrayList;

public class Medicine {
	private int id;
	private String name;
	private String des;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price= price;
	}
	
	public Medicine(int id, String name, String des,double price) {
		this.id= id;
		this.name= name;
		this.des= des;
		this.price= price;
	}
	public Medicine() {
	
	}
	
	@Override
	public String toString() {
		return " ID: " + id + "\n Name: " + name + "\n une petite description: " + des + "\n Price: " + price;
	}
	
public String addPerson(ArrayList<Medicine> medicineList, Medicine medicine) {
	try {
		medicineList.add(medicine);
		return "medicine Added";
		
	}catch(Exception ex) {
		return ex.getMessage();
		
	}
		
	}
    
    
    
    public String editPerson(ArrayList<Medicine> medicineList, Medicine medicine, int index) {
		try {
			
			medicineList.set(index, medicine);
			return "medicine Edited !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}

}
