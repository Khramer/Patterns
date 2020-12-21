package Patterns.Behavioral.Visitor;

public class SpanishInquisition implements Visitor{
    @Override
    public void visit(Person1 person1) {
        //логика обработки JuniorDeveloper
        System.out.println("Испанская инквизиция проводит допрос Джуниор разработчика");
    }

    @Override
    public void visit(Person2 person2) {
        //логика обработки SeniorDeveloper
        System.out.println("Испанская инквизиция проводит допрос Сеньор разработчика");
    }
}
