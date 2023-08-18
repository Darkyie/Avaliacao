import java.util.Scanner;
    // Criação da classe Principal
public class Principal {
    public static void main(String[] args) {
        // Construindo e abrindo o scanner
        Scanner scanner = new Scanner(System.in);
        // Construindo avaliacoes como um vetor de 3 elementos
        Avaliacao[] avaliacoes = new Avaliacao[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual o nome da avaliação? ");
            String nome = scanner.nextLine();
            System.out.println("Qual o tipo de avaliação? ");
            String tipoAvaliacao = scanner.nextLine();
            System.out.println("Qual a nota máxima? ");
            double notaMaxima = scanner.nextDouble();
            scanner.nextLine();
            avaliacoes[i] = new Avaliacao(nome, tipoAvaliacao, notaMaxima);
        }
        // Saida do programa
        for (int i = 0; i < 3; i++) {
            System.out.println(avaliacoes[i]);
        }
                scanner.close();
            }

}
