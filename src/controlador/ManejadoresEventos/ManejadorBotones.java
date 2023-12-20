package controlador.ManejadoresEventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import vista.VistaInicial;

/**
 * El manejador de eventos ManejadorBotones implementa la interfaz MouseListener para gestionar eventos de ratón
 * en relación con los botones de la interfaz gráfica de usuario. Se asocia principalmente con la clase VistaInicial.
 * 
 * Este manejador proporciona métodos vacíos para todos los eventos de ratón, ya que su implementación concreta dependerá
 * de las necesidades específicas de la aplicación. Se espera que esta clase se extienda y sus métodos se sobrescriban según sea necesario.
 * 
 * @author Alvaro Villares Rodríguez
 * @version 1.0
 */

public class ManejadorBotones implements MouseListener {
	
	 /** La vista asociada a este manejador de eventos. */
	VistaInicial miVista;
	
	 /**
     * Crea una nueva instancia de ManejadorBotones asociada a una vista específica.
     * 
     * @param miVista La vista a la que se asociará este manejador.
     */
	public ManejadorBotones(VistaInicial miVista) {
		this.miVista = miVista;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
