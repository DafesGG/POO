package bandaaletoria.logica;

import java.awt.Graphics;

public abstract class Instrumento {
    
    public abstract void dibujar(Graphics g, int x, int y);
    
    public abstract void tocar();
    
}
