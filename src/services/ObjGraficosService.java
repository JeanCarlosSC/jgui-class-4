package services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ObjGraficosService {
    public static ImageIcon crearImagen(int ancho, int alto, String rutaImagen) {
        ImageIcon imagen = new ImageIcon(rutaImagen);
        ImageIcon aux = new ImageIcon(
            imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING)
        );
        return aux;
    }

    public static JButton crearBotonTexto(
            int x, int y, int ancho, int alto, String texto, Color cFondo,Color cLetra) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setFocusable(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setBackground(cFondo);
        boton.setForeground(cLetra);
        return boton;
    }

    public static JButton crearBotonImagen(int x, int y, int ancho, int alto, String rutaImagen) {
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        boton.setIcon(crearImagen(ancho, alto, rutaImagen));
        boton.setContentAreaFilled(false);
        boton.setBorder(null);
        return boton;
    }
}
