package ifp.homenow.bean;

import java.sql.Blob;

public class InmuebleBean {

	// Atributos
	private long idinmuebles;
	private String tipo;
	private int precio_inmueble;
	private int superficie;
	private DireccionBean direccion_inmueble;
	private int habitacion;
	private int bano;
	private Blob imagenes_inmueble;
	private String descripcion_inmueble;
	private UsuarioBean usuarios_inmueble;
	
	public InmuebleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public InmuebleBean(long idinmuebles, String tipo, int precio_inmueble, int superficie, DireccionBean direccion_inmueble,
			int habitacion, int bano, Blob imagenes_inmueble, String descripcion_inmueble, UsuarioBean usuarios_inmueble) {
		super();
		this.idinmuebles = idinmuebles;
		this.tipo = tipo;
		this.precio_inmueble = precio_inmueble;
		this.superficie = superficie;
		this.direccion_inmueble = direccion_inmueble;
		this.habitacion = habitacion;
		this.bano = bano;
		this.imagenes_inmueble = imagenes_inmueble;
		this.descripcion_inmueble = descripcion_inmueble;
		this.usuarios_inmueble = usuarios_inmueble;
	}


	public long getIdinmuebles() {
		return idinmuebles;
	}


	public void setIdinmuebles(long idinmuebles) {
		this.idinmuebles = idinmuebles;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getPrecio_inmueble() {
		return precio_inmueble;
	}


	public void setPrecio_inmueble(int precio_inmueble) {
		this.precio_inmueble = precio_inmueble;
	}


	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}


	public DireccionBean getDireccion_inmueble() {
		return direccion_inmueble;
	}


	public void setDireccion_inmueble(DireccionBean direccion_inmueble) {
		this.direccion_inmueble = direccion_inmueble;
	}


	public int getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}


	public int getBano() {
		return bano;
	}


	public void setBano(int bano) {
		this.bano = bano;
	}


	public Blob getImagenes_inmueble() {
		return imagenes_inmueble;
	}


	public void setImagenes_inmueble(Blob imagenes_inmueble) {
		this.imagenes_inmueble = imagenes_inmueble;
	}


	public String getDescripcion_inmueble() {
		return descripcion_inmueble;
	}


	public void setDescripcion_inmueble(String descripcion_inmueble) {
		this.descripcion_inmueble = descripcion_inmueble;
	}


	public UsuarioBean getUsuarios_inmueble() {
		return usuarios_inmueble;
	}


	public void setUsuarios_inmueble(UsuarioBean usuarios_inmueble) {
		this.usuarios_inmueble = usuarios_inmueble;
	}
	
	

	

}
