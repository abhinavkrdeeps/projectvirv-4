package com.vir.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.dao.BatchDAOImpl;
import com.vir.dao.BatchDao;
import com.vir.model.Batch;


@WebServlet("/batch1")
public class BatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Batch> al=new ArrayList<>();
       
  
    public BatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("hello");
			System.out.println(request.getParameter("cid"));
			System.out.println(request.getParameter("price"));
			System.out.println(request.getParameter("tid"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		System.out.println(request.getParameter("cid"));
//		System.out.println(request.getParameter("startdate"));
//		System.out.println(request.getParameter("enddate"));
//		System.out.println(request.getParameter("price"));
//		System.out.println(request.getParameter("tid"));
		//System.out.println(request.getParameter("cid"));
		
		
		//Integer cid = Integer.parseInt(request.getParameter("cid"));
		Integer courseId = Integer.parseInt(request.getParameter("cid"));
		System.out.println("cid "+ courseId);
		
		Date startDat = Date.valueOf(request.getParameter("startdate"));
		System.out.println("date "+ startDat);
		Date endDate = Date.valueOf(request.getParameter("enddate"));
		System.out.println("end "+ endDate);
		double price  = Double.parseDouble(request.getParameter("price"));
		System.out.println("price "+ price);
		Integer trainerID = Integer.parseInt(request.getParameter("tid"));
		System.out.println("tid "+ trainerID);
		Batch batch = new Batch();
		batch.setCourseID(courseId);
		batch.setStartDate(startDat);
		batch.setEndDate(endDate);
		batch.setPrice(price);
		batch.setTrainerId(batch.getTrainerId());
		BatchDao bdao=(BatchDao) new BatchDAOImpl();
		boolean expected =bdao.addBatch(batch);
	//	boolean expected =false;
		if(expected)
		{
			request.getRequestDispatcher("/admin.jsp").forward(request, response);
		}else {
			request.setAttribute("message","Not Added..Try Again");
			request.getRequestDispatcher("/newbatch.jsp").forward(request, response);;
		}
		
		
			
	}
	
}
