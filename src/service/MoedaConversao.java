package service;

import domain.Moeda;
import request.MoedaRequest;
import response.MoedaResponse;
import com.google.gson.JsonObject;

import java.io.IOException;

public class MoedaConversao {
    public static void converter(String moedaBase, String moedaDestino, double valor) throws IOException {

        JsonObject jsonObject = MoedaRequest.buscarTaxas(moedaBase);
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        double taxa = conversionRates.get(moedaDestino).getAsDouble();
        double valorConvertido = valor * taxa;

        Moeda moeda = new Moeda(moedaDestino, taxa);
        MoedaResponse.exibirResultado(moedaBase, moeda.getNomeMoeda(), moeda.getTaxaConversao(), valorConvertido);
    }
}

