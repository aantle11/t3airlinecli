package airlinecli.api;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class ApiClient {
    private static final String BASE_URL = "http://localhost:8080"; // change if your API uses another port

    public String get(String endpoint) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL + endpoint);
            return client.execute(request, response ->
                    EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            return "Error connecting to API: " + e.getMessage();
        }
    }
}