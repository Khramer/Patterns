package Patterns.Behavioral.Visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person2 person2 = new Person2();

        person1.accept(new DrAibolit());
        person2.accept(new DrAibolit());
        person1.accept(new SpanishInquisition());
        person2.accept(new SpanishInquisition());

    }
}
