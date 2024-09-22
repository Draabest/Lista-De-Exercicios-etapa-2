package MaiorNumero;

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

    
    //contrutor
    public Numeros(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //Funçao para decicir qual o maior numero 
    public void Maior(){
        if (this.getA() > this.getB() && this.getA()> this.getC()) {

            System.out.println(this.getA());
            
        } else if (this.getB() > this.getA() && this.getB() > this.getC()) {

            System.out.println(this.getB());
            
        } else if (this.getC() > this.getB() && this.getC() > this.getA()) {

            System.out.println(this.getC());
            
        } else{

            System.out.println("Valores Invalidos!");

        }

    }

    

}
