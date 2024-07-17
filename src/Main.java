public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Screen Match!");

        int anoLancamento = 2002;
        String nomeFilme = "Harry Potter e a Pedra Filosofal";
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.6;
        double mediaNotas = (notaDoFilme + 7.9 + 9.4) / 3;
        String sinopse = """
                Filme de bruxos crianças em Hogwarts.
                """;
        int classificacao = (int) (mediaNotas / 2); // casting explícito

        System.out.println("Filme : " + nomeFilme);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Incluido no plano? " + incluidoNoPlano);
        System.out.println(String.format("Média da Nota: %.2f", mediaNotas));
        System.out.println("Sinopse: " + sinopse);
        System.out.println(String.format("O nome do filme é %s, o ano de lançamento é %d e a classificação é %d.", nomeFilme, anoLancamento, classificacao));
    }
}
