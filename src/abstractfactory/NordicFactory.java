package abstractfactory;

public class NordicFactory implements SmartHomeFactory {

    @Override
    public Sensor createSensor() {
        return new NordicSensor();
    }

    @Override
    public Controller createController() {
        return new NordicController();
    }

    @Override
    public MobileApp createApp() {
        return new NordicApp();
    }
}
