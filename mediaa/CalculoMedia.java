package mediaa;

// Define a classe Media
class Media {
    private double n1; // n1 = numero 1
    private double n2; // n2 = numero 2
    private double n3; // n3 = numero 3

    // Cria o construtor da classe que define os atributos da classe
    public Media(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // Variável privada para realizar a operação matemática
    private double dividir() {
        double mediaFeita = (n1 + n2 + n3) / 3; // Soma todos os números e divide pela quantidade de elementos
        return mediaFeita; // Retorna a operação realizada
    }

    // Puxa a variável privada e a torna pública
    public double getDividir() {
        return dividir();
    }
}

public class CalculoMedia {
    public static void main(String[] args) {
        // Exemplos de números (podem ser alterados)
        double n1 = 5.0;
        double n2 = 7.0;
        double n3 = 9.0;

        // Cria uma instância da classe Media com os dados necessários
        Media media = new Media(n1, n2, n3);

        // Calcula o resultado com base no método privado criado anteriormente
        double resultado = media.getDividir();

        // Exibe resultados
        System.out.println("\n\nA média aritmética dos números " + n1 + ", " + n2 + " e " + n3 + " é de: " + resultado);
    }
}
