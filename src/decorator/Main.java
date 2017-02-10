package decorator;

/**
 * Created by ваня on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new BorderDecorator(new ColorDecorator(new Image()));
        component.draw();

    }
}
