package facade;

/**
 * Created by ваня on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        CarFacade facade = new CarFacadeImpl();
        facade.go();
    }
}
