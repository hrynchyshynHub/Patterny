package decorator;

/**
 * Created by ваня on 10.02.2017.
 */
public class Image implements Component{
    @Override
    public void draw() {
        System.out.println("Image draw");
    }
}
