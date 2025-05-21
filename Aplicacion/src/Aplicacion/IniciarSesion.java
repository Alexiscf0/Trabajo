package Aplicacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;

public class IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_NombreUsuario;
	private JTextField txt_ContraseñaUsuario;
	private JButton btn_InicioSesion;
	
	private String contraseñaUsuario;
	private String nombreUsuario;
	static Boolean SesionIniciada = false;
	
	private final ConexionMySQL conexion;
	//private JLabel lbl_UsuarioIncorrecto;
	//private JLabel lbl_ContraseñaIncorrecta;


	/**
	 * Create the frame.
	 */
	public IniciarSesion(ConexionMySQL conexion) {
		this.conexion = null;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Nombre Usuario
		
		JLabel lbl_NombreUsuario = new JLabel("Usuario");
		lbl_NombreUsuario.setBounds(150, 34, 121, 16);
		contentPane.add(lbl_NombreUsuario);
		
		txt_NombreUsuario = new JTextField();
		txt_NombreUsuario.setBounds(150, 52, 163, 26);
		contentPane.add(txt_NombreUsuario);
		txt_NombreUsuario.setColumns(10);
		
		
		//Constraseña Usuario
		
		JLabel lbl_ContraseñaUsuario = new JLabel("Contraseña");
		lbl_ContraseñaUsuario.setBounds(150, 120, 121, 16);
		contentPane.add(lbl_ContraseñaUsuario);
		
		txt_ContraseñaUsuario = new JTextField();
		txt_ContraseñaUsuario.setColumns(10);
		txt_ContraseñaUsuario.setBounds(150, 148, 163, 26);
		contentPane.add(txt_ContraseñaUsuario);
		
		
		//Boton Inicio Sesion
		
		btn_InicioSesion = new JButton("Iniciar Sesión");
		btn_InicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreUsuario = txt_NombreUsuario.getText();
				contraseñaUsuario = txt_ContraseñaUsuario.getText();
				
				//Conexion Base de Datos
				
				DatosUsuarios datosUsuario = conexion.getDatosUsuarios(nombreUsuario, contraseñaUsuario);
				
				if (datosUsuario != null) {
					SesionIniciada = true;
					JOptionPane.showMessageDialog(null, "Sesión iniciada correctamente");
					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
				}
			}
		});
		btn_InicioSesion.setBounds(172, 211, 117, 29);
		contentPane.add(btn_InicioSesion);
		
		
		/*
		lbl_UsuarioIncorrecto = new JLabel("El usuario introducido es incorrecto");
		lbl_UsuarioIncorrecto.setForeground(new Color(255, 35, 20));
		lbl_UsuarioIncorrecto.setBounds(115, 78, 254, 16);
		contentPane.add(lbl_UsuarioIncorrecto);
		lbl_UsuarioIncorrecto.setVisible(false);
		
		lbl_ContraseñaIncorrecta = new JLabel("La contraseña introducida es incorrecta");
		lbl_ContraseñaIncorrecta.setForeground(new Color(255, 35, 20));
		lbl_ContraseñaIncorrecta.setBounds(115, 173, 254, 16);
		contentPane.add(lbl_ContraseñaIncorrecta);
		lbl_ContraseñaIncorrecta.setVisible(false);
		*/
		
		
	}
}
