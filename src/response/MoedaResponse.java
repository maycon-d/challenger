package response;

public class MoedaResponse {
    public static void exibirResultado(String moedaBase, String moedaDestino, double taxa, double valorConvertido) {

        String vermelhoNegrito = "\033[1;31m";
        String cianoNegrito = "\033[1;36m";
        String verde = "\033[32m";
        String reset = "\033[0m";

        System.out.println("");
        System.out.println("A moeda " + cianoNegrito + moedaBase + reset +
                " será convertida para " + cianoNegrito + moedaDestino + reset);
        System.out.println("A taxa de conversão é: " + cianoNegrito + taxa + reset);
        System.out.printf("Valor da moeda convertido é: %s%.2f%s%n", cianoNegrito, valorConvertido, reset);
    }
}