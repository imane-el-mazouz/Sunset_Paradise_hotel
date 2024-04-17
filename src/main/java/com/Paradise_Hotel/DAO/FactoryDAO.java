package com.Paradise_Hotel.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryDAO {
	public static String jdbcURL = "jdbc:mysql://localhost:3306/sunset_paradise_hotel";
    public static String jdbcUserName = "imane";
    public static String jdbcPassword = "1234";
    public static String jdbcDriver = "com.mysql.cj.jdbc.Driver";


    protected static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
