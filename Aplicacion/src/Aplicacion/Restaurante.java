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

public class Restaurante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea_Tipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurante frame = new Restaurante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Restaurante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titulo = new JLabel(Index.nombreRestaurante(Macarella));
		lbl_titulo.setBounds(135, 10, 144, 38);
		lbl_titulo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_titulo);
		
		JLabel lbl_Ubi = new JLabel("Ubicación");
		lbl_Ubi.setBounds(10, 55, 99, 25);
		lbl_Ubi.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		contentPane.add(lbl_Ubi);
		
		
		//Recuadro de texto en el que sale el nombre del negocio
		
		JTextArea textArea_Ubi = new JTextArea();
		textArea_Ubi.setBounds(96, 58, 144, 25);
		contentPane.add(textArea_Ubi);
		
		JLabel lbl_Ubi_1 = new JLabel("Tipo");
		lbl_Ubi_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lbl_Ubi_1.setBounds(10, 90, 99, 25);
		contentPane.add(lbl_Ubi_1);
		
		textArea_Tipo = new JTextArea();
		textArea_Tipo.setBounds(96, 94, 144, 25);
		contentPane.add(textArea_Tipo);
		
		JLabel lbl_Ubi_1_1 = new JLabel("Valoracion");
		lbl_Ubi_1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lbl_Ubi_1_1.setBounds(10, 129, 99, 25);
		contentPane.add(lbl_Ubi_1_1);
		
		JTextArea textArea_Valo = new JTextArea();
		textArea_Valo.setBounds(96, 129, 144, 25);
		contentPane.add(textArea_Valo);
		
		
		ConexionMySQL conexion = new ConexionMySQL("root", "", "locales");
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM restaurantes WHERE Nombre = 'Macarella'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			System.out.println("aa");
		while (x.next()) {
				
				String ubicacion=x.getNString("Ubicación");
					textArea_Ubi.setText(ubicacion);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM restaurantes WHERE Nombre = 'Macarella'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			System.out.println("aa");
		while (x.next()) {
				
				String ubicacion=x.getNString("Tipo");
					textArea_Tipo.setText(ubicacion);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM restaurantes WHERE Nombre = 'Macarella'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			System.out.println("aa");
		while (x.next()) {
				
				String Nombre=x.getNString("Nombre");
					lbl_titulo.setText(Nombre);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM restaurantes WHERE Nombre = 'Macarella'";
			ResultSet x = conexion.ejecutarSelect(sentencia);
			
		while (x.next()) {
				
				double Valo=x.getDouble("Valoración");
				String nuevoString = Valo+" ";
					textArea_Valo.setText(nuevoString);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		}
	}
