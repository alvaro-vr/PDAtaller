
import modelo.Modelo;
import vista.VistaInicial;
import controlador.Controlador;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaInicial miVista = new VistaInicial();
		Modelo miModelo = new Modelo();
		Controlador miControlador = new Controlador(miModelo, miVista);
		miControlador.iniciarApp();
	}

}
