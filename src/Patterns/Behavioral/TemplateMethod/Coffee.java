package Patterns.Behavioral.TemplateMethod;

abstract class Coffee {
    public void createCoffee(){
        System.out.println("Берем стакан");
        coffee();
        System.out.println("Отдаем клиенту");
    }
    public abstract void coffee();
}
