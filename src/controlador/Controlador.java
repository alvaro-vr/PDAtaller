package controlador;

import modelo.Look;
import modelo.Modelo;
import vista.PantallaDeCarga;
import vista.VistaInicial;

import java.util.Map;


/**
 * @author Alvaro Villares Rodriguez 2ºDAM
 * Clase controladora del programa, en la que maneja los eventos de las vistas y las conecta con el modelo.
 */

import controlador.ManejadoresEventos.*;

public class Controlador {
	//Variables del controlador
	
	/**
	 * Atributo modelo de la clase {@link Modelo}, de donde se cogerán los datos y sean manejados por {@link Controlador}
	 */
	private Modelo miModelo;
	
	/**
	 * Atributo de la GUI definida por la clase {@link VistaInicial}, en la que sucederán eventos y sean manejados por {@link Controlador}
	 */
	private VistaInicial miVista;
	
	//Constructor del controlador
	/**
	 * Constructor con parametros del Controlador
	 * @param miModelo es el modelo donde se halla los datos
	 * @param miVista es la vista / GUI que verá el usuario donde se iniciarán los eventos producidos
	 */
	public Controlador(Modelo miModelo, VistaInicial miVista) {
		this.miModelo = miModelo;
		this.miVista = miVista;
	}
	
	
	/**
	 * Método que ejecuta la app, iniciando la pantalla de carga y la VistaInicial
	 */
	public void iniciarApp() {
		PantallaDeCarga pantallaCarga = new PantallaDeCarga();
		iniciarManejadores();
		configurarColores(pantallaCarga, miVista);
		pantallaCarga.iniciarPantallaDeCarga();
		miVista.setVisible(true);
	}
	
	//Metodo privado que inicializa los escuchadores de los eventos
	/**
	 * Método que inicializa los manejadores/escuchadores de los eventos de las vistas
	 */
	private void iniciarManejadores() {
		ManejadorBotones manejadorBotones= new ManejadorBotones(miVista);
	}
	
	
	/**
	 * Método para configurar los colores de la aplicación
	 * @param pantallaCarga es la pantalla previa a la aplicación que carga los componentes de la misma durante unos segundos
	 * @param miVista es la Vista Inicial despues de ser cargada la aplicación
	 */
	private void configurarColores(PantallaDeCarga p, VistaInicial miVista) {
		Look lookPDA = new Look();
		
		//pantalla de carga
		p.getContentPane().setBackground(lookPDA.CABECERA);
		p.lblNombreApp.setForeground(lookPDA.FUENTE_CABECERA);
		
		miVista.panelCabecera.setBackground(lookPDA.CABECERA);
		miVista.panelFondo.setBackground(lookPDA.FONDO);
		
		//Fuentes de letra.
		miVista.lblNombreApp.setForeground(lookPDA.FUENTE_CABECERA);
		miVista.lblHolaMundo.setForeground(lookPDA.FUENTE_FONDO);
	}
}
