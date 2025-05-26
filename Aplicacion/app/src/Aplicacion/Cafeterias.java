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
	private final ConexionMySQL conexion;

	/**
	 * Create the frame.
	 */
	public Cafeterias(ConexionMySQL conexion) {
		this.conexion = conexion;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 69, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuestras Cafeterías");
		lblNewLabel.setForeground(new Color(213, 115, 43));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel.setBounds(340, 10, 220, 47);
		contentPane.add(lblNewLabel);
			
		
		//Boton Petisu 
		
		JButton btn_Petisu = new JButton("Petisu");
		btn_Petisu.addActionListener(e -> {
				nombreLocal = "Petisu";
				Index Cafeteria = new Index (this.conexion);

				Cafeteria.setVisible(true);
		});
		//btn_Macarella.setSelectedIcon(new ImageIcon("C:\\Users\\alexi\\Pictures\\Screenshots\\Captura de pantalla 2025-04-26 173053.png"));
		btn_Petisu.setBackground(new Color(220, 90, 35));
		btn_Petisu.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Petisu.setBounds(31, 155, 143, 39);
		contentPane.add(btn_Petisu);
		
		JButton btn_Petisu_1 = new JButton("La cafetera");
		btn_Petisu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Petisu_1.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Petisu_1.setBackground(new Color(220, 90, 35));
		btn_Petisu_1.setBounds(31, 87, 143, 39);
		contentPane.add(btn_Petisu_1);
		
		JButton btn_Petisu_2 = new JButton("Bonnet");
		btn_Petisu_2.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Petisu_2.setBackground(new Color(220, 90, 35));
		btn_Petisu_2.setBounds(31, 217, 143, 47);
		contentPane.add(btn_Petisu_2);
		
		JButton btn_Petisu_3 = new JButton("La casa");
		btn_Petisu_3.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Petisu_3.setBackground(new Color(220, 90, 35));
		btn_Petisu_3.setBounds(31, 289, 143, 39);
		contentPane.add(btn_Petisu_3);
		
		//Boton taberna manue
		
	/*	JButton btn_Manue = new JButton("Taberna Manue");
		btn_Manue.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
				 nombreRestaurante = "Taberna Manue";
				 Index Restu2 = new Index();
				
				Restu2.setVisible(true);
			}
		});
		//btn_Manue.setSelectedIcon(new ImageIcon("C:\\Users\\alexi\\Pictures\\Screenshots\\Captura de pantalla 2025-04-26 173053.png"));
		btn_Manue.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Manue.setBackground(new Color(220, 90, 35));
		btn_Manue.setBounds(31, 344, 157, 27);
		contentPane.add(btn_Manue);
		
		
		//Boton Cateto
		
		JButton btn_Cateto = new JButton("El cateto");
		btn_Cateto.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
				 nombreRestaurante = "Cateto";
				 Index Restu3 = new Index();
				
				Restu3.setVisible(true);
			}
		});
		//btn_Cateto.setSelectedIcon(new ImageIcon("C:\\Users\\alexi\\Pictures\\Screenshots\\Captura de pantalla 2025-04-26 173053.png"));
		btn_Cateto.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Cateto.setBackground(new Color(220, 90, 35));
		btn_Cateto.setBounds(31, 381, 157, 27);
		contentPane.add(btn_Cateto);
		*/
	}
}
