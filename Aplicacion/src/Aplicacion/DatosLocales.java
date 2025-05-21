package Aplicacion;

public class DatosLocales {

	private String Nombre;
	private String Tipo;
	private String Ubicacion;
	private Float Valoracion;
	
	public DatosLocales(String nombre, String tipo, String ubicacion, Float valoracion) {
		this.Nombre = nombre;
		this.Tipo = tipo;
		this.Ubicacion = ubicacion;
		this.Valoracion = valoracion;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public Float getValoracion() {
		return Valoracion;
	}
	public void setValoracion(Float valoracion) {
		Valoracion = valoracion;
	}
	
	
}
