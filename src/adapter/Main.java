package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ваня on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("vania");
        list.add("vania");
        list.add("vania");
        list.add("vania");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
