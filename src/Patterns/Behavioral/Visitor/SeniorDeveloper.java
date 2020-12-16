package Patterns.Behavioral.Visitor;

public class SeniorDeveloper implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
