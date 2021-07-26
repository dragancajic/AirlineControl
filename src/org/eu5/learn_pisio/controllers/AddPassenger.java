package org.eu5.learn_pisio.controllers;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPassenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// JSP is acting as view page and servlet will route HTTP response to JSP!
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/AddPassenger.jsp");
				
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// in doPost() method we can process the form submission
		
		// get parameter(s)
		String firstName = request.getParameter("first-name");
		System.out.println("firstName: " + firstName);
		
		String lastName = request.getParameter("last-name");
		System.out.println("lastName: " + lastName);
		
		String dateOfBirthRaw = request.getParameter("dateOfBirth");
		String[] dateOfBirthArray = dateOfBirthRaw.split("\\/");
		
		String month = dateOfBirthArray[0];
		String day = dateOfBirthArray[1];
		String year = dateOfBirthArray[2];
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.MONTH, Integer.parseInt(month));
		calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
		calendar.set(Calendar.YEAR, Integer.parseInt(year));
		
		Date dateOfBirth = calendar.getTime();
		
		String gender = request.getParameter("gender");
		System.out.println("gender: " + gender);
	}

}
