package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre app");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(363, 10, 122, 63);
		contentPane.add(lblNewLabel);
		
		JButton btn_Restaurante = new JButton("Nuestros restaurantes.");
		btn_Restaurante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Restaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurantes nuevoIndex = new Restaurantes();
				
				nuevoIndex.setVisible(true);
			}
		});
		btn_Restaurante.setBounds(10, 80, 198, 55);
		contentPane.add(btn_Restaurante);
		
		JButton btn_Restaurante_1 = new JButton("Nuestras Discotecas");
		btn_Restaurante_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Discoteca Disco = new Discoteca();
				
				Disco.setVisible(true);
			}
		});
		btn_Restaurante_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Restaurante_1.setBounds(10, 163, 198, 52);
		contentPane.add(btn_Restaurante_1);
		
		
		//Boton cafe 
		
		JButton btn_Cafe = new JButton("Nuestras Cafeterías");
		btn_Cafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cafeteria Cafe = new Cafeteria();
				
				Cafe.setVisible(true);
				
			}
		});
		btn_Cafe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Cafe.setBounds(10, 243, 198, 52);
		contentPane.add(btn_Cafe);
		
			
			
			
	}
}
