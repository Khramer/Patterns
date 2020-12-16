package Patterns.Behavioral.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        IteratorInterface iterator = warehouse.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
