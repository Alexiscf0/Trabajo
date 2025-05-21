package Aplicacion.Aplicacion;

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
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valoracion frame = new Valoracion();
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
	public Valoracion() {
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
		
		textField = new JTextField();
		textField.setBounds(433, 124, 96, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox<String> comboBox_VALO = new JComboBox<>();

		addWindowListener(new WindowAdapter() {
		    public void windowOpened(WindowEvent e) {
		    	System.out.println("aa");
		      ConexionMySQL conexion = new ConexionMySQL("sql7779162", "LgB4QjTGIx", "sql7779162");

		        String sql = "SELECT Nombre FROM locales";
		        	//Hacemos el select para seleccionar los nombres de la bbdd 
		        	//Que tienen que salir en el Combobox
		        try {
		            conexion.conectar();
		           
		            ResultSet rs = conexion.ejecutarSelect(sql);
		           // comboBox_VALO.addItem(sql);
		            comboBox_VALO.addItem("Nombre");
		           
		            while (rs.next()) {
		                String nombre = rs.getString("Nombre");
		                //comboBox_VALO.addItem(nombre);
		                System.out.println("aa");
		            }

		            conexion.desconectar();
		        } catch (SQLException e1) {
		            System.out.println("Error al cargar locales: " + e1.getMessage());
		        }
		        
		    }
		});

		comboBox_VALO.setBounds(185, 123, 160, 36);
		contentPane.add(comboBox_VALO);
		
	}
		}
