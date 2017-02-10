package factoryMethod;

/**
 * Created by ваня on 09.02.2017.
 */
public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Jeep drove");
    }

    @Override
    public void stop() {
        System.out.println("jeep stop");
    }
}
