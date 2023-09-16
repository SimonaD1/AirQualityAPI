import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirQualityApiClientTest {

    @Test
    void testGetWeatherDataResponse() {
        AirQualityApiClient client = new AirQualityApiClient();
        double latitude = 52.52;
        double longitude = 13.41;

        String response = client.getWeatherData(latitude, longitude);

        assertNotNull(response, "Response is null");
        assertTrue(response.contains("latitude"), "Response does not contain latitude");
        assertTrue(response.contains("longitude"), "Response does not contain longitude");
        assertTrue(response.contains("elevation"), "Response does not contain elevation");
    }
    @Test
    void testGetWeatherDataTemperature() {
        AirQualityApiClient client = new AirQualityApiClient();
        double latitude = 52.52;
        double longitude = 13.41;

        String response = client.getWeatherData(latitude, longitude);

        assertNotNull(response);

        assertTrue(response.contains("temperature_2m"));
    }
}
