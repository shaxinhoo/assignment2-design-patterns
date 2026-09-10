package factorymethod;

public class Thermostat implements Device {

    private static final int DEFAULT_TEMPERATURE = 22;

    @Override
    public String getName() {
        return "Thermostat";
    }

    @Override
    public String turnOn() {
        return "heating to " + DEFAULT_TEMPERATURE + " C";
    }
}
