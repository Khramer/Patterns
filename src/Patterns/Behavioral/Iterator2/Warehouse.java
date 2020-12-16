package Patterns.Behavioral.Iterator2;

public class Warehouse<T> implements Container{
    private int size = 0;
    private T[] warehouse;

    public Warehouse(int size) {
        warehouse = (T[])new Object[size];
    }

    public void add(T object) {
        warehouse[size++] = object;
    }

    @Override
    public IteratorInterface getIterator() {
        return new Iterator();
    }

    private class Iterator implements IteratorInterface<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return warehouse[index++];
        }
    }
}
