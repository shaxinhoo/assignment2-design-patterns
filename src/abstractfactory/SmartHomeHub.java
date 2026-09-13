package abstractfactory;

public class SmartHomeHub {

    private final Sensor sensor;
    private final Controller controller;
    private final MobileApp app;

    public SmartHomeHub(SmartHomeFactory factory) {
        this.sensor = factory.createSensor();
        this.controller = factory.createController();
        this.app = factory.createApp();
    }

    public String run() {
        String reading = sensor.read();
        String status = controller.handle(reading);
        return app.show(status);
    }
}
