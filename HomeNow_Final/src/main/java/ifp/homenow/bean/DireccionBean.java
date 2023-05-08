package ifp.homenow.bean;

public class DireccionBean {

	//Atributos
	
	private long iddireccion;
	private String provincia;
	private String municipio;
	private String localidad;
	private String calle;
	private int codigo_postal;
	private int numero;
	private String complemento;
	
	
	
	
	public DireccionBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DireccionBean(long iddireccion, String provincia, String municipio, String localidad, String calle,
			int codigo_postal, int numero, String complemento) {
		super();
		this.iddireccion = iddireccion;
		this.provincia = provincia;
		this.municipio = municipio;
		this.localidad = localidad;
		this.calle = calle;
		this.codigo_postal = codigo_postal;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	
	//Getters y Setters
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public long getIddireccion() {
		return iddireccion;
	}
	public void setIddireccion(long iddireccion) {
		this.iddireccion = iddireccion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	
}
