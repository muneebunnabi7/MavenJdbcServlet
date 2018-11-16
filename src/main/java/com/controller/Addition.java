package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.jdbc;
import com.model.AdditionMembers;

/**
 * Servlet implementation class Addition
 */
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int number1 = Integer.parseInt(request.getParameter("no1"));
		int number2 = Integer.parseInt(request.getParameter("no2"));
		AdditionMembers add = new AdditionMembers();
		add.setNo1(number1 );
		add.setNo2(number2);
		jdbc j = new jdbc();
		int no=j.saveData(add);
		if(no>0)
		{
			System.out.println("data inserted");
		}
		else
		{
			System.out.println("not inserted");
		}
		
				
	}

}
