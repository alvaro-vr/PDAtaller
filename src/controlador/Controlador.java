package controlador;

import modelo.Modelo;
import vista.VistaInicial;
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
		iniciarManejadores();
		miVista.getJFrame().setVisible(true);
	}
	
	
	//Metodo privado que inicializa los escuchadores de los eventos
	private void iniciarManejadores() {
		ManejadorBotones manejadorBotones= new ManejadorBotones(miVista);
		miVista.hola.addMouseListener(manejadorBotones);
		miVista.adios.addMouseListener(manejadorBotones);
	}
}
