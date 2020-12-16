package Patterns.Behavioral.TemplateMethod;

public class TemplateMain {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        Coffee cappuccino = new Сappuccino();

        latte.createCoffee();
        System.out.println("===========================================");
        cappuccino.createCoffee();
    }
}
