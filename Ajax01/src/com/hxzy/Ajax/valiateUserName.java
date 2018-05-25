package com.hxzy.Ajax;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class valiateUserName
 */
@WebServlet("/valiateUserName")
public class valiateUserName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> list = Arrays.asList("AAA","BBB","CCC");
		String userName = request.getParameter("userName");
		String result = null;
		if(list.contains(userName)) {
			result="<font color='red'>该用户名已经被注册</font>";
		}else {
			result="<font color='green'>可以注册</font>";
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.getWriter().print(result);
	}

}
