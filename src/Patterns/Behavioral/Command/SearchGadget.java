package Patterns.Behavioral.Command;

public class SearchGadget implements Gadget{
    InspectorGadget inspectorGadget;

    SearchGadget(InspectorGadget inspectorGadget){
        this.inspectorGadget = inspectorGadget;
    }
    @Override
    public void execute() {
        inspectorGadget.search();
    }
}
