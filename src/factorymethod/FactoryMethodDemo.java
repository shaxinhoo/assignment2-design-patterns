package factorymethod;

public class FactoryMethodDemo {

    private static final String LIVING_ROOM = "living room";
    private static final String BEDROOM = "bedroom";
    private static final String HALLWAY = "hallway";

    public static void main(String[] args) {
        System.out.println("=== Part A: Factory Method ===");
        setUp(new LampInstaller(), LIVING_ROOM);
        setUp(new ThermostatInstaller(), BEDROOM);
        setUp(new CameraInstaller(), HALLWAY);
    }

    private static void setUp(DeviceInstaller installer, String room) {
        System.out.println(installer.install(room));
    }
}
