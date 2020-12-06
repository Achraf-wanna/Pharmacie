package com.pharmacie.app;
import java.util.ArrayList;
import java.util.Scanner;
import com.pharmacie.app.models.Client;
import com.pharmacie.app.models.Medicine;
import com.pharmacie.app.models.Pharmacist;



public class Main {

	public static void main(String[] args) {
		ArrayList<Client> clientList= new ArrayList<Client>();
		ArrayList<Medicine> medicineList= new ArrayList<Medicine>();
		ArrayList<Pharmacist> pharmacistList= new ArrayList<Pharmacist>();
		
		while(true) {
			Scanner reader = new Scanner(System.in);
			Scanner reader2 = new Scanner(System.in);
			System.out.print("1. Manage Clients. ");
			System.out.print("2. Manage Medicines. ");
			System.out.print("3. Manage Pharmacists. ");
			int choice = reader.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Add new client? (y/n) : ");
				char yesno = reader.next().charAt(0);
				switch(yesno) {
		 	  	case 'y':
		 		  while(yesno=='y') {
		 			  System.out.print("Enter client id, firstname, lastname : ");
		 			  int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  int itemsPurchased= 0;
		 			  boolean isLoyal= false;
		 			  Client newClient = new Client(id,firstName,lastName,itemsPurchased,isLoyal);
		 			  clientList.add(newClient);
		 			 
			    		  System.out.print("Add another client? y/n : ");
				    	  yesno = reader.next().charAt(0);
			    	  }
		 		  break;
		 	  	case 'n':
		 		  break;
		 	  	}
				for(int i=0; i < clientList.size(); i++){
		 		    System.out.println(i+1 +"-"+ clientList.get(i));
		 		}
				System.out.print("Manage client number : ");
		 	  	int nbrElement = reader.nextInt();
		 	  	System.out.print("1. Client bought new item. ");
		 	  	System.out.print("2. Edit client. ");
		 	  	System.out.print("3. Delete client. ");
		 	  	int choice2 = reader.nextInt();
		 	  	switch(choice2) {
		 	  	case 1:
		 	  		int newItem = clientList.get(nbrElement-1).getItemsPurchased();
		 	  		newItem++;
		 	  		clientList.get(nbrElement-1).setItemsPurchased(newItem);
		 	  		if(newItem>=3) {
		 	  			clientList.get(nbrElement-1).setIsLoyal(true);
		 	  		}else {
		 	  			clientList.get(nbrElement-1).setIsLoyal(false);
		 	  		}
		 	  		for(int i=0; i < clientList.size(); i++){
		    		    System.out.println(i+1 +"-"+ clientList.get(i));
	 			  }
		 	  		break;
		 	  	case 2:
		 	  		System.out.print("Enter new client id, firstname, lastname : ");
		 			  int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  int items= clientList.get(nbrElement-1).getItemsPurchased();
		 			  boolean loyal= clientList.get(nbrElement-1).getIsLoyal();
		 			 Client modification = new Client(id,firstName,lastName,items,loyal);
		 			 clientList.set(nbrElement-1, modification);
		 			  for(int i=0; i < clientList.size(); i++){
			    		    System.out.println(i+1 +"-"+ clientList.get(i));
		 			  }
		 	  		break;
		 	  	case 3:
		 	  		clientList.remove(nbrElement-1);
		 			  for(int i=0; i < clientList.size(); i++){
			    		    System.out.println(i+1 +"-"+ clientList.get(i));
		 			  }
		 	  		break;
		 	  	}
				break;
			case 2:
				System.out.print("Add new medicine? (y/n) : ");
				yesno = reader.next().charAt(0);
				switch(yesno) {
		 	  	case 'y':
		 		  while(yesno=='y') {
		 			  System.out.print("Enter medicine id, name, price : ");
		 			  int id= reader.nextInt();
		 			  String name= reader2.nextLine();
		 			  double price= reader2.nextDouble();
		 			  Medicine newMedicine = new Medicine(id,name,price);
		 			  medicineList.add(newMedicine);
		 			 
			    		  System.out.print("Add another medicine? y/n : ");
				    	  yesno = reader.next().charAt(0);
			    	  }
		 		  break;
		 	  	case 'n':
		 		  break;
		 	  	}
				for(int i=0; i < medicineList.size(); i++){
		 		    System.out.println(i+1 +"-"+ medicineList.get(i));
		 		}
				System.out.print("Manage medicine number : ");
		 	  	nbrElement = reader.nextInt();
		 		  System.out.print("Do you want to edit/delete/? (e/d) : ");
		 		  char pos = reader.next().charAt(0);
		 		  switch (pos) {
		 		  case 'e':
		 			  System.out.print("Enter new medicine id, name, price : ");
		 			  int id= reader.nextInt();
		 			  String name= reader2.nextLine();
		 			  double price= reader2.nextDouble();
		 			 Medicine modification = new Medicine(id,name,price);
		 			 medicineList.set(nbrElement-1, modification);
		 			  for(int i=0; i < medicineList.size(); i++){
			    		    System.out.println(i+1 +"-"+ medicineList.get(i));
		 			  }
		 			  break;
		 		  case 'd':
		 			 medicineList.remove(nbrElement-1);
		 			  for(int i=0; i < medicineList.size(); i++){
			    		    System.out.println(i+1 +"-"+ medicineList.get(i));
		 			  }
		 			  break;
		 		  }
				break;
			case 3:
				System.out.print("Add new pharmacist? (y/n) : ");
				yesno = reader.next().charAt(0);
				switch(yesno) {
		 	  	case 'y':
		 		  while(yesno=='y') {
		 			  System.out.print("Enter pharmacist id, firstName, lastName, salary : ");
		 			  int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  String salary= reader2.nextLine();
		 			  Pharmacist newPharmacist = new Pharmacist(id,firstName,lastName,salary);
		 			  pharmacistList.add(newPharmacist);
		 			 
			    		  System.out.print("Add another pharmacist? y/n : ");
				    	  yesno = reader.next().charAt(0);
			    	  }
		 		  break;
		 	  	case 'n':
		 		  break;
		 	  	}
				for(int i=0; i < pharmacistList.size(); i++){
		 		    System.out.println(i+1 +"-"+ pharmacistList.get(i));
		 		}
				System.out.print("Manage pharmacist number : ");
		 	  	nbrElement = reader.nextInt();
		 		  System.out.print("Do you want to edit/delete/? (e/d) : ");
		 		   pos = reader.next().charAt(0);
		 		  switch (pos) {
		 		  case 'e':
		 			  System.out.print("Enter new pharmacist id, firstName, lastName, salary : ");
		 			 int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  String salary= reader2.nextLine();
		 			 Pharmacist modification = new Pharmacist(id,firstName,lastName,salary);
		 			 pharmacistList.set(nbrElement-1, modification);
		 			  for(int i=0; i < pharmacistList.size(); i++){
			    		    System.out.println(i+1 +"-"+ pharmacistList.get(i));
		 			  }
		 			  break;
		 		  case 'd':
		 			 pharmacistList.remove(nbrElement-1);
		 			  for(int i=0; i < pharmacistList.size(); i++){
			    		    System.out.println(i+1 +"-"+ pharmacistList.get(i));
		 			  }
		 			  break;
		 		  }
				break;
			}
			
		}
	}

}
