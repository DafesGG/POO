package bandaaletoria.gui;

import bandaaletoria.logica.Banda;
import bandaaletoria.logica.Guitarra;
import bandaaletoria.logica.Instrumento;
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

public class Lienzo extends Canvas{

    @Override
    public void paint(Graphics g) {
        Banda b = new Banda();
        Random rn = new Random();
        int cantidadMusicos = rn.nextInt(15);
        b.crearBanda(cantidadMusicos);
        b.presentarbanda(g);
        b.tocarbanda();
    }
    
    
    
}
