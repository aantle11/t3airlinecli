package airlinecli.service;

import airlinecli.api.ApiClient;

public class QueryService {
    private final ApiClient apiClient = new ApiClient();

    public void getAirportsByCity() {
        String response = apiClient.get("/api/airports/byCity");
        System.out.println(response);
    }

    public void getAircraftByPassenger() {
        String response = apiClient.get("/api/aircrafts/byPassenger");
        System.out.println(response);
    }

    public void getAirportRoutes() {
        String response = apiClient.get("/api/aircrafts/routes");
        System.out.println(response);
    }

    public void getPassengerAirports() {
        String response = apiClient.get("/api/passengers/airports");
        System.out.println(response);
    }
}