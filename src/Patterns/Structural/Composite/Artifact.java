package Patterns.Structural.Composite;

public class Artifact implements Item{
    @Override
    public void use() {
        System.out.println("Это артефакт");
    }
}
