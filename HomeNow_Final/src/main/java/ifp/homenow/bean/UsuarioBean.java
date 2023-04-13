package ifp.homenow.bean;

import java.util.Date;

//Esta clase es el modelo base de la clase usuario

public class UsuarioBean {

	//Atributos
	private long idusuarios;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Date fecha_nacimiento;
	private int edad;
	private String usuario;
	private String contrasena;
	private int telefono;
	private String correo;
	
	
	//Getters y Setters
	
	public long getIdusuarios() {
		return idusuarios;
	}
	public void setIdusuarios(long idusuarios) {
		this.idusuarios = idusuarios;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
	
	
	
	
	
}
