package adapter;

import java.util.List;

/**
 * Created by ваня on 10.02.2017.
 */
public class PrinterAdapter implements PrintListOfText {
    private Printer printer = new Printer();

    @Override
    public void print(List<String> text) {
        for(String txt:text){
            printer.print(txt);
        }
    }
}
