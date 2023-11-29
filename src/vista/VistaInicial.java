package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class VistaInicial {

	private JFrame frame;
	public JButton hola;
	public JButton adios;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		hola = new JButton("hol");
		frame.getContentPane().add(hola, BorderLayout.SOUTH);
		
		adios = new JButton("adios");
		frame.getContentPane().add(adios, BorderLayout.NORTH);
	}
	
	public JFrame getJFrame() { return frame; }

}
