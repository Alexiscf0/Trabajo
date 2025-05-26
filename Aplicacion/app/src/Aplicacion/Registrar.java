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
import javax.swing.ImageIcon;

public class Registrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIntroduceTuNombre;
	private JTextField txtIntroduceTuContraseña;
	private JButton btn_Registrarse;
	
	private String contraseñaUsuario;
	private final ConexionMySQL conexion;
	private JLabel lblNewLabel;
	
	/**
	 * Create the frame.
	 */
	public Registrar(ConexionMySQL conexion) {
		this.conexion = null;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 530, 337);
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
		
		txtIntroduceTuContraseña = new JTextField();
		txtIntroduceTuContraseña.setColumns(10);
		txtIntroduceTuContraseña.setBounds(150, 148, 177, 26);
		contentPane.add(txtIntroduceTuContraseña);
		
		
		//Boton Registro Usuario
		
		btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.addActionListener(e -> {
			IniciarSesion.nombreUsuario = txtIntroduceTuNombre.getText().trim();
				contraseñaUsuario = txtIntroduceTuContraseña.getText().trim();
				
				
				//Conexion Base de Datos y creación del Usuario
				
				String datosUsuario = conexion.getNombreUsuario(IniciarSesion.nombreUsuario);
				if (datosUsuario == null) {
					datosUsuario = "";
				}
				System.out.println("Contra:" + contraseñaUsuario);
				
				if (IniciarSesion.nombreUsuario.equals(datosUsuario)) {
					JOptionPane.showMessageDialog(null, "Ya hay un usuario registrado con este nombre.");
					IniciarSesion.SesionIniciada = false;
				}
				else {
					if (!contraseñaUsuario.trim().isEmpty()) {
						boolean usuariocreado = conexion.setNuevoUsuario(IniciarSesion.nombreUsuario, contraseñaUsuario);
						if (usuariocreado) {
							DatosUsuarios nuevoUsuario = new DatosUsuarios(IniciarSesion.nombreUsuario, contraseñaUsuario);
							JOptionPane.showMessageDialog(null, "El usuario ha sido creado con éxito.");
							IniciarSesion.SesionIniciada = true;
						}
						else {
							JOptionPane.showMessageDialog(null, "Ha ocurrido un error al crear el usuario intentelo de nuevo.");
							IniciarSesion.SesionIniciada = false;
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Falta una contraseña.");
					}
				}
		});
		btn_Registrarse.setBounds(173, 212, 117, 29);
		contentPane.add(btn_Registrarse);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alexi\\Desktop\\img_app\\unnamed.png"));
		lblNewLabel.setBounds(0, -11, 531, 324);
		contentPane.add(lblNewLabel);
	}
}
