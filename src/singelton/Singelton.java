package singelton;

/**
 * Created by ваня on 09.02.2017.
 */
public class Singelton {
    private static Singelton singelton;

    private Singelton() {
    }
    public static  synchronized Singelton getInstance(){
        if(singelton==null){
            singelton = new Singelton();
        }
        return singelton;
    }
    public void print(){
        System.out.println(this);
    }

}
