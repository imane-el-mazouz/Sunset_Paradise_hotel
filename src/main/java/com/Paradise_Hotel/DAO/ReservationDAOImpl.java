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

        try {
            connection = FactoryDAO.getConnection();
            String query = "INSERT INTO reservations (reserved_room, check_in_date, check_out_date, number_of_guests) VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setBoolean(1, reservation.isReservedRoom());
            statement.setDate(2, reservation.getCheckInDate());
            statement.setDate(3, reservation.getCheckOutDate());
            statement.setInt(4, reservation.getNumberofGuests());

            statement.executeUpdate();
            
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                reservation.setId(id);
            }
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
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
                boolean reservedRoom = resultSet.getBoolean("reserved_room");
                Date checkInDate = resultSet.getDate("check_in_date");
                Date checkOutDate = resultSet.getDate("check_out_date");
                int numberOfGuests = resultSet.getInt("number_of_guests");

                Reservation reservation = new Reservation(id, reservedRoom, checkInDate, checkOutDate, numberOfGuests);
                reservations.add(reservation);
            }
        } finally {
            if (resultSet != null) {
               
            }
        }
		return reservations;
    }
}