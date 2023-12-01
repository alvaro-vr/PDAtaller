package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PantallaDeCarga {

	public JFrame frame;
	/**
	 * Create the application.
	 */
	public PantallaDeCarga() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNombreApp = new JLabel("  PDAtaller");
		lblNombreApp.setIcon(new ImageIcon(PantallaDeCarga.class.getResource("/vista/resources/llave-inglesa.png")));
		lblNombreApp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 45));
		lblNombreApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreApp.setForeground(Color.WHITE);
		frame.getContentPane().add(lblNombreApp);
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void iniciarPantallaDeCarga() {
		frame.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			frame.setVisible(false);
		}

	}

}
