import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNotas = 0;
        double notaDoFilme = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a " + i +"ª nota para o filme: ");
            notaDoFilme = leitura.nextDouble();
            mediaNotas += notaDoFilme;
        }

        System.out.println(String.format("Média de avaliação: %.2f", mediaNotas/3));

        leitura.close();
    }
}
