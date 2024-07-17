import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        // desafios 01.
        String nome = "Ana Caroline";
        System.out.println("Eu, " + nome + ", concluí a aula 01 e agora estou mergulhando em Java!");

        int x = 10;
        int y = 5;

        int soma = x + y;
        System.out.println("A soma entre " + x + " e " + y + " é igual a " + soma);

        int subtracao = x - y;
        System.out.println("A subtração entre " + x + " e " + y + " é igual a " + subtracao);

        // desafios 02.
        double temperaturaCelsius = 16.5;
        double converteTemperatura = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em graus Celsius " + temperaturaCelsius
                + "°C convertida para grau Fahrenheit é de " + converteTemperatura + "°F");

        int media = (int) (temperaturaCelsius + converteTemperatura) / 2;
        System.out.println("A média é: " + media);

        char letra = 'D';
        String palavra = "esafio";
        System.out.println(letra + palavra);

        double precoProduto = 14.99;
        int quantidade = 7;
        System.out.println("Valor total: RS " + (precoProduto * quantidade));

        double valorEmDolar = 234.82;
        double cotacaoEmReal = 5.495; // dia 17.07.2024
        double conversaoParaReal = valorEmDolar * cotacaoEmReal;
        System.out.println(String.format("Valor convertido de US$ %.2f para R$ %.2f", valorEmDolar, conversaoParaReal));

        double precoOriginal = 29.80;
        double percentualDesconto = precoOriginal * 0.1;
        double valorTotalDesconto = precoOriginal - percentualDesconto;
        System.out.println("Valor com desconto: R$ " + valorTotalDesconto);

        // desafios 03.
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int numeroNatural = leitura.nextInt();

        if (numeroNatural > 0) { // positivo ou negativo
            System.out.println("O número " + numeroNatural + " é positivo.");
        } else if (numeroNatural < 0) {
            System.out.println("O número " + numeroNatural + " é negativo.");
        } else {
            System.out.println("O número " + numeroNatural + " é ZERO.");
        }

        for (int i = 1; i < 11; i++) { // tabuada
            int numeroMultiplicado = numeroNatural * i;
            System.out.println(numeroNatural + " X " + i + " = " + numeroMultiplicado);
        }

        if (numeroNatural != 0) { // par ou impar
            if (numeroNatural % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        }

        int fatorial = 1; // fatorial
        for (int i = 1; i <= numeroNatural; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numeroNatural + " é: " + fatorial);

        System.out.println("Digite um valor inteiro: "); // iguais, maior que, menor que
        int valor1 = leitura.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int valor2 = leitura.nextInt();
        if (valor1 == valor2) {
            System.out.println("Os números são iguais.");
        } else {
            if (valor1 > valor2) {
                System.out.println("O número " + valor1 + " é maior que o número " + valor2);
            } else {
                System.out.println("O número " + valor1 + " é menor que o número " + valor2);
            }
        }

        System.out.println("""
                MENU:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                Digite a opção escolhida:
                """);
        int opcao = leitura.nextInt();
        switch (opcao) {
            case 1: // Calcular área do quadrado
                System.out.println("Digite o valor do lado do quadrado [m]: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado + "m².");
                break;
            case 2: // Calcular área do círculo
                System.out.println("Digite o valor do raio do círculo [m]: ");
                double raio = leitura.nextDouble();
                double areaCirculo = Math.PI * (raio * raio);
                System.out.println(String.format("A área do círculo é: %.2f m².", areaCirculo));
            default:
                break;
        }

        leitura.close();
    }
}
