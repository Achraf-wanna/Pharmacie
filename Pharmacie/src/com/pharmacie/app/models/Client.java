package com.pharmacie.app.models;

public class Client extends Person{
	

	private int itemsPurchased= 0;
	boolean isLoyal= false;
	
	
	public int getItemsPurchased() {
		return itemsPurchased;
	}
	public void setItemsPurchased(int itemsPurchased) {
		this.itemsPurchased= itemsPurchased;
	}
	
	public boolean getIsLoyal() {
		return isLoyal;
	}
	public void setIsLoyal(boolean isLoyal) {
		this.isLoyal= isLoyal;
	}
	
	public Client(int id, String firstName, String lastName, int itemsPurchased, boolean isLoyal) {
		super (id , firstName, lastName);
		this.itemsPurchased= itemsPurchased;
		this.isLoyal= isLoyal;
	}
	
	public Client() {		
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Items purchased: " + itemsPurchased + "\n Is loyal: " + isLoyal;
	}
	

	

}
