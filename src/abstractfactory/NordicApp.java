package abstractfactory;

public class NordicApp implements MobileApp {

    @Override
    public String show(String status) {
        return "Nordic app (dark theme): " + status;
    }
}
