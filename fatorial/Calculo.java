package fatorial;

// Define a classe Fatorial
class Fatorial {
    private double n1;
    
    // Construtor da classe para definir os atributos da classe
    public Fatorial(double n1) {
        this.n1 = n1;
    }

    // Metodo que faz o calculo do numero n1
    private double fazFator() {
        double numero = n1;
        double multiplicação = n1;

        while (numero > 1) {
            multiplicação = multiplicação * (numero - 1);
            numero--;
        }

        return multiplicação; // Retorna o resultado da operação
    }

    public double getFazFator() {
        return fazFator();
    }
}

// Cria a class main
public class Calculo {
    public static void main(String[] args) {

        double n1 = 5;
        // Cria o objeto do construtor da classe Fatorial
        Fatorial fatorial = new Fatorial(n1);

        // Cria uma variável para realizar a operação
        Double resultado = fatorial.getFazFator();

        // Exibe o resultado final
        System.out.print("O valor fatorial de " + n1 + " é igual a:\n" + resultado);
    }
}
