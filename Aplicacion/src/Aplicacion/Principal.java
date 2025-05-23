package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ConexionMySQL connectionDB = new ConexionMySQL("localhost", "3306", "root", "", "sql7779162");
		
		if (connectionDB.success()) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Principal Principal = new Principal(connectionDB);
						Principal.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * Create the frame.
	 */
	public Principal(ConexionMySQL conexion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_NombreApp = new JLabel("Local-izados");
		lbl_NombreApp.setBounds(229, 19, 122, 63);
		lbl_NombreApp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lbl_NombreApp);
		
		
		//Boton para ir a los Restaurantes
		
		JButton btn_Restaurantes = new JButton("Restaurantes");
		btn_Restaurantes.setBounds(56, 105, 198, 55);
		btn_Restaurantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Restaurantes.addActionListener(e -> {
			Restaurantes nuevoIndex = new Restaurantes(conexion);
			
			
			nuevoIndex.setVisible(true);
		});
		contentPane.add(btn_Restaurantes);
		
		
		//Boton para ir a las Cervecerías
		
		JButton btn_Cerveceria = new JButton("Cervecerías");
		btn_Cerveceria.addActionListener(e -> {
			Cervecerias nuevoIndex = new Cervecerias(conexion);
			
			
			nuevoIndex.setVisible(true);
		});
		btn_Cerveceria.setBounds(325, 105, 198, 55);
		btn_Cerveceria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btn_Cerveceria);
		
		
		//Boton para ir a las Discotecas
		
		JButton btn_Discotecas = new JButton("Discotecas");
		btn_Discotecas.setBounds(56, 172, 198, 52);
		btn_Discotecas.addActionListener(e -> {
				Discotecas nuevoIndex = new Discotecas(conexion);
				nuevoIndex.setVisible(true);
		});
		btn_Discotecas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btn_Discotecas);
		
		
		//Boton para ir a las Cafeterias
		
		JButton btn_Cafeterias = new JButton("Cafeterías");
		btn_Cafeterias.setBounds(325, 172, 198, 52);
		btn_Cafeterias.addActionListener(e -> {
			Cafeterias nuevoIndex = new Cafeterias(conexion);
			nuevoIndex.setVisible(true);
	});
		btn_Cafeterias.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btn_Cafeterias);
		
		
		
			
		//Boton para ir al Inicio de Sesion
		
		JButton btn_InicioSesion = new JButton("Iniciar Sesión");
		btn_InicioSesion.setBounds(638, 172, 198, 52);
		btn_InicioSesion.addActionListener(e -> {
				IniciarSesion nuevoInicio = new IniciarSesion(conexion);
				
				nuevoInicio.setVisible(true);
		});
		btn_InicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btn_InicioSesion);
		
		
		//Boton para ir al Registro de Usuario
		
		JButton btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.setBounds(638, 265, 198, 52);
		btn_Registrarse.addActionListener(e -> {
				Registrar nuevoregistro = new Registrar(conexion);
				
				nuevoregistro.setVisible(true);
		});
		btn_Registrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btn_Registrarse);
		
		
		//Boton para ir a la Valoración
		
		JButton btn_Valo = new JButton("Valoraciones");
		btn_Valo.setBounds(192, 320, 198, 52);
		btn_Valo.addActionListener(e -> {
				Valoracion nuevaValo = new Valoracion(conexion);
				
				nuevaValo.setVisible(true);
		});
		btn_Valo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btn_Valo);
		
	}

}
