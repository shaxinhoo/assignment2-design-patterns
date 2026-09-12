package abstractfactory;

public class NordicController implements Controller {

    @Override
    public String handle(String reading) {
        return "Nordic controller got [" + reading + "] and turned the heating on";
    }
}
