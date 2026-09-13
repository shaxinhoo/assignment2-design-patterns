package abstractfactory;

public class SolarisFactory implements SmartHomeFactory {

    @Override
    public Sensor createSensor() {
        return new SolarisSensor();
    }

    @Override
    public Controller createController() {
        return new SolarisController();
    }

    @Override
    public MobileApp createApp() {
        return new SolarisApp();
    }
}
