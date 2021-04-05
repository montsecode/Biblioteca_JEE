package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestorBibliotecaServlet
 */
@WebServlet("/GestorBibliotecaServlet")
public class GestorBibliotecaServlet extends HttpServlet {
	//*private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    //*public GestorBibliotecaServlet() {
      //*  super();
        // TODO Auto-generated constructor stub
	//*private boolean method = false;
	//*protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			//*boolean method)	
			throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");
	 try (PrintWriter out = response.getWriter()) {
		 out.println("<!DOCTYPE html>");
		 out.println("<html><head><title>Servlet NewServlet</title></head>");
		 out.println("<body>");
		 //*if(method) out.println("<h1> HOLA MUNDO GET</h1>");
		 out.println("<h1> HOLA MUNDO GET</h1>");
		 //*else		out.println("<h1> HOLA MUNDO POST</h1>");
		 out.println("<h1> HOLA MUNDO POST</h1>");
		//* out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
		 out.println("</body>");
		 out.println("</html>");
		 
		 
	//* }
    //*}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//*protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		//*	throws ServletException, IOException {
		// TODO Auto-generated method stub
	//*	method = true;
	//*	processRequest(request, response);
		//*response.getWriter().append("<h1>!! Hola Mundo GET !! </h1>");
	//*}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//*protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			//*throws ServletException, IOException {
		//*response.getWriter().append("<h1> !! Hola Mundo POST !! </h1>");
	//*	method = false;
	//*	processRequest(request, response);
		// TODO Auto-generated method stub
		
	}

}
