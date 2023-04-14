package ifp.homenow.controller;
import ifp.homenow.bean.UsuarioBean;
import ifp.homenow.model.UsuarioModel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ifp.homenow.utility.DataUtility;
import ifp.homenow.utility.ServletUtility;

/**
 * Servlet implementation class RegistroController
 */
@WebServlet(name="RegistroController", urlPatterns={"/registroController"})
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher(HomeNowView.userRegistro);
		 * rd.forward(request, response);
		 */
		
		ServletUtility.forward(HomeNowView.userRegistro, request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioBean usuario= new UsuarioBean();
		
		usuario.setNombre(request.getParameter("nombre"));
		usuario.setApellido1(request.getParameter("apellido1"));
		usuario.setApellido2(request.getParameter("apellido2"));
		usuario.setFecha_nacimiento(DataUtility.getDate(request.getParameter("fecha_nacimiento")));
		usuario.setEdad(Integer.parseInt(request.getParameter("edad")));
		usuario.setUsuario(request.getParameter("usuario"));
		usuario.setContrasena(request.getParameter("contrasena"));
		usuario.setTelefono(Integer.parseInt(request.getParameter("telefono")));
		usuario.setCorreo(request.getParameter("correo"));
		
		long i=UsuarioModel.addUser(usuario);
		
		
		if(i>0) {
			ServletUtility.setSuccessMessage("Usuario registrado correctamente", request);
		}else {
			ServletUtility.setErrorMessage("Problema al registrar al usuario", request);
		}
		
		request.getRequestDispatcher("/jsp/userRegistro.jsp").forward(request, response);
	}

}
