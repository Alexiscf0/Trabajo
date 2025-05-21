package Aplicacion;

public class DatosUsuarios {

	private String Nombre;
	private String Contrasena;
	
	
	public DatosUsuarios(String nombre, String contrasena) {
		this.Nombre = nombre;
		this.Contrasena = contrasena;
	}
	
	public DatosUsuarios(String nombre) {
		this.Nombre = nombre;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	
	public String getContraseña() {
		return this.Contrasena;
	}
	public void setUbicacion(String contrasena) {
		this.Contrasena = contrasena;
	}
	
}
