package ifp.homenow.bean;

import java.util.Date;

public class DetalleAlquilerBean {

	//Atributos
	private long iddetalle_alquiler;
	private Date fecha_inicio_alquiler;
	private Date fecha_fin_alquiler;
	private int fianza;
	private long inmueble_alq;
	private long usuarios_alq;
	
	//Getters y Setters
	public long getIddetalle_alquiler() {
		return iddetalle_alquiler;
	}
	public void setIddetalle_alquiler(long iddetalle_alquiler) {
		this.iddetalle_alquiler = iddetalle_alquiler;
	}
	public Date getFecha_inicio_alquiler() {
		return fecha_inicio_alquiler;
	}
	public void setFecha_inicio_alquiler(Date fecha_inicio_alquiler) {
		this.fecha_inicio_alquiler = fecha_inicio_alquiler;
	}
	public Date getFecha_fin_alquiler() {
		return fecha_fin_alquiler;
	}
	public void setFecha_fin_alquiler(Date fecha_fin_alquiler) {
		this.fecha_fin_alquiler = fecha_fin_alquiler;
	}
	public int getFianza() {
		return fianza;
	}
	public void setFianza(int fianza) {
		this.fianza = fianza;
	}
	public long getInmueble_alq() {
		return inmueble_alq;
	}
	public void setInmueble_alq(long inmueble_alq) {
		this.inmueble_alq = inmueble_alq;
	}
	public long getUsuarios_alq() {
		return usuarios_alq;
	}
	public void setUsuarios_alq(long usuarios_alq) {
		this.usuarios_alq = usuarios_alq;
	}
	
	
		
}
