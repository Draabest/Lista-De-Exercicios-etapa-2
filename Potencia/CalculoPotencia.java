package Potencia;

public class CalculoPotencia {

    //Variaveis
    private float a;
    private float b;


    //Getters e Setters
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }


    //Contrutor
    public CalculoPotencia(float a, float b) {
        this.a = a;
        this.b = b;
    }

    //Metodo usado para calcular o resultado
    public static double calcularPotencia(double a, double b) {
        return Math.pow(a, b);
    }

}
