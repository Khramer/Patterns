package Patterns.Structural.Decorator;

public class Rabbit implements KoshcheisDeath {
    KoshcheisDeath component;

    Rabbit(KoshcheisDeath component){
        this.component = component;
    }
    @Override
    public void crush() {
        System.out.print("[");
        System.out.print("заяц, а внем ");
        component.crush();
        System.out.print("]");
        //любая другая логика
    }
}
