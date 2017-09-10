package bandaaletoria.logica;

import java.awt.Graphics;

public class Musico {
    Instrumento instrumento;

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
    public void tocarInstrumento(){
        this.instrumento.tocar();
    }
    
    public void presentarInstrumento(Graphics g, int x, int y){
        this.instrumento.dibujar(g, x, y);
    }
    
}
