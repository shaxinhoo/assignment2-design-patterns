package abstractfactory;

public class SolarisController implements Controller {

    @Override
    public String handle(String reading) {
        return "Solaris controller got [" + reading + "] and turned the cooling on";
    }
}
