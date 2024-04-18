package com.Paradise_Hotel.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Paradise_Hotel.DAO.RoomDAOImpl;
import com.Paradise_Hotel.DAO.RoomDAO;
import com.Paradise_Hotel.model.Room;



@WebServlet("/SearchRoomsServlet")
public class SearchRoomsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RoomDAO roomDAO;
       
    public SearchRoomsServlet() {
        super();
        roomDAO = new RoomDAOImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            List<Room> availableRooms = roomDAO.getAvailableRooms();
            request.setAttribute("availableRooms", availableRooms);
            request.getRequestDispatcher("/WEB-INF/displayRooms.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect(""); 
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}


