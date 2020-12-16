package Patterns.Behavioral.Visitor;

public class SpanishInquisition implements Visitor{
    @Override
    public void visit(JuniorDeveloper juniorDeveloper) {
        //логика обработки JuniorDeveloper
        System.out.println("Испанская инквизиция проводит допрос Джуниор разработчика");
    }

    @Override
    public void visit(SeniorDeveloper seniorDeveloper) {
        //логика обработки SeniorDeveloper
        System.out.println("Испанская инквизиция проводит допрос Сеньор разработчика");
    }
}
