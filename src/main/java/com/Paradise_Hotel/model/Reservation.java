package com.Paradise_Hotel.model;

import java.sql.Date;

public class Reservation {
    private int id;
    private boolean reservedRoom;
    private Date checkInDate;
    private Date checkOutDate;
    private int numberofGuests;
    private int roomId;
    
    
    

	public Reservation(int id, boolean reservedRoom, Date checkInDate, Date checkOutDate, int numberofGuests, int roomId) {
		this.id = id;
		this.reservedRoom = reservedRoom;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.numberofGuests = numberofGuests;
		this.roomId = roomId;
	}



	//Getters

	public int getId() {
		return id;
	}

	public boolean isReservedRoom() {
		return reservedRoom;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public int getNumberofGuests() {
		return numberofGuests;
	}
	
	public int getroomId() {
		return roomId;
	}
    //Setters

	public void setId(int id) {
		this.id = id;
	}

	public void setReservedRoom(boolean reservedRoom) {
		this.reservedRoom = reservedRoom;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	
    public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public void setNumberofGuests(int numberofGuests) {
		this.numberofGuests = numberofGuests;
	}
	
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
    
    
    
}
