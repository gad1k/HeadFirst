package ch07_adapter_facade.ex03_iterator_adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class IteratorAdapterTestDrive {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorAdapter(list.iterator());
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}
