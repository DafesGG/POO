package bandaaletoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.sound.sampled.*;

public class Guitarra extends Instrumento {

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("Dibujando la Guitarra");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/guitarra.png")).getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        AudioInputStream sound = null;
        try {
            File soundFile = new File(this.getClass().getResource("../sonidos/guitarra.wav").toURI());

            sound = AudioSystem.getAudioInputStream(soundFile);
           
            DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
            Clip clip;

            clip = (Clip) AudioSystem.getLine(info);

            clip.open(sound);
            
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                sound.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
