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

public class Discotecas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String nombreLocal;
	private final ConexionMySQL conexion;
	
	/**
	 * Create the frame.
	 */
	public Discotecas(ConexionMySQL conexion) {
		this.conexion = conexion;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 69, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuestras Discotecas");
		lblNewLabel.setForeground(new Color(213, 115, 43));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel.setBounds(340, 10, 220, 47);
		contentPane.add(lblNewLabel);
			
		
		//Boton Koko 
		
		JButton btn_Koko = new JButton("Koko");
		btn_Koko.addActionListener(e -> {
				nombreLocal = "Koko";
				Index Discoteca = new Index (this.conexion);

				Discoteca.setVisible(true);
		});
		//btn_Macarella.setSelectedIcon(new ImageIcon(""));
		btn_Koko.setBackground(new Color(220, 90, 35));
		btn_Koko.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Koko.setBounds(31, 307, 117, 27);
		contentPane.add(btn_Koko);
	}
}
