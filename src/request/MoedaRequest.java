package request;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MoedaRequest {
    private static final String API_KEY = "a35d5e99a468eed9ae0bd46b";

    public static JsonObject buscarTaxas(String moedaBase) throws IOException {
        String urlString = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaBase;
        HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        String response = scanner.useDelimiter("\\A").next();
        scanner.close();

        return JsonParser.parseString(response).getAsJsonObject();
    }
}