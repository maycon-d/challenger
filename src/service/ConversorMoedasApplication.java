package service;

import service.MoedaConversao;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorMoedasApplication {
    public static void main(String[] args) throws IOException {
        String azul = "\033[34m";
        String vermelhoNegrito = "\033[1;31m";
        String reset = "\033[0m";

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(azul + """
                *---------------------------------*
                *   ALURA - ONE                   *
                *   Sistema Conversor de Moedas   *
                *---------------------------------*
                """ + reset);

            System.out.println("Selecione a opção de conversão:");
            System.out.println("1. BRL para USD");
            System.out.println("2. USD para BRL");
            System.out.println("3. BRL para EUR");
            System.out.println("4. EUR para BRL");
            System.out.println("5. BRL para AUD");
            System.out.println("6. AUD para BRL");
            System.out.println("7. BRL para todas (USD, EUR, AUD)");
            System.out.println("8. Encerrar aplicação");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao < 1 || opcao > 8) {
                System.out.println(vermelhoNegrito + "Opção inválida. Verifique o menu e digite um código entre 1 e 8." + reset);
                System.out.println();
                continue;
            }

            if (opcao != 8) {
                System.out.print("Digite o valor a ser convertido: ");
                double valor = scanner.nextDouble(); processarConversao(opcao, valor);
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }

        } while (opcao != 8);

        System.out.println("Aplicação encerrada.");
        scanner.close();
    }

    private static void processarConversao(int opcao, double valor) throws IOException {
        String baseCurrency = "";
        String targetCurrency = "";

        switch (opcao) {
            case 1: baseCurrency = "BRL"; targetCurrency = "USD"; break;
            case 2: baseCurrency = "USD"; targetCurrency = "BRL"; break;
            case 3: baseCurrency = "BRL"; targetCurrency = "EUR"; break;
            case 4: baseCurrency = "EUR"; targetCurrency = "BRL"; break;
            case 5: baseCurrency = "BRL"; targetCurrency = "AUD"; break;
            case 6: baseCurrency = "AUD"; targetCurrency = "BRL"; break;
            case 7:
                MoedaConversao.converter("BRL", "USD", valor);
                service.MoedaConversao.converter("BRL", "EUR", valor);
                service.MoedaConversao.converter("BRL", "AUD", valor);
                return;
            default: return;
        }
        service.MoedaConversao.converter(baseCurrency, targetCurrency, valor);
    }
}