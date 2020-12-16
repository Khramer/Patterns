package Patterns.Behavioral.Visitor;

public interface Visitor {
    void visit(JuniorDeveloper juniorDeveloper);
    void visit(SeniorDeveloper seniorDeveloper);
}
