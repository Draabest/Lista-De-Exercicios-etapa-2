package PositivoNegativo;

import java.util.Scanner; // Scanner para o usuario conseguir usar o software

public class VerificadorDeNumero {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // criando o objeto scacnner
    
    
    System.out.println("Verificador de numeros positivos/negativos");
    
   
    System.out.print("digite o numero:");  //pede o numero para o usuario
    Num numero = new Num(scan.nextFloat()); // usa o objeto scan para atribuir o objeto numero

    numero.verificar(); //verifica e mostra na tela se o numero e positivo, negativo ou se nao e um numero


    scan.close();// fechando o objeto scan
}
    

}