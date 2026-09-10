package factorymethod;

public class Camera implements Device {

    private static final String RESOLUTION = "1080p";

    @Override
    public String getName() {
        return "Camera";
    }

    @Override
    public String turnOn() {
        return "recording in " + RESOLUTION;
    }
}
