package Fatorial;

import java.util.Scanner; // Scanner para o usuario conseguir usar o software

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // criando o objeto scacnner

        System.out.println("Calculadora de fatorial");


        System.out.print("Adicione o numero que deseja saber o fatorial:");
        Fatorial f = new Fatorial(scan.nextInt());//Cria o objeto e ao mesmo tempo o atributa
        
        int resultado = f.calcular();//Utiliza o metodo que calcula

        System.out.println("O fatorial de 5 é: " + resultado);  //Joga na tela o resultado

        scan.close();

    }

}
