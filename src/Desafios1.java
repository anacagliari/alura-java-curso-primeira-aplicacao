public class Desafios1 {
    public static void main(String[] args) {
        String nome = "Ana Caroline";
        System.out.println("Eu, " + nome + ", concluí a aula 01 e agora estou mergulhando em Java!");

        int x = 10;
        int y = 5;

        int soma = x + y;
        System.out.println("A soma entre " + x + " e " + y + " é igual a " + soma);

        int subtracao = x - y;
        System.out.println("A subtração entre " + x + " e " + y + " é igual a " + subtracao);

        double temperaturaCelsius = 16.5;
        double converteTemperatura = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em graus Celsius " + temperaturaCelsius + "°C convertida para grau Fahrenheit é de " + converteTemperatura + "°F");

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
    }
}
