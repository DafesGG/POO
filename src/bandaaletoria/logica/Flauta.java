package bandaaletoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Flauta extends Instrumento{

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("dibujando la flauta");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/flauta.png")).getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la flauta");
    }
    
}
