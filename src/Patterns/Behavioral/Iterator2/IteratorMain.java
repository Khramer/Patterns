package Patterns.Behavioral.Iterator2;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        Warehouse<String> warehouse = new Warehouse(10);
        warehouse.add("Монитор");
        warehouse.add("Ноутбук");
        warehouse.add("Телефон");
        warehouse.add("Монитор");

        IteratorInterface<String> iterator = warehouse.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
