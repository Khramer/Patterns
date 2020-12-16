package Patterns.Structural.Composite;

public class CannedFood implements Item{
    @Override
    public void use() {
        System.out.println("Это консерва");
    }
}
