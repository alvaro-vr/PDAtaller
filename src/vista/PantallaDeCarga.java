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

/**
 * La clase PantallaDeCarga representa una ventana de carga para mostrar al iniciar la aplicación.
 * Extiende JFrame y presenta un diseño sin decoración con un JLabel que incluye el nombre de la aplicación,
 * un ícono y un temporizador de espera antes de ocultarse automáticamente. La ventana tiene un diseño BorderLayout
 * con el JLabel centrado en la región central.
 * 
 * @author Alvaro Villares Rodríguez
 * @version 1.0
 */

public class PantallaDeCarga extends JFrame {
	
	/** Etiqueta que muestra el nombre de la aplicación y un ícono de llave inglesa. */
	public JLabel lblNombreApp;
	/**
	 * Crea una nueva instancia de PantallaDeCarga.
	 */
	public PantallaDeCarga() {
		initialize();
	}

	 /**
     * Inicializa el contenido de la ventana de carga, establece propiedades como la ausencia de decoración,
     * ubicación central, ícono y temporizador de espera antes de ocultarse automáticamente.
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
	
	/**
     * Inicia la ventana de carga haciéndola visible y luego espera 3000 milisegundos (3 segundos) antes de ocultarla.
     */
	
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
