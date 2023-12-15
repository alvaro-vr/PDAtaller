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
import java.awt.BorderLayout;

public class PantallaDeCarga extends JFrame {
	public JLabel lblNombreApp;
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
		new JFrame();
		setUndecorated(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		lblNombreApp = new JLabel("  PDAtaller");
		lblNombreApp.setBackground(Color.BLACK);
		lblNombreApp.setIcon(new ImageIcon(PantallaDeCarga.class.getResource("/vista/resources/llave-inglesa.png")));
		lblNombreApp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 45));
		lblNombreApp.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNombreApp);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void iniciarPantallaDeCarga() {
		setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			setVisible(false);
		}

	}

}
