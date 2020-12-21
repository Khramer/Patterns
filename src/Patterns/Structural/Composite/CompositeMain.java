package Patterns.Structural.Composite;

public class CompositeMain {
    public static void main(String[] args) {
        Item firstAidKit1 = new FirstAidKit();
        Item firstAidKit2 = new FirstAidKit();
        Item firstAidKit3 = new FirstAidKit();

        Item cannedFood1 = new CannedFood();
        Item cannedFood2 = new CannedFood();
        Item cannedFood3 = new CannedFood();

        Item artifact1 = new Artifact();
        Item artifact2 = new Artifact();
        Item artifact3 = new Artifact();

        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        Bag bag3 = new Bag();

        bag1.addItem(firstAidKit1);
        bag1.addItem(cannedFood2);
        bag1.addItem(cannedFood3);

        bag2.addItem(firstAidKit2);
        bag2.addItem(artifact3);
        bag2.addItem(firstAidKit3);

        bag3.addItem(cannedFood1);
        bag3.addItem(artifact1);
        bag3.addItem(artifact2);

        Bag superBag = new Bag();

        superBag.addItem(bag1);
        superBag.addItem(bag2);
        superBag.addItem(bag3);

        superBag.use();
    }
}
