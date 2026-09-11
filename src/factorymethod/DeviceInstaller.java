package factorymethod;

public abstract class DeviceInstaller {

    protected abstract Device createDevice();

    public String install(String room) {
        Device device = createDevice();
        return device.getName() + " installed in " + room + ": " + device.turnOn();
    }
}
