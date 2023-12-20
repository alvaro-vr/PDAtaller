package modelo;

import java.awt.Color;


/**
 * La clase Look define un conjunto de colores utilizados para personalizar la apariencia visual de la interfaz gráfica de usuario.
 * Incluye colores para la cabecera, la fuente de la cabecera, el fondo y la fuente del fondo. Estos colores son públicos y finales,
 * lo que significa que no se pueden modificar después de su asignación inicial.
 * 
 * Los colores predefinidos son:
 * - CABECERA: Color oscuro para la cabecera.
 * - FUENTE_CABECERA: Color blanco para la fuente de la cabecera.
 * - FONDO: Color blanco para el fondo.
 * - FUENTE_FONDO: Color negro para la fuente del fondo.
 * 
 * Estos colores pueden ser utilizados para mejorar la coherencia visual y la experiencia del usuario en la aplicación.
 * 
 * @author Alvaro Villares Rodríguez
 * @version 1.0
 */
public class Look {
	 /** Color para la cabecera. */
    public final Color CABECERA = Color.DARK_GRAY;

    /** Color para la fuente de la cabecera. */
    public final Color FUENTE_CABECERA = Color.WHITE;

    /** Color para el fondo. */
    public final Color FONDO = Color.WHITE;

    /** Color para la fuente del fondo. */
    public final Color FUENTE_FONDO = Color.BLACK;
}
