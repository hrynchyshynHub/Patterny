package factoryMethod;

/**
 * Created by ваня on 09.02.2017.
 */
public class CarSelector {
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case SPORT:
                car = new SportCar();
                break;
            case OFFROAD:
                car = new Jeep();
                break;

        }
        return car;
    }
}
