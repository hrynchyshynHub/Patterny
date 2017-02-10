package decorator;

/**
 * Created by ваня on 10.02.2017.
 */
public class ColorDecorator extends Decorator{
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("draw color to component");
    }
}
