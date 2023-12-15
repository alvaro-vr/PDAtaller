package controlador;

import modelo.Look;
import modelo.Modelo;
import vista.PantallaDeCarga;
import vista.VistaInicial;

import java.util.Map;

import controlador.ManejadoresEventos.*;

public class Controlador {
	//Variables del controlador
	private Modelo miModelo;
	private VistaInicial miVista;
	
	//Constructor del controlador
	public Controlador(Modelo miModelo, VistaInicial miVista) {
		this.miModelo = miModelo;
		this.miVista = miVista;
	}
	
	public void iniciarApp() {
		PantallaDeCarga pantallaCarga = new PantallaDeCarga();
		iniciarManejadores();
		configurarColores(pantallaCarga);
		pantallaCarga.iniciarPantallaDeCarga();
		miVista.setVisible(true);
	}
	
	//Metodo privado que inicializa los escuchadores de los eventos
	private void iniciarManejadores() {
		ManejadorBotones manejadorBotones= new ManejadorBotones(miVista);
	}
	
	private void configurarColores(PantallaDeCarga p) {
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
