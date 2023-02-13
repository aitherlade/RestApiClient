import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class MeasurementClient implements PostRequestWithJsonData {
    private final RestTemplate restTemplate;

    public MeasurementClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendMeasurements() {
        Random random = new Random();
        Map<String, Object> jsonData = Map.of(
                "value", random.nextInt(-20, 35),
                "raining", random.nextBoolean(),
                "sensor", Map.of("name", "sensor123")
        );
        String url = "http://localhost:8080/measurements/add";
        makePostRequestWithJsonData(url, jsonData);
    }

    public void getMeasurements() {
        String url = "http://localhost:8080/measurements/get";
        Map<String, List<Object>> response = restTemplate.getForObject(url, Map.class);
        List<Object> measurements = response.get("measurements");
        measurements.forEach(System.out::println);
    }

    public void getRainyDaysCount() {
        String url = "http://localhost:8080/measurements/getRainyDaysCount";
        Map<String, Integer> response = restTemplate.getForObject(url, Map.class);
        Integer rainyDaysCount = response.get("Rainy days");
        System.out.println("Rainy days: " + rainyDaysCount);

    }
}
