import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

public class SensorClient implements PostRequestWithJsonData {
    private final   RestTemplate restTemplate;

    public SensorClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public  void addSensor() {
        Map<String, Object> json = Map.of("name", "sensor10");
        String url = "http://localhost:8080/sensors/registration";
        makePostRequestWithJsonData(url, json);

    }
    public  void getSensors() {
        String url = "http://localhost:8080/sensors/get";
        Map<String, List<Object>> response = restTemplate.getForObject(url, Map.class);
        List<Object> measurements = response.get("sensors");
        measurements.forEach(System.out::println);
    }
}
