package ifp.homenow.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher(HomeNowView.accceder);
		 * rd.forward(request, response);
		 */
		ServletUtility.forward(HomeNowView.accceder, request, response);
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
		HttpSession session=request.getSession(true);
		user = UsuarioModel.UserLogin(login, pwd);
		if (user != null) {

			//Set attribute for session
			session.setAttribute("user", user.getUsuario());
			ServletUtility.redirect(HomeNowView.bienvenidaController, request, response);
		} else {
			ServletUtility.setErrorMessage("Usuario no registrado", request);
			ServletUtility.forward(HomeNowView.accceder, request, response);
		}
	}
}
