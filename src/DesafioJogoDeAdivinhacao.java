import java.util.Random;
import java.util.Scanner;

public class DesafioJogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroSorteado = new Random().nextInt(100);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            int numeroDigitado = leitura.nextInt();
            if (numeroDigitado != numeroSorteado) {
                if (numeroDigitado < numeroSorteado) {
                    System.out.println("O número é maior.");
                } else {
                    System.out.println("O número é menor.");
                }
                if (i > 4) {
                    System.out.println("Você não conseguiu acertar o número em " + i + " tentativas. O número era: " + numeroSorteado);
                }
            } else {
                System.out.println("Acertou!");
                break;
            }
        }

        leitura.close();
    }
}
