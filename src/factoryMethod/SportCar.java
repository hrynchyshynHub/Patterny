package factoryMethod;

/**
 * Created by ваня on 09.02.2017.
 */
public class SportCar implements Car {
    @Override
    public void drive() {
        System.out.println("porshe drive");
    }

    @Override
    public void stop() {
        System.out.println("porshe stop");
    }
}
