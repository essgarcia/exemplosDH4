package util;

import interfaces.Exibir;

public class ExibirTela implements Exibir {
    @Override
    public void show(String msg) {
        System.out.println(msg);
    }
}
