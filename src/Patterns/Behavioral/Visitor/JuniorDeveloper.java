package Patterns.Behavioral.Visitor;

public class JuniorDeveloper implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
