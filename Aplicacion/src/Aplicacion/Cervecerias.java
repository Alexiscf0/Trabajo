package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cervecerias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String nombreLocal = null;

	/**
	 * Create the frame.
	 */
	public Cervecerias(ConexionMySQL conexion) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 69, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cervecerías");
		lblNewLabel.setForeground(new Color(213, 115, 43));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel.setBounds(340, 10, 220, 47);
		contentPane.add(lblNewLabel);
			
		
		//Boton macarella 
		
		JButton btn_LaParaita = new JButton("La Paraita");
		btn_LaParaita.addActionListener(e -> {
				nombreLocal = "La Paraita";
				Index Restu = new Index(conexion);
				Restu.setVisible(true);
		});
		btn_LaParaita.setBackground(new Color(220, 90, 35));
		btn_LaParaita.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_LaParaita.setBounds(238, 105, 117, 27);
		contentPane.add(btn_LaParaita);
		
		
		//Boton taberna manue
		
		JButton btn_Monstruo = new JButton("Monstruo de la Cerveza");
		btn_Monstruo.addActionListener(e -> {
			nombreLocal = "Monstruo de la Cerveza";
			Index Restu = new Index(conexion);
			Restu.setVisible(true);
	});
		btn_Monstruo.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Monstruo.setBackground(new Color(220, 90, 35));
		btn_Monstruo.setBounds(425, 105, 213, 27);
		contentPane.add(btn_Monstruo);
	}
}
