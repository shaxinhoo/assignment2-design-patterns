package factorymethod;

public class CameraInstaller extends DeviceInstaller {

    @Override
    protected Device createDevice() {
        return new Camera();
    }
}
