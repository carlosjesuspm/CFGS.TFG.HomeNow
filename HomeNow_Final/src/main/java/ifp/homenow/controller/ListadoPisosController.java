package ifp.homenow.controller;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ifp.homenow.bean.InmuebleBean;
import ifp.homenow.model.InmuebleModel;
import ifp.homenow.utility.ServletUtility;

/**
 * Servlet implementation class ListadoPisos
 */
@WebServlet(name = "ListadoPisosController", urlPatterns = { "/listadoPisosController" })
public class ListadoPisosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListadoPisosController() {
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
		List<InmuebleBean> listaInmuebles = InmuebleModel.listado();
		request.setAttribute("listaInmuebles", listaInmuebles);
		RequestDispatcher dispatcher=request.getRequestDispatcher(HomeNowView.alquilar);
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}