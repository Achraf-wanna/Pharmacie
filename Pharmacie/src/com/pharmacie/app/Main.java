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
		
		//client has to choose
		
		while(true) {
			Scanner reader = new Scanner(System.in);
			Scanner reader2 = new Scanner(System.in);
			Scanner readerZ= new Scanner(System.in);
			System.out.print("1.  Clients. ");
			System.out.print("2.  Medicines. ");
			System.out.print("3.  Pharmacists. ");
			int choice = reader.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Add new client? (y/n) : ");
				char yn = reader.next().charAt(0);
				switch(yn) {
		 	  	case 'y':
		 		  while(yn=='y') {
		 			  System.out.print("Enter client id, firstname, lastname, Email,tel : ");
		 			  int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  String email = reader2.nextLine();
		 			  int tel = reader.nextInt();
		 			  int NbrOrder= 0;
		 			  boolean fidele= false;
		 			  Client newClient = new Client(id,firstName,lastName,email,tel,fidele,NbrOrder);
		 			  clientList.add(newClient);
		 			 
			    		  System.out.print("Add another client? y/n : ");
				    	  yn = reader.next().charAt(0);
			    	  }
		 		  break;
		 	  	case 'n':
		 		  break;
		 	  	}
				
				// clients list and check if it"s loyal:
				for(int i=0; i < clientList.size(); i++){
		 		    System.out.println(i+1 +"-"+ clientList.get(i));
		 		}
				System.out.print("Manage client number : ");
		 	  	int nbrElement = reader.nextInt();
		 	  	System.out.print("1. New Order. ");
		 	  	System.out.print("2. Edit client. ");
		 	  	System.out.print("3. Delete client. ");
		 	  	int choice2 = reader.nextInt();
		 	  	switch(choice2) {
		 	  	case 1:
		 	  		int newOrder = clientList.get(nbrElement-1).getNbrOrder();
		 	  		newOrder++;
		 	  		clientList.get(nbrElement-1).setNbrOrder(newOrder);
		 	  		if(newOrder>=3) {
		 	  			clientList.get(nbrElement-1).setfidele(true);
		 	  		}else {
		 	  			clientList.get(nbrElement-1).setfidele(false);
		 	  		}
		 	  		for(int i=0; i < clientList.size(); i++){
		    		    System.out.println(i+1 +"-"+ clientList.get(i));
	 			  }
		 	  		
		 	  		// add new client
		 	  		break;
		 	  	case 2:
		 	  		System.out.print("Enter new client id, firstname, lastname,Email,tel : ");
		 			  int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  String email = reader2.nextLine();
		 			  int tel = reader.nextInt();
		 			  int items= clientList.get(nbrElement-1).getNbrOrder();
		 			  boolean loyal= clientList.get(nbrElement-1).getfidele();
		 			 Client modification = new Client(id,firstName,lastName,email,tel,loyal,items);
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
		 	  	
		 	  	//Add new drug
				break;
			case 2:
				System.out.print("Add new medicine? (y/n) : ");
				yn = reader.next().charAt(0);
				switch(yn) {
		 	  	case 'y':
		 		  while(yn=='y') {
		 			  System.out.print("Enter medicine id, name, price : ");
		 			  int id= reader.nextInt();
		 			  String name= reader2.nextLine();
		 			 String des= reader2.nextLine();
		 			  double price= reader2.nextDouble();
		 			  Medicine newMedicine = new Medicine(id,name,des,price);
		 			  medicineList.add(newMedicine);
		 			 
			    		  System.out.print("Add another medicine? y/n : ");
				    	  yn = reader.next().charAt(0);
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
		 		  System.out.print("Do you want to edit/delete/help? (e/d/h) : ");
		 		  char pos = reader.next().charAt(0);
		 		  switch (pos) {
		 		  case 'e':
		 			  System.out.print("Enter new medicine id, name,des, price : ");
		 			  int id= reader.nextInt();
		 			  String name= readerZ.nextLine();
		 			  String des= readerZ.nextLine();
		 			  double price= reader2.nextDouble();
		 			 Medicine modification = new Medicine(id,name,des,price);
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
		 		  case 'h' :
		 			 System.out.print("here you can manage ( edit , delete ) a medecine .\n");
		 		  }
		 		  
		 		  //add pharmacist
				break;
			case 3:
				System.out.print("Add new pharmacist? (y/n/h) : ");
				yn = reader.next().charAt(0);
				switch(yn) {
		 	  	case 'y':
		 		  while(yn=='y') {
		 			  System.out.print("Enter pharmacist id, firstName, lastName,Email,Tel, salary : ");
		 			  int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  String email = reader2.nextLine();
		 			  int tel = reader.nextInt();
		 			  String salary= reader2.nextLine();
		 			  Pharmacist newPharmacist = new Pharmacist(id , firstName, lastName,email,tel,salary);
		 			  pharmacistList.add(newPharmacist);
		 			 
			    		  System.out.print("Add another pharmacist? y/n : ");
				    	  yn = reader.next().charAt(0);
			    	  }
		 		  break;
		 	  	case 'n':
		 		  break;
		 	   case 'h' :
		 			 System.out.print("here you can Add a new pharmacist .\n");
		 		  break;
		 		  
		 	  	}
				for(int i=0; i < pharmacistList.size(); i++){
		 		    System.out.println(i+1 +"-"+ pharmacistList.get(i));
		 		}
				System.out.print("Manage pharmacist number : ");
		 	  	nbrElement = reader.nextInt();
		 		  System.out.print("Do you want to (e/d/h) : ");
		 		   pos = reader.next().charAt(0);
		 		  switch (pos) {
		 		  case 'e':
		 			  System.out.print("Enter new pharmacist id, firstName, lastName,Email,Tel, salary : ");
		 			 int id= reader.nextInt();
		 			  String firstName= reader2.nextLine();
		 			  String lastName= reader2.nextLine();
		 			  String email = reader2.nextLine();
		 			  int tel = reader.nextInt();
		 			  String salary= reader2.nextLine();
		 			 Pharmacist modification =new Pharmacist(id , firstName, lastName,email,tel,salary);
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
		 		 case 'h' :
		 			 System.out.print("here you can ( edit , delete ) a pharmacist .\n");
		 		  break;
		 		  }
				break;
			}
			
		}
	}

}
