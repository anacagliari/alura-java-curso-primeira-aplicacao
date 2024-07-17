public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2002;
        String tipoPlano = "plus";
        boolean incluidoNoPlano = false;

        if (anoLancamento >= 2023) {
            System.out.println("Lançamentos que os clientes estão gostando!");
        } else {
            System.out.println("Filmes antigos que somos apaixonados!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme incluído no plano!");
        } else {
            System.out.println("Filme não incluído no plano. Deve pagar a locação do fime.");
        }
    }
}
