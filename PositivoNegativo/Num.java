package PositivoNegativo;

public class Num {

    private float numero; //Instanciando a variavel para a verificaçao



    //getter e setter para a utilizaçao
    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }


    public Num(float numero) {
        this.numero = numero;
    }


    //verificaçao
    public void verificar(){

        if (numero >=0) {

            System.out.println("O numero e positivo");
            
        } else if (numero <0) {

            System.out.println("O numero e negativo");
            
        } else{

            System.out.println("CARACTER INVALIDO!!!");

        }

    } 

}
