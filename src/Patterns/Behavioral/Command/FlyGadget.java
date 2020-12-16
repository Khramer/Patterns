package Patterns.Behavioral.Command;

public class FlyGadget implements Gadget{
    InspectorGadget inspectorGadget;

    FlyGadget(InspectorGadget inspectorGadget){
        this.inspectorGadget = inspectorGadget;
    }
    @Override
    public void execute() {
        inspectorGadget.fly();
    }
}
