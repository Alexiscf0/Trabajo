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

public class Cafeterias extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String nombreLocal;

	/**
	 * Create the frame.
	 */
	public Cafeterias(ConexionMySQL conexion) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 69, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cafeterías");
		lblNewLabel.setForeground(new Color(213, 115, 43));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel.setBounds(340, 10, 220, 47);
		contentPane.add(lblNewLabel);
			
		
		//Boton Petisu 
		
		JButton btn_Petisu = new JButton("Petisu");
		btn_Petisu.addActionListener(e -> {
				nombreLocal = "Petisu";
				Index Cafeteria = new Index(conexion);

				Cafeteria.setVisible(true);
		});
		btn_Petisu.setBackground(new Color(220, 90, 35));
		btn_Petisu.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Petisu.setBounds(218, 138, 117, 27);
		contentPane.add(btn_Petisu);
		
		
		//Boton La Cafetera
		
		JButton btn_LaCafetera = new JButton("La Cafetera");
		btn_LaCafetera.addActionListener(e -> {
			nombreLocal = "La Cafetera";
			Index Cafeteria = new Index(conexion);

			Cafeteria.setVisible(true);
	});
		btn_LaCafetera.setFont(new Font("Dialog", Font.ITALIC, 13));
		btn_LaCafetera.setBackground(new Color(220, 90, 35));
		btn_LaCafetera.setBounds(461, 137, 117, 27);
		contentPane.add(btn_LaCafetera);
	}
}
