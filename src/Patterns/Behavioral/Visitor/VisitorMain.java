package Patterns.Behavioral.Visitor;

public class VisitorMain {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        juniorDeveloper.accept(new SpanishInquisition());
        seniorDeveloper.accept(new SpanishInquisition());
        juniorDeveloper.accept(new DrAibolit());
        seniorDeveloper.accept(new DrAibolit());
    }
}
