package com.java19jsp06.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java19jsp06.service.ICategoryService;


@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet{
	@Inject
	private ICategoryService categoryService;
	
//	@Inject
//	private INewService newService;
//	

	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		String title = "bai viet 4";
//		String content = "bai viet 4";
//		Long categoryId = null;
//		NewModel newModel = new NewModel();
//		
//		newModel.setTitle(title);
//		newModel.setContent(content);
//		
//		newModel.setCategoryId(categoryId);
//		newService.save(newModel);
//				
 		
//		Long categoryId = 1L ;
//		
//		
//		req.setAttribute("news", newService.findByCategoryId(categoryId));
		req.setAttribute("categories", categoryService.findAll());
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
