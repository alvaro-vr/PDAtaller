package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * La clase VistaInicial representa la interfaz gráfica inicial de la aplicación.
 * Extiende JFrame y consta de una cabecera con el nombre de la aplicación y un panel de fondo
 * que puede contener componentes adicionales. La interfaz está configurada con un tamaño predeterminado de 1000x600 píxeles,
 * centrada en la pantalla y se cierra al hacer clic en el botón de cierre. La cabecera incluye el nombre de la aplicación ("PDAtaller")
 * con un estilo de fuente específico. El panel de fondo se utiliza para colocar elementos visuales adicionales,
 * como el JLabel "lblHolaMundo", que se centra horizontalmente.
 * 
 * @author Alvaro Villares Rodríguez
 * @version 1.0
 */

public class VistaInicial extends JFrame{
	/** Panel en la región norte de la interfaz para elementos de la cabecera. */
    public JPanel panelCabecera;

    /** Etiqueta que muestra el nombre de la aplicación en la cabecera. */
    public JLabel lblNombreApp;

    /** Panel en la región central de la interfaz para organizar componentes adicionales. */
    public JPanel panelFondo;

    /** Etiqueta en el panelFondo, inicializada como "New label" y centrada horizontalmente. */
    public JLabel lblHolaMundo;

    /**
     * Crea una nueva instancia de VistaInicial y llama al método de inicialización.
     */
    public VistaInicial() {
        initialize();
    }

    /**
     * Inicializa los contenidos de la interfaz, establece propiedades como tamaño, posición y cierre al hacer clic en el botón.
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
