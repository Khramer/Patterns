package Patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Item{
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public void use() {
        System.out.println("Это сумка");
        System.out.println("---------------");
        for(Item i : items){
            i.use();
        }
        System.out.println("---------------");
    }
}
