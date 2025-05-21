package Aplicacion.Aplicacion;

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
		
		JButton btn_Restaurantes = new JButton("Nuestros Restaurantes");
		btn_Restaurantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Restaurantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurantes nuevoIndex = new Restaurantes();
				
				nuevoIndex.setVisible(true);
			}
		});
		btn_Restaurantes.setBounds(10, 104, 198, 55);
		contentPane.add(btn_Restaurantes);
		
		JButton btn_Discotecas = new JButton("Nuestras Discotecas");
		btn_Discotecas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Discotecas nuevoIndex = new Discotecas();
				
				nuevoIndex.setVisible(true);
			}
		});
		btn_Discotecas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Discotecas.setBounds(10, 169, 198, 52);
		contentPane.add(btn_Discotecas);
		
		JButton btn_InicioSesion = new JButton("Iniciar Sesión");
		btn_InicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_InicioSesion.setBounds(457, 106, 198, 52);
		contentPane.add(btn_InicioSesion);
		
		JButton btnNewButton = new JButton("Tus reseñas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						Resenia nuevaresenia = new Resenia();
						
						nuevaresenia.setVisible(true);
			}	
			});
			
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(457, 168, 198, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Valóranos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valoracion valo=new Valoracion();
				
				valo.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(457, 233, 198, 55);
		contentPane.add(btnNewButton_1);
		
		JButton btn_Resenia = new JButton("Nuestras Discotecas");
		btn_Discotecas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resenia nuevaresenia = new Resenia();
				
				nuevaresenia.setVisible(true);
			}	
			
			
		});
	}
}












