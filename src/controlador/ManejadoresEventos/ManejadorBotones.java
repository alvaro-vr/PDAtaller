package controlador.ManejadoresEventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vista.VistaInicial;

public class ManejadorBotones implements MouseListener {
	
	VistaInicial miVista;
	
	public ManejadorBotones(VistaInicial miVista) {
		this.miVista = miVista;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == miVista.hola) {
			System.out.println("Hola a ti tambien!");
		}else if(e.getSource() == miVista.adios) {
			System.out.println("Adios pringao ... ");
		}
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
