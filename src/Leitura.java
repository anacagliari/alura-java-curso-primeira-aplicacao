import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento do filme: ");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua nota para o filme [0-10]: ");
        double notaDoFilme = leitura.nextDouble();

        System.out.println(String.format("Nome do filme: %s | Ano de Lançamento: %d | Sua nota: %.2f", filme, anoLancamento, notaDoFilme));

        leitura.close();
    }
}
