package MediaAritimetica;

public class Numeros {

    //Variaveis
    private double a;
    private double b;
    private double c;


    
   //Getters e Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    //Contrutor
    public Numeros(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    //Metodo que calcula a medias
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
        
    } 
        
}
