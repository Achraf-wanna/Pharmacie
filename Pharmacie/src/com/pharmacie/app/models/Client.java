package com.pharmacie.app.models;

public class Client extends Person{
	

	private int NbrOrder= 0;
	boolean fidele= false;
	
	
	public int getNbrOrder() {
		return NbrOrder;
	}
	public void setNbrOrder(int NbrOrder) {
		this.NbrOrder= NbrOrder;
	}
	
	public boolean getfidele() {
		return fidele;
	}
	public void setfidele(boolean fidele) {
		this.fidele= fidele;
	}
	
	public Client(int id, String firstName, String lastName,String email,int tel, boolean fidele, int NbrOrder) {
		super (id , firstName, lastName,email,tel);
		this.NbrOrder= NbrOrder;
		this.fidele= fidele;
	}
	
	public Client() {		
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Items purchased: " + NbrOrder + "\n Is loyal: " + fidele;
	}
	

	

}
