package com.Paradise_Hotel.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Paradise_Hotel.model.Room;

public interface RoomDAO {

	List<Room> getAllRooms() throws SQLException;

}
