package figuras;

import figuras.FiguraGeometrica;
import interfaces.Exibir;
import util.ExibirTela;

public class Circulo extends FiguraGeometrica {
    public Circulo(Exibir exibir) {
        super(exibir);
    }

    public void posicao(){
            System.out.println("Circulo: " + getX() + "," + getY());
        }
}
