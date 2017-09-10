package bandaaletoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Bajo extends Instrumento{

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("Dibujando el bajo");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/bajo.png")).getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el bajo");
    }
    
}
