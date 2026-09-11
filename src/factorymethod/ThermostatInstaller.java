package factorymethod;

public class ThermostatInstaller extends DeviceInstaller {

    @Override
    protected Device createDevice() {
        return new Thermostat();
    }
}
