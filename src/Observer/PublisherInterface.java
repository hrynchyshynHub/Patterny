package Observer;

import java.util.List;

/**
 * Created by ваня on 10.02.2017.
 */
public interface PublisherInterface {
    void add(SubSkriberInterface subSkriberInteface);
    void remove(SubSkriberInterface subSkriberInterface);
    List<SubSkriberInterface> getSubskibers();
    void notifyAll(String text);
    void printMessage(String message);
}
