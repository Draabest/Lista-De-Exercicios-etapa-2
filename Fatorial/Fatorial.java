package Fatorial;

public class Fatorial {

    private int numero;

    public Fatorial(int numero) {
        this.numero = numero;
    }

    public int calcular() {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}
