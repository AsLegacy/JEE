package com.se.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet  {
	
	@Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
	      IOException {
	    HttpSession session = req.getSession();
	    session.invalidate();
	    resp.sendRedirect("familles");
	  }
	  @Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
	      IOException {
	    HttpSession session = req.getSession();
	    session.invalidate();
	    resp.sendRedirect("familles");
	  }

}
