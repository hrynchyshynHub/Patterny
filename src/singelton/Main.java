package singelton;

/**
 * Created by ваня on 09.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        singelton.print();
        Singelton.getInstance().print();
    }
}
