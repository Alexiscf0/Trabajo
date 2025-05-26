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
import javax.swing.ImageIcon;
import java.awt.Color;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ConexionMySQL conexion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ConexionMySQL connectionDB = new ConexionMySQL("localhost", "3306", "root", "", "sql7779162");
		
		if (connectionDB.success()) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Principal frame = new Principal(connectionDB);
						frame.setVisible(true);
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
		this.conexion = conexion;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_NombreApp = new JLabel("Local-izados");
		lbl_NombreApp.setToolTipText("");
		lbl_NombreApp.setBackground(new Color(255, 255, 255));
		lbl_NombreApp.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombreApp.setBounds(284, 10, 240, 63);
		contentPane.add(lbl_NombreApp);
		
		
		//Boton para ir a los Restaurantes
		
		JButton btn_Restaurantes = new JButton("Restaurantes");
		btn_Restaurantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Restaurantes.addActionListener(e -> {
			Restaurantes nuevoIndex = new Restaurantes(this.conexion);
			
			
			nuevoIndex.setVisible(true);
		});
		btn_Restaurantes.setBounds(10, 105, 198, 55);
		contentPane.add(btn_Restaurantes);
		
		
		//Boton para ir a las Discotecas
		
		JButton btn_Discotecas = new JButton("Discotecas");
		btn_Discotecas.addActionListener(e -> {
				Discotecas nuevoIndex = new Discotecas(this.conexion);
				nuevoIndex.setVisible(true);
		});
		btn_Discotecas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Discotecas.setBounds(10, 180, 198, 52);
		contentPane.add(btn_Discotecas);
		
		
		//Boton para ir a las Cafeterias
		
		JButton btn_Cafeterias = new JButton("Cafeterías");
		btn_Cafeterias.addActionListener(e -> {
			Cafeterias nuevoIndex = new Cafeterias(this.conexion);
			nuevoIndex.setVisible(true);
	});
		btn_Cafeterias.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Cafeterias.setBounds(10, 260, 198, 52);
		contentPane.add(btn_Cafeterias);
		
		
		
			
		//Boton para ir al Inicio de Sesion
		
		JButton btn_InicioSesion = new JButton("Iniciar Sesión");
		btn_InicioSesion.addActionListener(e -> {
				IniciarSesion nuevoInicio = new IniciarSesion(this.conexion);
				
				nuevoInicio.setVisible(true);
		});
		btn_InicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_InicioSesion.setBounds(457, 106, 198, 52);
		contentPane.add(btn_InicioSesion);
		
		
		//Boton para ir al Registro de Usuario
		
		JButton btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.addActionListener(e -> {
				Registrar nuevoregistro = new Registrar(this.conexion);
				
				nuevoregistro.setVisible(true);
		});
		btn_Registrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Registrarse.setBounds(457, 180, 198, 52);
		contentPane.add(btn_Registrarse);
		
		
		//Boton para ir a la Valoración
		
		JButton btn_Valo = new JButton("Valoraciones");
		btn_Valo.addActionListener(e -> {
				Valoracion nuevaValo = new Valoracion(this.conexion);
				
				nuevaValo.setVisible(true);
		});
		btn_Valo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Valo.setBounds(227, 299, 198, 52);
		contentPane.add(btn_Valo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alexi\\Desktop\\img_app\\fondo.jpg"));
		lblNewLabel.setBounds(0, 0, 855, 515);
		contentPane.add(lblNewLabel);
		
			
		
		if (IniciarSesion.SesionIniciada == false) {
			btn_InicioSesion.setVisible(true);
			btn_Registrarse.setVisible(true);
		}
		else {
			btn_InicioSesion.setVisible(false);
			btn_Registrarse.setVisible(false);
		}
			
			
	}
}
