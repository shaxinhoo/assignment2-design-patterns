package factorymethod;

public class LampInstaller extends DeviceInstaller {

    @Override
    protected Device createDevice() {
        return new Lamp();
    }
}
