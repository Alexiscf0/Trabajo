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

public class Registrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIntroduceTuNombre;
	private JTextField txtIntroduceTuContrasea;
	private JButton btn_Registrarse;
	
	private String contraseñaUsuario;
	private String nombreUsuario;
	static Boolean SesionIniciada = false;
	private final ConexionMySQL conexion;
	
	/**
	 * Create the frame.
	 */
	public Registrar(ConexionMySQL conexion) {
		this.conexion = null;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Nombre Usuario
		
		JLabel NombreUsuario = new JLabel("Usuario");
		NombreUsuario.setBounds(150, 34, 121, 16);
		contentPane.add(NombreUsuario);
		
		txtIntroduceTuNombre = new JTextField();
		txtIntroduceTuNombre.setBounds(150, 52, 177, 26);
		contentPane.add(txtIntroduceTuNombre);
		txtIntroduceTuNombre.setColumns(10);
		
		
		//Contraseña Usuario
		
		JLabel lbl_ContraseñaUsuario = new JLabel("Contraseña");
		lbl_ContraseñaUsuario.setBounds(150, 120, 121, 16);
		contentPane.add(lbl_ContraseñaUsuario);
		
		txtIntroduceTuContrasea = new JTextField();
		txtIntroduceTuContrasea.setColumns(10);
		txtIntroduceTuContrasea.setBounds(150, 148, 177, 26);
		contentPane.add(txtIntroduceTuContrasea);
		
		
		//Boton Registro Usuario
		
		btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreUsuario = txtIntroduceTuNombre.getText();
				contraseñaUsuario = txtIntroduceTuContrasea.getText();
				
				//Conexion Base de Datos
				
				String datosUsuario = conexion.getNombreUsuario(nombreUsuario);
				
				if (nombreUsuario == datosUsuario) {
					JOptionPane.showMessageDialog(null, "Ya hay un usuario registrado con este nombre.");
				}
				else {
					DatosUsuarios nuevoUsuario = conexion.setNuevoUsuario(nombreUsuario, contraseñaUsuario);
					if (nombreUsuario == datosUsuario) {
						JOptionPane.showMessageDialog(null, "El usuario ha sido creado con éxito.");
					}
					else {
						JOptionPane.showMessageDialog(null, "Ha ocurrido un error al crear el usuario intentelo de nuevo.");
					}
				}
			}
		});
		btn_Registrarse.setBounds(173, 212, 117, 29);
		contentPane.add(btn_Registrarse);
	}
}
