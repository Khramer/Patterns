package Patterns.Structural.Decorator;

public class Сhest implements KoshcheisDeath {
    KoshcheisDeath component;

    public Сhest(KoshcheisDeath component) {
        this.component = component;
    }

    @Override
    public void crush() {
        System.out.print("{");
        System.out.print("Это сундук, а в нем ");
        component.crush();
        System.out.print("}");
        //любая другая логика
    }
}
