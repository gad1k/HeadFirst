package ch07_adapter_facade.ex02_enumeration_adapter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationAdapterTestDrive {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationAdapter(vector.elements());
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
