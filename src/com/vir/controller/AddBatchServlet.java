package com.vir.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addbatch")
public class AddBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddBatchServlet() {
        super();
      
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("hello");
		System.out.println(request.getParameter("cid"));
		System.out.println(request.getParameter("price"));
		System.out.println(request.getParameter("tid"));
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
