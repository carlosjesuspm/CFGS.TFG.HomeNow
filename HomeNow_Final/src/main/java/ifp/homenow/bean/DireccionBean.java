package ifp.homenow.bean;

public class DireccionBean {

	//Atributos
	
	private long iddireccion;
	private String provincia;
	private String municipio;
	private String localidad;
	private int codigo_postal;
	private int numero;
	private String complemento;
	
	
	//Getters y Setters
	
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