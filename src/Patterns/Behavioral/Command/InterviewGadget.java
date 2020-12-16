package Patterns.Behavioral.Command;

public class InterviewGadget implements Gadget{
    InspectorGadget inspectorGadget;

    InterviewGadget(InspectorGadget inspectorGadget){
        this.inspectorGadget = inspectorGadget;
    }
    @Override
    public void execute() {
        inspectorGadget.interview();
    }
}
