package ConversaoDeTempo;

import java.util.Scanner; // Scanner para o usuario conseguir usar o software

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // criando o objeto scacnner

        System.out.println("Conversor de minutos em horas");

        System.out.print("Digite o minuto a ser convertido:"); //pede os numeros para o usuario
        Tempo minutos = new Tempo(scan.nextInt());// usa o objeto scan para atribuir o objeto minutos


        System.out.println(minutos.converter()); // joga na tela o resultado
        
        
        scan.close();
    }

}
