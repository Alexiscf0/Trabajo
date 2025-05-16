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

public class interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
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
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 69, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuestros Restaurantes");
		lblNewLabel.setForeground(new Color(213, 115, 43));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel.setBounds(102, 10, 220, 47);
		contentPane.add(lblNewLabel);
		
		JButton btn_Macarella = new JButton("Macarella ");
		btn_Macarella.setBackground(new Color(220, 90, 35));
		btn_Macarella.setFont(new Font("Snap ITC", Font.ITALIC, 13));
		btn_Macarella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Restaurante1 Restu = new Restaurante1 ();
				Restu.setVisible(true);
			}
		});
		btn_Macarella.setSelectedIcon(new ImageIcon("C:\\Users\\alexi\\Pictures\\Screenshots\\Captura de pantalla 2025-04-26 173053.png"));
		btn_Macarella.setBounds(31, 55, 117, 21);
		contentPane.add(btn_Macarella);
	}
}
