package com.hearthealth.run.account;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		/* check a user is admin or simple user.if admin,dispatch to the admin homepage
		   ,otherwise dispatch to a simple user homepage. */
		 if(UserManager.isAdmin(username)){
			 if(UserManager.isAdminValid(username,password)){
				 dispatchToAdminPage(request,response);
			 }
			 else{
				 dispatchToLoginFailurePage(request,response);
			 }
		 }
		 else{
			 dispatchToUserPage(request,response);
		 }
		 
	}
	
	/**
	 * When the login user is admin role,dispatch to the admin page.
	 */
	private void dispatchToAdminPage(HttpServletRequest request,HttpServletResponse response){
		try {
			request.getRequestDispatcher("/pages/account/homepage_admin.jsp").forward(request,response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * When the login user is simple user,dispatch to the user page.
	 */
	private void dispatchToUserPage(HttpServletRequest request,HttpServletResponse response){
		try {
			try {
				request.getRequestDispatcher("/pages/account/homepage_user.jsp").forward(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * when the login user is invalid,dispatch to a login failure page.
	 */
	private void dispatchToLoginFailurePage(HttpServletRequest request,HttpServletResponse response){
		try {
			request.getRequestDispatcher("/pages/account/loginFailure.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	

	
	
	
	/**
	 * Wrap the success result info which reponse to the requester.
	 *
	 */
	private void wrapSuccessResult(PrintWriter out){
		out
		.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    User login success!");
		out.println("  </BODY>");
		out.println("</HTML>");
	}
	
	/**
	 * Wrap the failure result info which reponse to the requester.
	 *
	 */
	private void wrapFailureResult(PrintWriter out){
		out
		.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print(" User login fail.");
		out.println("  </BODY>");
		out.println("</HTML>");
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
