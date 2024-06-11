package DAO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class APIConnection {
    private static final String API_URL = "https://www.moogleapi.com/api/v1/characters/random";
    
    public static String connect() {
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    
            if (response.statusCode() == 200) {
                return response.body();                
            } else {
                return "REQUEST FAILED: "+ response.statusCode();
            }
        } catch (IOException | InterruptedException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
}
