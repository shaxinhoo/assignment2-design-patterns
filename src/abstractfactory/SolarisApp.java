package abstractfactory;

public class SolarisApp implements MobileApp {

    @Override
    public String show(String status) {
        return "Solaris app (light theme): " + status;
    }
}
