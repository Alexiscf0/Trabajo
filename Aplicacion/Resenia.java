package Aplicacion.Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Resenia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resenia frame = new Resenia();
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
	public Resenia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tus reseñas...");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(143, 39, 274, 86);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea_rese = new JTextArea();
		textArea_rese.setBounds(67, 161, 730, 318);
		contentPane.add(textArea_rese);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(297, 72, 194, 27);
		contentPane.add(comboBox);
		
		ConexionMySQL conexion = new ConexionMySQL("sql7779162", "LgB4QjTGIx", "sql7779162");
		try {
			conexion.conectar();
			String sentencia= "SELECT * FROM locales WHERE Nombre = '" + Restaurantes.nombreLocal + "'";
			ResultSet x = conexion.ejecutarSelect(sentencia);

		while (x.next()!=false) {
				
					String ubicacion=x.getString("Ubicacion");
				textArea_rese.setText(ubicacion);
						
			}
		conexion.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
