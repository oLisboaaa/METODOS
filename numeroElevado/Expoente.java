package numeroElevado;

import java.lang.Math;

// Define os parâmetros da classe numElevado
class numElevado {
    private double n1;
    private double n2;

    // Construtor da classe
    public numElevado(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Método que efetua a operação
    private double eleva() {
        double resultado = Math.pow(n1, n2); // Math.pow é um método para efetuar operações complexas
        return resultado;
    }

    public double getEleva() {
        return eleva();
    }
}

public class Expoente {
    public static void main(String[] args) {
        // Exemplo de números (podem ser alterados)
        double n1 = 2.0; // Número base
        double n2 = 3.0; // Expoente

        // Cria objeto para puxar o construtor da classe
        numElevado expoente = new numElevado(n1, n2);

        // Puxa o método que vai operar o número selecionado
        double result = expoente.getEleva();

        System.out.print(n1 + " elevado à potência de " + n2 + " resulta em: " + result);
    }
}
