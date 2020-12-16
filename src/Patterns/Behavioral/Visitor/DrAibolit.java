package Patterns.Behavioral.Visitor;

public class DrAibolit implements Visitor{
    @Override
    public void visit(JuniorDeveloper juniorDeveloper) {
        //логика обработки JuniorDeveloper
        System.out.println("Измеряет Джуниор разработчику температуру и выписывает рецепт");
    }

    @Override
    public void visit(SeniorDeveloper seniorDeveloper) {
        //логика обработки SeniorDeveloper
        System.out.println("Измеряет Сеньор разработчику температуру и выписывает рецепт");
    }
}
