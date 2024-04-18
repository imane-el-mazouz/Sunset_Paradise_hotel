package com.Paradise_Hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Paradise_Hotel.model.Room;

public class RoomDAOImpl implements RoomDAO {

    @Override
    public List<Room> getAllRooms() throws SQLException {
        List<Room> rooms = new ArrayList<>();

        try (Connection connection = FactoryDAO.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM room");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int roomId = resultSet.getInt("roomId");
                String type = resultSet.getString("type");
                int price = resultSet.getInt("price");
                String[] equipementsArray = resultSet.getString("equipements").split(",");
                List<String> equipements = new ArrayList<>();
                for (String equipement : equipementsArray) {
                    equipements.add(equipement);
                }
                boolean available = resultSet.getBoolean("available");

                Room room = new Room(roomId, type, price, equipements, available);
                rooms.add(room);
            }
        } catch (SQLException e) {
            throw e;
        }

        return rooms;
    }

    @Override
    public List<Room> getAvailableRooms() throws SQLException {
        List<Room> availableRooms = new ArrayList<>();

        try (Connection connection = FactoryDAO.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM room WHERE available = true");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int roomId = resultSet.getInt("roomId");
                String type = resultSet.getString("type");
                int price = resultSet.getInt("price");
                String[] equipementsArray = resultSet.getString("equipements").split(",");
                List<String> equipements = new ArrayList<>();
                for (String equipement : equipementsArray) {
                    equipements.add(equipement);
                }
                boolean available = resultSet.getBoolean("available");

                Room room = new Room(roomId, type, price, equipements, available);
                availableRooms.add(room);
            }
        } catch (SQLException e) {
            throw e;
        }

        return availableRooms;
    }
}
