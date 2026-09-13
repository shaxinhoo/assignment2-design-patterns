package abstractfactory;

public class SolarisSensor implements Sensor {

    private static final int TEMPERATURE = 31;

    @Override
    public String read() {
        return "Solaris sensor: " + TEMPERATURE + " C";
    }
}
