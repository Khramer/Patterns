package Patterns.Behavioral.Iterator;

public class Warehouse implements Container{
    private String[] warehouse = {"Монитор", "Телефон", "Ноутбук"};

    @Override
    public IteratorInterface getIterator() {
        return new Iterator();
    }

    private class Iterator implements IteratorInterface{
        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < warehouse.length){
                return true;
            }else {
                index = 0;
                return false;
            }
        }

        @Override
        public Object next() {
            return warehouse[index++];
        }
    }
}
