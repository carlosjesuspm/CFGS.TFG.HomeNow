package ifp.homenow.controller;

import ifp.homenow.bean.DireccionBean;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import ifp.homenow.utility.ServletUtility;
import ifp.homenow.bean.InmuebleBean;

import ifp.homenow.model.InmuebleModel;
/**
 * Servlet implementation class PublicarController
 */
@WebServlet(name = "PublicarController", urlPatterns = { "/publicarController" })
@MultipartConfig(maxFileSize=16177215)
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
		Blob blob=null;
		InputStream inputStream =null;
		
		Part part= request.getPart("imagen");
		inputStream=part.getInputStream();
		byte[] b= new byte[inputStream.available()];
		inputStream.read(b);
		try {
			blob=new SerialBlob(b);
		} catch (SerialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

		inmueble.setHabitacion(Integer.parseInt(request.getParameter("habitacion")));
		inmueble.setBano(Integer.parseInt(request.getParameter("bano")));
		inmueble.setDescripcion_inmueble("descripcion");
		inmueble.setImagen_inmueble(blob);
		
		
		
		
		InmuebleModel.addDireccionModel(direccion);
		long i= InmuebleModel.addInmuebleModel(inmueble);

		if(i>0) {
			ServletUtility.setSuccessMessage("Inmueble registrado correctamente", request);
		}else {
			ServletUtility.setErrorMessage("Problema al registrar el inmueble", request);
		}
		
		request.getRequestDispatcher(HomeNowView.publicar).forward(request, response);
	}

}
