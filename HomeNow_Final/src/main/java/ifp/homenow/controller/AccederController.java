package ifp.homenow.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ifp.homenow.utility.DataUtility;
import ifp.homenow.utility.ServletUtility;
import ifp.homenow.bean.UsuarioBean;
import ifp.homenow.model.UsuarioModel;

/**
 * Servlet implementation class AccederController
 */
@WebServlet(name = "AccederController", urlPatterns = { "/accederController" })
public class AccederController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccederController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = DataUtility.getString(request.getParameter("operation"));
		HttpSession session = request.getSession(false);
		if ("logout".equalsIgnoreCase(op)) {
			session.invalidate();
			ServletUtility.setSuccessMessage("Logout Sucessfully", request);

		}
		ServletUtility.forward(HomeNowView.acceder, request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		UsuarioBean user = new UsuarioBean();
		String login = request.getParameter("usuario");
		String pwd = request.getParameter("contrasena");
		HttpSession session = request.getSession(true);
		user = UsuarioModel.UserLogin(login, pwd);
		if (user != null) {
			session.setAttribute("userUsuario", user.getUsuario());
			session.setAttribute("userContrasena", user.getContrasena());
			session.setAttribute("userNombre", user.getNombre());
			session.setAttribute("userApellido1", user.getApellido1());
			session.setAttribute("userApellido2", user.getApellido2());
			session.setAttribute("userEdad", user.getEdad());
			session.setAttribute("userTelefono", user.getTelefono());
			session.setAttribute("userCorreo", user.getCorreo());
			
			
			ServletUtility.redirect(HomeNowView.index, request, response);
		} else {
			ServletUtility.setErrorMessage("Usuario no registrado", request);
			ServletUtility.forward(HomeNowView.acceder, request, response);
		}
		
	}
}
