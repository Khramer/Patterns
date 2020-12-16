package Patterns.Structural.Decorator;

public class Duck implements KoshcheisDeath {
    KoshcheisDeath component;
    Duck(KoshcheisDeath component){
        this.component = component;
    }
    @Override
    public void crush() {
        System.out.print("(");
        System.out.print("утка, а в ней ");
        component.crush();
        System.out.print(")");
        //любая другая логика
    }
}
