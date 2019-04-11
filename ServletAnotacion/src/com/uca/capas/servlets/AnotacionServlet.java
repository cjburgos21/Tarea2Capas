package com.uca.capas.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AnotacionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String user="Javier";
		String pass="112233";
		String usuarioparametro= request.getParameter("user");
		String contrasenaparametro = request.getParameter("pass");
		
		PrintWriter salida = response.getWriter();
		
		if(user.equals(usuarioparametro) && pass.equals(contrasenaparametro)) {
			salida.println("<html>");
			salida.println("<body>");
			salida.println("<h3>"+"Usted ha iniciado sesion "+"</h3>");
			salida.println("</body>");
			salida.println("</html>");
			
		}else {
			salida.println("<html>");
			salida.println("<body>");
			salida.println("<h3>"+"El usuario o contrasena esta erroneo"+"</h3>");
			salida.println("</body>");
			salida.println("</html>");
				
		}
		
	}

}
