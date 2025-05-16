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

public class Restaurantes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String nombreLocal = null;
	//static String ArrayRestu = ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurantes frame = new Restaurantes();
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
	public Restaurantes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 69, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuestros Restaurantes");
		lblNewLabel.setForeground(new Color(213, 115, 43));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel.setBounds(340, 10, 220, 47);
		contentPane.add(lblNewLabel);
			
		
		//Boton macarella 
		
		JButton btn_Macarella = new JButton("Macarella");
		btn_Macarella.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				nombreLocal = "Macarella";
				Index Restu = new Index ();

				Restu.setVisible(true);
			}
		});
		//btn_Macarella.setSelectedIcon(new ImageIcon("C:\\Users\\alexi\\Pictures\\Screenshots\\Captura de pantalla 2025-04-26 173053.png"));
		btn_Macarella.setBackground(new Color(220, 90, 35));
		btn_Macarella.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Macarella.setBounds(31, 307, 117, 27);
		contentPane.add(btn_Macarella);
		
		
		//Boton taberna manue
		
		JButton btn_Manue = new JButton("Taberna Manue");
		btn_Manue.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
				 nombreLocal = "Taberna Manue";
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
				 nombreLocal = "Cateto";
				 Index Restu3 = new Index();
				
				Restu3.setVisible(true);
			}
		});
		//btn_Cateto.setSelectedIcon(new ImageIcon("C:\\Users\\alexi\\Pictures\\Screenshots\\Captura de pantalla 2025-04-26 173053.png"));
		btn_Cateto.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Cateto.setBackground(new Color(220, 90, 35));
		btn_Cateto.setBounds(31, 381, 157, 27);
		contentPane.add(btn_Cateto);
	}
}
