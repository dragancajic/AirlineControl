package org.eu5.learn_pisio.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		System.out.println("First name: " + firstName);
		
		if (firstName.length() == 0) {
			System.out.println("empty first name error");
			request.setAttribute("errors", true);
			//request.getParameter("error");
			request.setAttribute("firstname_error", true);
		}
		
		String lastName = request.getParameter("last-name");
		System.out.println("Last name: " + lastName);
		
		if (lastName.length() == 0) {
			System.out.println("empty last name error");
			
			request.setAttribute("errors", true);
			request.setAttribute("lastname_error", true);
		}
		
		String dateOfBirthRaw = request.getParameter("dateOfBirth");
		String[] dateOfBirthArray = dateOfBirthRaw.split("\\/");
		System.out.println(Arrays.toString(dateOfBirthArray)); // e.g. [11, 21, 1978]
		/*
		String pattern = "^\\d(1,2)\\/\\d(1,2)\\/\\d(4)$";
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(dateOfBirthRaw);
		
		if (m.find()) {*/
			String month = dateOfBirthArray[0];
			String day = dateOfBirthArray[1];
			String year = dateOfBirthArray[2];
			
			Calendar calendar = Calendar.getInstance();
			
			//calendar.set(Calendar.MONTH, Integer.parseInt(month) - 1);
			//calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
			//calendar.set(Calendar.YEAR, Integer.parseInt(year));
			//System.out.println(calendar);
			
			calendar.set(Integer.parseInt(year), (Integer.parseInt(month) - 1), Integer.parseInt(day));
			
			Date dateOfBirth = calendar.getTime();
			System.out.println(
				calendar.get(Calendar.MONTH) + "/" +
				calendar.get(Calendar.DAY_OF_MONTH) + "/" + // from 0 to 11, e.g. 10 -> November
				calendar.get(Calendar.YEAR)
			);
			//System.out.println(calendar.get(Calendar.DATE)); // DAY_OF_MONTH, e.g. 21th of November
			
			System.out.println(dateOfBirth);/*
		} else {
			System.out.println("Invalid date of birth");
			request.setAttribute("errors", true);
			request.setAttribute("date_format_error", true);
		}*/
		
		String gender = request.getParameter("gender");
		System.out.println("Gender: " + gender);
	}

}
