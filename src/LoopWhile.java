import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNotas = 0;
        double notaDoFilme = 0;
        int totalDeNotas = 0;

        while (notaDoFilme != -1) {
            System.out.println("Digite a " + (totalDeNotas + 1) +"ª nota para o filme [para encerrar, digite -1]: ");
            notaDoFilme = leitura.nextDouble();
            if (notaDoFilme != -1) {
                mediaNotas += notaDoFilme;
                totalDeNotas++;
            }
        }

        if (totalDeNotas <= 0) {
            System.out.println("Nenhuma nota digitada.");
        } else {
            System.out.println(String.format("Média de avaliação: %.2f", mediaNotas/totalDeNotas));
        }

        leitura.close();
    }
}
