package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aplicacion.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private final ConexionMySQL conexion;
	
	
	/**
	 * Create the frame.
	 */
	
	public Index(ConexionMySQL conexion) {
		this.conexion = null;
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
		
		JTextArea textArea_Tipo = new JTextArea();
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
		DatosLocales datosRestaurante = conexion.getDatosLocales(Restaurantes.nombreLocal);
		
		if (datosRestaurante != null) {
			lbl_titulo.setText(datosRestaurante.getNombre());
			textArea_Ubi.setText(datosRestaurante.getUbicacion());
			textArea_Tipo.setText(datosRestaurante.getTipo());
			
			String ValoString = datosRestaurante.getValoracion()+"";
			textArea_Valo.setText(ValoString);
		}
		
		
		DatosLocales datosDiscoteca = conexion.getDatosLocales(Discotecas.nombreLocal);
		
		if (datosDiscoteca != null) {
			lbl_titulo.setText(datosDiscoteca.getNombre());
			textArea_Ubi.setText(datosDiscoteca.getUbicacion());
			textArea_Tipo.setText(datosDiscoteca.getTipo());
			
			String ValoString = datosDiscoteca.getValoracion()+"";
			textArea_Valo.setText(ValoString);
		}
		
		
		DatosLocales datosCafeteria = conexion.getDatosLocales(Cafeterias.nombreLocal);
		
		if (datosCafeteria != null) {
			lbl_titulo.setText(datosCafeteria.getNombre());
			textArea_Ubi.setText(datosCafeteria.getUbicacion());
			textArea_Tipo.setText(datosCafeteria.getTipo());
			
			String ValoString = datosCafeteria.getValoracion()+"";
			textArea_Valo.setText(ValoString);
		}
		
		}
	}
