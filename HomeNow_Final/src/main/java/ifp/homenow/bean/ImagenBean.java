package ifp.homenow.bean;

import java.sql.Blob;

public class ImagenBean {

	
	private long id_imagen;
	private Blob imagen;
	
	
	public ImagenBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ImagenBean(long id_imagen, Blob imagen) {
		super();
		this.id_imagen = id_imagen;
		this.imagen = imagen;
	}
	public long getId_imagen() {
		return id_imagen;
	}
	public void setId_imagen(long id_imagen) {
		this.id_imagen = id_imagen;
	}
	public Blob getImagen() {
		return imagen;
	}
	public void setImagen(Blob imagen) {
		this.imagen = imagen;
	}
	
	
}
