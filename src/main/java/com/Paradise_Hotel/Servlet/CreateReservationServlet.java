package com.Paradise_Hotel.Servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Paradise_Hotel.model.Reservation;
import com.Paradise_Hotel.DAO.ReservationDAOImpl;

@WebServlet("/CreateReservationServlet")
public class CreateReservationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public CreateReservationServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParam = request.getParameter("id");
        String reservedRoomParam = request.getParameter("reservedRoom");
        String checkInDateParam = request.getParameter("checkInDate");
        String checkOutDateParam = request.getParameter("checkOutDate");
        String numberOfGuestsParam = request.getParameter("numberOfGuests");
        String roomIdParam = request.getParameter("roomId");

        if (idParam != null && reservedRoomParam != null && checkInDateParam != null && checkOutDateParam != null && numberOfGuestsParam != null && roomIdParam != null) {
            int id = Integer.parseInt(idParam); 
            boolean reservedRoom = Boolean.parseBoolean(reservedRoomParam); 
            Date checkInDate = Date.valueOf(checkInDateParam); 
            Date checkOutDate = Date.valueOf(checkOutDateParam); 
            int numberOfGuests = Integer.parseInt(numberOfGuestsParam); 
            int roomId = Integer.parseInt(roomIdParam); 

            Reservation reservation = new Reservation(id, reservedRoom, checkInDate, checkOutDate, numberOfGuests, roomId);
            ReservationDAOImpl reservationDAO = new ReservationDAOImpl();
            
            try {
                reservationDAO.createReservation(reservation);
                response.sendRedirect("/WEB-INF/Reservation.jsp");
            } catch (SQLException e) {
                e.printStackTrace();
                response.sendRedirect("");
            }
        } else {
            
            response.sendRedirect(""); 
        }
    }
}
