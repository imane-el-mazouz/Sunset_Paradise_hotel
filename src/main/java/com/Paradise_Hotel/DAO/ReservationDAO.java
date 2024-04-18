package com.Paradise_Hotel.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Paradise_Hotel.model.Reservation;

public interface ReservationDAO {
    List<Reservation> getPreviousReservations(int userId) throws SQLException;

}
