package figuras;
import util.ExibirTela;

public class AppFigura {
    public static void main(String[] args) {
        ExibirTela ex1 = new ExibirTela();
        //Exibir ex2 = new ExibirTela();

        Circulo c1 = new Circulo(ex1);
        FiguraGeometrica f1 = new Circulo(ex1);
        FiguraGeometrica f2 = new Quadrado(ex1);

        f1.posicao();
        f2.posicao();

    }
}
