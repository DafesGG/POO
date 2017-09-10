package bandaaletoria;

import bandaaletoria.logica.Banda;
import java.util.Random;

public class BandaAletoria {

    public static void main(String[] args) {
        Banda b = new Banda();
        Random rn = new Random();
        int cantidadMusicos = rn.nextInt(15);
        b.crearBanda(cantidadMusicos);
        b.tocarbanda();
    }
    
}
