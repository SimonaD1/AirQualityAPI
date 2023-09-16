import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AirQualityApiClient {

    public String getWeatherData(double latitude, double longitude) {
        HttpClient client = HttpClient.newHttpClient();


        URI uri = URI.create("https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude + "&hourly=temperature_2m");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 200) {
                return response.body(); //
            } else {
                return null; //
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
