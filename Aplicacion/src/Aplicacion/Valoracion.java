package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aplicacion.*;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Valoracion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_IntroducirValor;
	
	private String nombreLocal;
	private Float valoracion;
	private int id;
	
	/**
	 * Create the frame.
	 */
	public Valoracion(ConexionMySQL conexion) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 839, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox_VALO = new JComboBox();
		comboBox_VALO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox_VALO.setBounds(147, 189, 184, 36);
		contentPane.add(comboBox_VALO);
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
            	LinkedList<String> NombreLocales = conexion.getNombreLocales();
		        for (String i : NombreLocales) {
		        	comboBox_VALO.addItem(i);
		        }
            }
        });
		
		JLabel lbl_Titulo = new JLabel("Tu opinión nos importa!");
		lbl_Titulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lbl_Titulo.setBounds(281, 10, 278, 56);
		contentPane.add(lbl_Titulo);
		
		textField_IntroducirValor = new JTextField();
		textField_IntroducirValor.setBounds(483, 190, 96, 36);
		contentPane.add(textField_IntroducirValor);
		textField_IntroducirValor.setColumns(10);
		
		
		JButton btn_Valoracion = new JButton("Enviar Valoración");
		btn_Valoracion.addActionListener(e -> {
			
			if (IniciarSesion.SesionIniciada == false) {
				JOptionPane.showMessageDialog(null, "Es necesario iniciar sesión");
				dispose();
				IniciarSesion nuevoInicio = new IniciarSesion(conexion);
				
				nuevoInicio.setVisible(true);
			}
			else {
				nombreLocal = comboBox_VALO.getSelectedItem() + "";
				valoracion = valoracion.parseFloat(textField_IntroducirValor.getText());
				System.out.println(nombreLocal);
				System.out.println(IniciarSesion.nombreUsuario);
				System.out.println(valoracion);
				
				//Conexion Base de Datos
				id = conexion.getIdPuntuacion();
				System.out.println("ID1 " + id);
				id = id + 1;
				System.out.println("ID2 " + id);
				boolean nuevaValoracion = conexion.setNuevaValoracion(IniciarSesion.nombreUsuario, nombreLocal, valoracion, id);
			}
			
		});
		btn_Valoracion.setBounds(340, 379, 200, 49);
		contentPane.add(btn_Valoracion);
		
		JLabel lbl_NombreDelLocal = new JLabel("Nombre del local");
		lbl_NombreDelLocal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lbl_NombreDelLocal.setBounds(137, 143, 200, 36);
		contentPane.add(lbl_NombreDelLocal);
		
		JLabel lbl_Valoracion = new JLabel("Valoración");
		
		lbl_Valoracion.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lbl_Valoracion.setBounds(463, 145, 127, 32);
		contentPane.add(lbl_Valoracion);
		
	
		
	}
	}
		
