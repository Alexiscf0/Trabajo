package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aplicacion.ConexionMySQL;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Index extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea_Tipo;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	
	
	public Index() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Recuadro de texto en el que sale el nombre del negocio
		
		JLabel lbl_titulo = new JLabel("Nombre Local");
		lbl_titulo.setBounds(79, 6, 288, 38);
		lbl_titulo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_titulo);
		
		
		//Ubicación del local
		
		JLabel lbl_Ubi = new JLabel("Ubicación");
		lbl_Ubi.setBounds(10, 55, 99, 25);
		lbl_Ubi.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		contentPane.add(lbl_Ubi);
		
		JTextArea textArea_Ubi = new JTextArea();
		textArea_Ubi.setBounds(106, 55, 144, 25);
		contentPane.add(textArea_Ubi);
		
		
		//Tipo de local
		
		JLabel lbl_Tipo = new JLabel("Tipo");
		lbl_Tipo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lbl_Tipo.setBounds(10, 90, 76, 25);
		contentPane.add(lbl_Tipo);
		
		textArea_Tipo = new JTextArea();
		textArea_Tipo.setBounds(106, 92, 144, 25);
		contentPane.add(textArea_Tipo);
		
		
		//Valoración del local
		
		JLabel lbl_Valo = new JLabel("Valoración");
		lbl_Valo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lbl_Valo.setBounds(10, 129, 99, 25);
		contentPane.add(lbl_Valo);
		
		JTextArea textArea_Valo = new JTextArea();
		textArea_Valo.setBounds(106, 129, 144, 25);
		contentPane.add(textArea_Valo);
		
		
		//Conexion con la base de datos
		
		ConexionMySQL conexion = new ConexionMySQL("sql7779162", "LgB4QjTGIx", "sql7779162");
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM locales WHERE Nombre = '" + Restaurantes.nombreLocal + "'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			System.out.println("aa");
		while (x.next()!=false) {
				
					String ubicacion=x.getString("Ubicacion");
					textArea_Ubi.setText(ubicacion);
					
					String tipo=x.getString("Tipo");
					textArea_Tipo.setText(tipo);
					
					String Nombre=x.getString("Nombre");
					lbl_titulo.setText(Nombre);
					
					Float Valo=x.getFloat("Valoracion");
					String nuevoString = Valo+" ";
						textArea_Valo.setText(nuevoString);
						
			}
		conexion.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM locales WHERE Nombre = '" + Discotecas.nombreLocal + "'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			System.out.println("aa");
		while (x.next()!=false) {
				
					String ubicacion=x.getString("Ubicacion");
					textArea_Ubi.setText(ubicacion);
					
					String tipo=x.getString("Tipo");
					textArea_Tipo.setText(tipo);
					
					String Nombre=x.getString("Nombre");
					lbl_titulo.setText(Nombre);
					
					Float Valo=x.getFloat("Valoracion");
					String nuevoString = Valo+" ";
						textArea_Valo.setText(nuevoString);
						
			}
		conexion.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM locales WHERE Nombre = '" + Cafeterias.nombreLocal + "'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			System.out.println("aa");
		while (x.next()!=false) {
				
					String ubicacion=x.getString("Ubicacion");
					textArea_Ubi.setText(ubicacion);
					
					String tipo=x.getString("Tipo");
					textArea_Tipo.setText(tipo);
					
					String Nombre=x.getString("Nombre");
					lbl_titulo.setText(Nombre);
					
					Float Valo=x.getFloat("Valoracion");
					String nuevoString = Valo+" ";
						textArea_Valo.setText(nuevoString);
						
			}
		conexion.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		}
	}
