package bandaaletoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Violin extends Instrumento {

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("dibujando el violin");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/violin.png")).getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el violin");
    }

}
