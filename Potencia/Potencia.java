package Potencia;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de potencias");
        
        
        System.out.println("Digite dois numeros:");
        CalculoPotencia potencia = new CalculoPotencia(scan.nextFloat(), scan.nextFloat());


        //Metodo para o calculo
        double resultado = CalculoPotencia.calcularPotencia(potencia.getA(), potencia.getB());
        System.out.println(potencia.getA() + " elevado a " + potencia.getB() + " é: " + resultado);

        scan.close(); // Fechando o Scanner
    }

}