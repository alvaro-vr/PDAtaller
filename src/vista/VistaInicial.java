package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;

public class VistaInicial {

	private JFrame frame;
	private JPanel panelCabecera;
	private JLabel lblNombreApp;

	/**
	 * Create the application.
	 */
	public VistaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelCabecera = new JPanel();
		panelCabecera.setPreferredSize(new Dimension(0, 60));
		panelCabecera.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panelCabecera, BorderLayout.NORTH);
		panelCabecera.setLayout(new BorderLayout(0, 0));
		
		lblNombreApp = new JLabel(" PDAtaller");
		lblNombreApp.setForeground(Color.WHITE);
		lblNombreApp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		panelCabecera.add(lblNombreApp, BorderLayout.WEST);
	}
	
	public JFrame getJFrame() { return frame; }

}
