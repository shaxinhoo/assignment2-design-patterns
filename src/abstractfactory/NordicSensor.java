package abstractfactory;

public class NordicSensor implements Sensor {

    private static final int TEMPERATURE = 19;

    @Override
    public String read() {
        return "Nordic sensor: " + TEMPERATURE + " C";
    }
}
