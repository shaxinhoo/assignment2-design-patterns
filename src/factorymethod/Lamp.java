package factorymethod;

public class Lamp implements Device {

    private static final int DEFAULT_BRIGHTNESS = 70;

    @Override
    public String getName() {
        return "Lamp";
    }

    @Override
    public String turnOn() {
        return "light is on, brightness " + DEFAULT_BRIGHTNESS + "%";
    }
}
