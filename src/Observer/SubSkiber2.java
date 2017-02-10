package Observer;

/**
 * Created by ваня on 10.02.2017.
 */
public class SubSkiber2 implements SubSkriberInterface {
    @Override
    public void doAction(String tetx) {
        System.out.println(tetx + this.getClass());
    }
}
