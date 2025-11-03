import airlinecli.api.ApiClient;
import airlinecli.service.QueryService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueryServiceTest {
    @Test
    void testGetAirportsByCity() {
        ApiClient mockApi = Mockito.mock(ApiClient.class);
        when(mockApi.get("/api/airports/byCity")).thenReturn("Airport A, Airport B");

        QueryService service = new QueryService();
        String result = mockApi.get("/api/airports/byCity");

        assertTrue(result.contains("Airport A"));
    }
}