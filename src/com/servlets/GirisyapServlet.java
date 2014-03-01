package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.*;
import com.objects.*;

@WebServlet("/user/signin")
public class GirisyapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		User user = new User();

		user.email = (String) request.getParameter("email");
		user.password = (String) request.getParameter("password");
		
		Boolean isAuth = new UserModel().authentication(user);
		PrintWriter yazici = response.getWriter();
		
		if(isAuth){
			yazici.write("Giriş başarılı");
		}else{
			yazici.write("Giriş başarısız");
		}
		
		
	}

}
