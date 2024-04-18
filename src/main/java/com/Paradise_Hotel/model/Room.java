package com.Paradise_Hotel.model;
import java.util.ArrayList;
import java.util.List;




public class Room {
	 private int roomId;
     private String type;
     private int price ;
     private List<String> equipements = new ArrayList<>();
     private boolean available;
	 
     
     public Room(int roomId,String type, int price, List<String> equipements, boolean available) {
    	this.roomId = roomId;
    	this.type = type;
		this.price = price;
		this.equipements = equipements;
		this.available = available;
	}
     
     //Getters
     
     public int getroomId() {
 		return roomId;
 	}

	public String getType() {
		return type;
	}


	public int getPrice() {
		return price;
	}

	public List<String> getEquipements() {
		return equipements;
	}


	public boolean isAvailable() {
		return available;
	}
	
	
	//Setters
	
	public void setroomId(int roomId) {
		this.roomId = roomId;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setEquipements(List<String> equipements) {
		this.equipements = equipements;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

     
     
     
}
