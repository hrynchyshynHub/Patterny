package facade;

/**
 * Created by ваня on 10.02.2017.
 */
public class CarFacadeImpl  implements CarFacade{
    private Door door= new Door();
    private Engine engine = new Engine();
    private Wheel wheel = new Wheel();

    @Override
    public void go() {
        door.open();
        engine.start();
        wheel.rotate();
    }
}
