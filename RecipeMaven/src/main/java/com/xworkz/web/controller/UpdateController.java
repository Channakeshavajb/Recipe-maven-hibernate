package com.xworkz.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.dao.RecipeDAO;
import com.xworkz.web.dto.RecipeDTO;

public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateController() {
		super();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String types = req.getParameter("types");
		int price = Integer.parseInt(req.getParameter("price"));

		System.out.println(types+name+id+price);
		
		
		RecipeDAO dao = new RecipeDAO();
		RecipeDTO dto=dao.updateById(id, name, types, price);
		
		
		  if(dto != null) {
			  req.setAttribute("dts", dto); 
			  RequestDispatcher rq=req.getRequestDispatcher("update.jsp");
		  rq.forward(req, resp);
		  }
		
	}

}
