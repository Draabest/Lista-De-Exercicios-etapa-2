package MediaAritimetica;

import java.util.Scanner; // Scanner para o usuario conseguir usar o software

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // criando o objeto scacnner

        System.out.println("Calculadora de medias aritméticas");

        System.out.print("Digite tres numeros:"); //pede os numeros para o usuario
        Numeros numeros = new Numeros(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());// usa o objeto scan para atribuir o objeto numeros


        // Chama o método calcularMedia da classe Numeros para calcular a média dos três números.
        double media = Numeros.calcularMedia(numeros.getA(), numeros.getB(), numeros.getC());
        System.out.println("A média aritmética é: " + media);

        scan.close(); // Fechando o Scanner


        
    }


}
