package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VistaInicial extends JFrame{
	public JPanel panelCabecera;
	public JLabel lblNombreApp;
	public JPanel panelFondo;
	public JLabel lblHolaMundo;
	
	public VistaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new JFrame();
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelCabecera = new JPanel();
		panelCabecera.setPreferredSize(new Dimension(0, 60));
		getContentPane().add(panelCabecera, BorderLayout.NORTH);
		panelCabecera.setLayout(new BorderLayout(0, 0));
		
		lblNombreApp = new JLabel(" PDAtaller");
		lblNombreApp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		panelCabecera.add(lblNombreApp, BorderLayout.WEST);
		
		panelFondo = new JPanel();
		getContentPane().add(panelFondo, BorderLayout.CENTER);
		panelFondo.setLayout(new BorderLayout(0, 0));
		
		lblHolaMundo = new JLabel("New label");
		lblHolaMundo.setHorizontalAlignment(SwingConstants.CENTER);
		panelFondo.add(lblHolaMundo);
	}

}
