package MaiorNumero;

import java.util.Scanner; // Scanner para o usuario conseguir usar o software

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // criando o objeto scacnner

        System.out.println("Mostrador de maior numero");


        System.out.print("Digite os numeros:"); //pede os numeros para o usuario
        Numeros numeros = new Numeros(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()); // usa o objeto scan para atribuir o objeto numeros

        numeros.Maior();

        scan.close();
    }
}
