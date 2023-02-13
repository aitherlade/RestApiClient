import org.springframework.web.client.RestTemplate;

public class RestSender {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        MeasurementClient measurementClient = new MeasurementClient(restTemplate);
        SensorClient sensorClient = new SensorClient(restTemplate);

        measurementClient.getMeasurements();
        measurementClient.getRainyDaysCount();
        measurementClient.sendMeasurements();
        sensorClient.addSensor();
        sensorClient.getSensors();
    }
}
