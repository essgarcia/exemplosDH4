package figuras;

import figuras.FiguraGeometrica;
import interfaces.Exibir;
import util.ExibirTela;

public class Quadrado extends FiguraGeometrica {
    public Quadrado(Exibir exibir) {
        super(exibir);
    }

    public void posicao(){
        System.out.println("Quadrado: " + getX() + "," + getY());
    }
}
