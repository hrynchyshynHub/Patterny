package factoryMethod;

/**
 * Created by ваня on 09.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Car car = carSelector.getCar(RoadType.OFFROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.SPORT);
        car.drive();
        car.stop();
    }
}
