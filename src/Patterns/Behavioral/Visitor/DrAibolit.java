package Patterns.Behavioral.Visitor;

public class DrAibolit implements Visitor{
    @Override
    public void visit(Person1 person1) {
        //логика обработки JuniorDeveloper
        System.out.println("Измеряет Джуниор разработчику температуру и выписывает рецепт");
    }

    @Override
    public void visit(Person2 person2) {
        //логика обработки SeniorDeveloper
        System.out.println("Измеряет Сеньор разработчику температуру и выписывает рецепт");
    }
}
