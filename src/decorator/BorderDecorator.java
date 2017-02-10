package decorator;

/**
 * Created by ваня on 10.02.2017.
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("draw border");
    }
}
