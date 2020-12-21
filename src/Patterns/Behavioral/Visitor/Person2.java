package Patterns.Behavioral.Visitor;

public class Person2 implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
