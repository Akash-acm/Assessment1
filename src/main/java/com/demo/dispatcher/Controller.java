package com.demo.dispatcher;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import collections.db.EmployeeMain;

@WebServlet("/")
public class Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getServletPath();
		System.out.println(url);
		
		switch(url) {
		case"/list":
			EmployeeMain a1=new EmployeeMain();
			List<String> list=a1.listEmployeeByCity("Pune");
			HttpSession session=req.getSession(true);
			session.setAttribute("data",list);
			req.getRequestDispatcher("emplist.jsp").forward(req, resp);
			break;
		default:
			resp.sendError(404);
			break;
		}
		
	}
}
