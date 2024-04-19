package com.Paradise_Hotel.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Paradise_Hotel.model.Reservation;

public class ReservationDAOImpl {


	    public void createReservation(Reservation reservation) throws SQLException {
	        Connection connection = null;
	        PreparedStatement statement = null;
	        ResultSet generatedKeys = null;

	        try {
	            connection = FactoryDAO.getConnection();
	            connection.setAutoCommit(false); 

	            String query = "INSERT INTO reservations (reserved_room, check_in_date, check_out_date, number_of_guests, roomId) VALUES (?, ?, ?, ?, ?)";
	            statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
	            statement.setBoolean(1, reservation.isReservedRoom());
	            statement.setDate(2, reservation.getCheckInDate());
	            statement.setDate(3, reservation.getCheckOutDate());
	            statement.setInt(4, reservation.getNumberofGuests());
	            statement.setInt(5, reservation.getroomId());

	            statement.executeUpdate();
	            
	            generatedKeys = statement.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                int id = generatedKeys.getInt(1);
	                reservation.setId(id);
	            }

	            connection.commit();
	        } catch (SQLException e) {
	            if (connection != null) {
	                connection.rollback(); 
	            }
	            throw e; 
	        } finally {
	            
	            if (generatedKeys != null) {
	                generatedKeys.close();
	            }
	            if (statement != null) {
	                statement.close();
	            }
	            if (connection != null) {
	                connection.setAutoCommit(true); 
	                connection.close();
	            }
	        }
	    }

	    public List<Reservation> getAllReservations() throws SQLException {
	        List<Reservation> reservations = new ArrayList<>();
	        Connection connection = null;
	        PreparedStatement statement = null;
	        ResultSet resultSet = null;

	        try {
	            connection = FactoryDAO.getConnection();
	            String query = "SELECT * FROM reservations";
	            statement = connection.prepareStatement(query);
	            resultSet = statement.executeQuery();

	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                boolean reservedRoom = resultSet.getBoolean("reservedRoom");
	                Date checkInDate = resultSet.getDate("checkInDate");
	                Date checkOutDate = resultSet.getDate("checkOutate");
	                int numberOfGuests = resultSet.getInt("numberofGuests");
	                int roomId = resultSet.getInt("roomId"); 

	                Reservation reservation = new Reservation(id, reservedRoom, checkInDate, checkOutDate, numberOfGuests, roomId);
	                reservations.add(reservation);
	            }
	        } finally {
	            if (resultSet != null) {
	                resultSet.close();
	            }
	            if (statement != null) {
	                statement.close();
	            }
	            if (connection != null) {
	                connection.close();
	            }
	        }
	        return reservations;
	    }
	}
