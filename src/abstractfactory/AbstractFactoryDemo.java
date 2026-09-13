package abstractfactory;

public class AbstractFactoryDemo {

    private static final String NORDIC = "nordic";
    private static final String SOLARIS = "solaris";

    public static void main(String[] args) {
        System.out.println("=== Part B: Abstract Factory ===");
        String vendor = args.length > 0 ? args[0] : NORDIC;
        SmartHomeFactory factory = selectFactory(vendor);
        SmartHomeHub hub = new SmartHomeHub(factory);
        System.out.println(hub.run());
    }

    private static SmartHomeFactory selectFactory(String vendor) {
        switch (vendor) {
            case NORDIC:
                return new NordicFactory();
            case SOLARIS:
                return new SolarisFactory();
            default:
                throw new IllegalArgumentException("Unknown vendor: " + vendor);
        }
    }
}
