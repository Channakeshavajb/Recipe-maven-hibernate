package com.xworkz.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.dao.RecipeDAO;
import com.xworkz.web.dto.RecipeDTO;


public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchController() {
        super();

    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int id=Integer.parseInt(req.getParameter("id"));
    
   RecipeDAO dao=new RecipeDAO();
   RecipeDTO dto=dao.getById(id);
   
   if(dto != null) {
	  req.setAttribute("dto1", dto); 
	  RequestDispatcher rq=req.getRequestDispatcher("Search.jsp");
			  rq.forward(req, resp);
   }
    }

}
