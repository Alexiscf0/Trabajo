package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Valoracion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_IntroducirValo;
	private final ConexionMySQL conexion;

	/**
	 * Create the frame.
	 */
	public Valoracion(ConexionMySQL conexion) {
		this.conexion = null;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 839, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tu opinión nos importa!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(281, 10, 278, 56);
		contentPane.add(lblNewLabel);
		
		textField_IntroducirValo = new JTextField();
		textField_IntroducirValo.setBounds(433, 124, 96, 36);
		contentPane.add(textField_IntroducirValo);
		textField_IntroducirValo.setColumns(10);
		
		
		JComboBox <String> comboBox_VALO = new JComboBox<>();
		comboBox_VALO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				/*
				ConexionMySQL conexion = new ConexionMySQL("sql7779162", "LgB4QjTGIx", "sql7779162");
				try {
					conexion.conectar();
		        	//Hacemos el select para seleccionar los nombres de la bbdd 
		        	//Que tienen que salir en el Combobox
					String sql = "SELECT 'Nombre' FROM 'locales'";
		            ResultSet rs = conexion.ejecutarSelect(sql);
		            //comboBox_VALO.addItem("Nombre");
		           
		            while (rs.next()) {
		                String nombre = rs.getString("Nombre");
		                comboBox_VALO.addItem(nombre);
		            }

		            conexion.desconectar();
		        } catch (SQLException e1) {
		            System.out.println("Error al cargar locales: " + e1.getMessage());
		        }
		        */
		    }
		});
		comboBox_VALO.setBounds(185, 123, 160, 36);
		contentPane.add(comboBox_VALO);
		
		
		
	}
		}
