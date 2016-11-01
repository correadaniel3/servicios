package co.edu.udea.iw.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PruebaServlet
 */
//@WebServlet(description = "Correr pruebas para el manejo de web services", urlPatterns = { "/PruebaServlet" })
public class PruebaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append(request.getParameter("nombre"))
		.append(" ").append(request.getParameter("apellido"));
		/**
		 * Tambien se puede llamar a la ruta jsp por medio de su raiz localhost:8080/WebServicesExample/
		 */
		response.sendRedirect("../Pages/Prueba.jsp");
	}

}
