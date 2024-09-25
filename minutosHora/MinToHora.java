package minutosHora;

// Definição dos parâmetros da classe Minutos
class Minutos {
    private int minutos;

    // Construtor da classe
    public Minutos(int minutos) {
        this.minutos = minutos;
    }

    // Método que converte os minutos em horas
    private String hrToMin() {
        int horas = minutos / 60;
        int min = minutos % 60;

        String horaFormat = String.format(horas + ":" + min);
        return horaFormat;
    }

    // Método para puxar as horas formatadas
    public String getHrToMin() {
        return hrToMin();
    }
}

public class MinToHora {
    public static void main(String[] args) {
        // Exemplo de minutos a serem convertidos (pode ser alterado)
        int minutos = 130;

        // Objeto para puxar o construtor da classe
        Minutos horasMinutos = new Minutos(minutos);

        // Variável para puxar o método formatador
        String hrFormat = horasMinutos.getHrToMin();

        System.out.println(minutos + " minutos em horas são " + hrFormat + " horas");
    }
}
