package Aplicacion.Aplicacion.Aplicacion.src.Aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class ConexionMySQL {

	private Connection conexion;
	
	public ConexionMySQL(String host, String port, String user, String pass, String bd) {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + bd + "?useSSL=false&serverTimezone=UTC";
        try {
            // Cargar el driver JDBC (opcional con JDBC 4.0+ pero recomendado)
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexion = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            this.conexion = null;
        }
    }
	
	public boolean success() {
		return this.conexion != null;
	}
	
	public DatosLocales getDatosLocales(String Nombre) {
		String SQL = "SELECT * FROM locales WHERE Nombre = ?";
		
		try {
			var stmt = this.conexion.prepareStatement(SQL);
			stmt.setString(1, Nombre);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String nombre = rs.getString("Nombre");
				String tipo = rs.getString("Tipo");
				String ubicacion = rs.getString("Ubicacion");
				Float valoracion = rs.getFloat("Valoracion");
				
				return new DatosLocales(nombre, tipo, ubicacion, valoracion);
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return null;
	}
	
	public LinkedList<String> getNombreLocales() {
		String SQL = "SELECT Nombre FROM locales";
		LinkedList<String> nombres = new LinkedList<>();
		try {
			var stmt = this.conexion.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				String nombre = rs.getString("Nombre");
				nombres.add(nombre);
				
				return nombres;
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return null;
	}
	
	public DatosUsuarios getDatosUsuarios(String Nombre, String Contraseña) {
		String SQL = "SELECT * FROM usuarios WHERE Nombre = ? AND Contrasena = ?";
		
		try {
			var stmt = this.conexion.prepareStatement(SQL);
			stmt.setString(1, Nombre);
			stmt.setString(2, Contraseña);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String nombre = rs.getString("Nombre");
				String contraseña = rs.getString("Contrasena");
				
				return new DatosUsuarios(nombre, contraseña);
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return null;
	}
	
	public String getNombreUsuario(String Nombre) {
		String SQL = "SELECT Nombre FROM usuarios WHERE Nombre = ?";
		
		try {
			var stmt = this.conexion.prepareStatement(SQL);
			stmt.setString(1, Nombre);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String nombre = rs.getString("Nombre");
				
				return new String(nombre).trim();
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return null;
	}
	
	public boolean setNuevoUsuario(String Nombre, String Contraseña) {
		String SQL = "INSERT INTO usuarios (Nombre, Contrasena) VALUES (?, ?)";
		
		try {
			var stmt = this.conexion.prepareStatement(SQL);
			stmt.setString(1, Nombre);
			stmt.setString(2, Contraseña);
			
			stmt.executeUpdate();
			
				return true;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return false;
	}
	
	public void InsertUsuario() {
		String SQL = "INSERT INTO 'usuarios'('Nombre', 'Contrasena' VALUES ([?], [?])";
	}

	public ResultSet ejecutarSelect(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
}
