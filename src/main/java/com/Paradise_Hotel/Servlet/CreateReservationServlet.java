package com.Paradise_Hotel.Servlet;

import java.io.IOException;
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
        response.sendRedirect("reservation.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        ReservationDAOImpl reservationDAO = new ReservationDAOImpl();
        try {
            Reservation reservation = new Reservation(userId, false, null, null, userId);
            reservationDAO.createReservation(reservation);
            response.sendRedirect("Reservation.jsp"); 
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("");
        }
    }

}


