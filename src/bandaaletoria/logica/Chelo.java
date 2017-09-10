package bandaaletoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Chelo extends Instrumento{

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("dibujando el Chelo");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/chelo.png")).getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el chelo");
    }
    
}
