package com.jpa.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorEmpleado
 */
public class ControladorEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEmpleado() {
        super();
        // TODO Auto-generated constructor stub
<<<<<<< HEAD
    }  //fin del constructor....
=======
    } //Fin del constructor
>>>>>>> cbf14af0e3ae6b332c057c9906d65671a7dc0194

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
<<<<<<< HEAD
	} //fin del metodo doget...
=======
	} //Fin del metodo doGet
>>>>>>> cbf14af0e3ae6b332c057c9906d65671a7dc0194

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
<<<<<<< HEAD
	} //fin del metodo dopost...

} //fin de la clase...
=======
	}	//Fin del metodo doPost

}
>>>>>>> cbf14af0e3ae6b332c057c9906d65671a7dc0194
