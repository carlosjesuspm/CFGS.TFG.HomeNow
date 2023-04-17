package ifp.homenow.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ifp.homenow.utility.ServletUtility;
import ifp.homenow.bean.DireccionBean;
import ifp.homenow.bean.InmuebleBean;
import ifp.homenow.bean.UsuarioBean;

import ifp.homenow.model.InmuebleModel;

/**
 * Servlet implementation class PublicarController
 */
@WebServlet(name="PublicarController", urlPatterns={"/publicarController"})
public class PublicarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublicarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletUtility.forward(HomeNowView.publicar, request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InmuebleBean inmueble = new InmuebleBean();
		DireccionBean direccion = new DireccionBean();
		UsuarioBean usuario = new UsuarioBean();
		
		inmueble.setTipo(request.getParameter("tipo"));
		inmueble.setPrecio_inmueble(Integer.parseInt(request.getParameter("precio")));
		inmueble.setSuperficie(Integer.parseInt(request.getParameter("superficie")));
		inmueble.setDireccion_inmueble(direccion);
		inmueble.setHabitacion(Integer.parseInt(request.getParameter("habitacion")));
		inmueble.setBano(Integer.parseInt(request.getParameter("bano")));
		inmueble.setImagen_inmueble(request.getParameter("imagenes"));
		inmueble.setDescripcion_inmueble(request.getParameter("descripcion"));
		inmueble.setUsuarios_inmueble(usuario);
		
		long i=InmuebleModel.addInmuebleModel(inmueble);
		
		
		
		if(i>0) {
			ServletUtility.setSuccessMessage("Inmueble registrado correctamente", request);
		}else {
			ServletUtility.setErrorMessage("Problema al registrar el inmueble", request);
		}
		
		request.getRequestDispatcher(HomeNowView.publicar).forward(request, response);
	}

}
