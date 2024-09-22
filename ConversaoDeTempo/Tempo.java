package ConversaoDeTempo;

public class Tempo {

    //variavel
    private int minutos;

    
    //Getter e Setter
    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    //Metodo de conversao
    public String converter() {
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        return horas + " hora(s) e " + minutosRestantes + " minuto(s)";
    }


    //Construtor
    public Tempo(int minutos) {
        this.minutos = minutos;
    }

    
    
}
