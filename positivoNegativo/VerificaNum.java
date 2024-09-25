package positivoNegativo;

// Define a classe PosNeg
class PosNeg {
    private int n1;
    private String resultado;

    // Construtor da classe
    public PosNeg(int n1) {
        this.n1 = n1;
    }

    // Método para verificar se o número é positivo ou negativo
    public String verificaPosNeg() {
        // Verifica se o número é maior ou igual a zero
        if (n1 >= 0) {
            resultado = "positivo";
        } else {
            resultado = "negativo";
        }
        return resultado;
    }
}

public class VerificaNum {
    public static void main(String[] args) {
        // Exemplo de número (pode ser alterado)
        int n1 = -5; // Altere este valor para testar

        // Cria um objeto da classe
        PosNeg posNeg = new PosNeg(n1);

        // Chama o método verificaPosNeg para determinar se o número é positivo ou negativo
        String resultado = posNeg.verificaPosNeg();

        System.out.println("O número " + n1 + " é " + resultado);
    }
}
