package com.xworkz.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.dao.RecipeDAO;
import com.xworkz.web.dto.RecipeDTO;

public class RecipeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RecipeController() {
		super();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String types = req.getParameter("types");
		int price = Integer.parseInt(req.getParameter("price"));

		RecipeDTO dto = new RecipeDTO();
		dto.setName(name);
		dto.setTypes(types);
		dto.setPrice(price);

		RecipeDAO dao = new RecipeDAO();
		boolean b = dao.save(dto);

		if (b == true) {
			req.setAttribute("dto1", dto);
			RequestDispatcher g = req.getRequestDispatcher("output.jsp");
			g.forward(req, resp);
		}

	}
}
