package Observer;

/**
 * Created by ваня on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        SubSkriber1 subSkriber1 = new SubSkriber1();
        SubSkiber2 subSkiber2 = new SubSkiber2();

        publisher.add(subSkriber1);
        publisher.add(subSkiber2);

        publisher.printMessage("hello ");
    }
}
