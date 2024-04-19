package com.Paradise_Hotel.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Paradise_Hotel.DAO.ReservationDAOImpl;
import com.Paradise_Hotel.model.Reservation;


@WebServlet("/GetPreviousReservations")
public class GetPreviousReservations extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public GetPreviousReservations() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ReservationDAOImpl reservationDAO = new ReservationDAOImpl();
        try {
            List<Reservation> previousReservations = reservationDAO.getAllReservations();
            request.setAttribute("previousReservations", previousReservations);
            request.getRequestDispatcher("/WEB-INF/previous_reservations.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
