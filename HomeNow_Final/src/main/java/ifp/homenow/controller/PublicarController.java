package ifp.homenow.controller;
import ifp.homenow.bean.DireccionBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ifp.homenow.utility.ServletUtility;
import ifp.homenow.bean.InmuebleBean;
import ifp.homenow.bean.UsuarioBean;
import ifp.homenow.model.InmuebleModel;
/**
 * Servlet implementation class PublicarController
 */
@WebServlet(name = "PublicarController", urlPatterns = { "/publicarController" })
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
		UsuarioBean user = new UsuarioBean();
		HttpSession session = request.getSession();
		session.setAttribute("userId", user.getIdusuarios());
		
		
		inmueble.setTipo(request.getParameter("tipo"));
		inmueble.setSuperficie(Integer.parseInt(request.getParameter("superficie")));
		inmueble.setPrecio_inmueble(Integer.parseInt(request.getParameter("precio")));
		
		direccion.setProvincia(request.getParameter("provincia"));
		direccion.setLocalidad(request.getParameter("localidad"));
		direccion.setCalle(request.getParameter("calle"));
		direccion.setComplemento(request.getParameter("complemento"));
		direccion.setMunicipio(request.getParameter("municipio"));
		direccion.setCodigo_postal(Integer.parseInt(request.getParameter("codigo_postal")));
		direccion.setNumero(Integer.parseInt(request.getParameter("numero")));

		inmueble.setBano(Integer.parseInt(request.getParameter("bano")));
		inmueble.setDescripcion_inmueble("descripcion");
		
		
		InmuebleModel.addDireccionModel(direccion);
		long i= InmuebleModel.addInmuebleModel(inmueble, session);

		if(i>0) {
			ServletUtility.setSuccessMessage("Inmueble registrado correctamente", request);
		}else {
			ServletUtility.setErrorMessage("Problema al registrar el inmueble", request);
		}
		
		request.getRequestDispatcher(HomeNowView.publicar).forward(request, response);
	}

}
