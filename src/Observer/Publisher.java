package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ваня on 10.02.2017.
 */
public class Publisher implements PublisherInterface {
    private List<SubSkriberInterface> list = new ArrayList<>();

    @Override
    public void add(SubSkriberInterface subSkriberInteface) {
        list.add(subSkriberInteface);
    }

    @Override
    public void remove(SubSkriberInterface subSkriberInterface) {
        list.remove(subSkriberInterface);
    }

    @Override
    public List<SubSkriberInterface> getSubskibers() {
        return list;
    }

    @Override
    public void printMessage(String message) {
        System.out.println(this.getClass()+" write " + message);
        notifyAll(message);
    }

    @Override
    public void notifyAll(String text) {
        for(SubSkriberInterface subSkriberInterface:list){
            subSkriberInterface.doAction(text);
        }
    }
}
