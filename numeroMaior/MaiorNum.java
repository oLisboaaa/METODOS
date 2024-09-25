package numeroMaior;

// Define os parâmetros da classe numeroMaior
class numeroMaior {

    private double n1;
    private double n2;
    private double n3;

    // Construtor da classe
    public numeroMaior(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // Método que separa o número maior
    private double checkNum() {
        double maior;

        if (n2 < n1 && n3 < n1) { // se n1 for maior que n2 e n3
            maior = n1; // n1 é o maior
        } else if (n1 < n2 && n3 < n2) { // se n2 for maior que n3 e n1
            maior = n2; // n2 é o maior
        } else { // se não, n3 é o maior
            maior = n3;
        }

        return maior;
    }

    public double getCheckNum() {
        return checkNum();
    }
}

public class MaiorNum {
    public static void main(String[] args) {
        // Exemplos de números (podem ser alterados)
        double n1 = 5.0;
        double n2 = 10.0;
        double n3 = 7.0;

        // Cria o objeto da classe
        numeroMaior numero = new numeroMaior(n1, n2, n3);

        // Checa qual o número maior de acordo com os valores definidos
        double resultado = numero.getCheckNum();

        System.out.print("\n\nO maior número entre: " + n1 + ", " + n2 + " e " + n3 + " é o número: " + resultado);
    }
}
