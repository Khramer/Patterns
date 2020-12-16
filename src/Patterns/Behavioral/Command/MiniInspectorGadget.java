package Patterns.Behavioral.Command;

public class MiniInspectorGadget {
    private Gadget flyGadget;
    private Gadget interviewGadget;
    private Gadget searchGadget;

    public MiniInspectorGadget(Gadget flyGadget, Gadget interviewGadget, Gadget searchGadget) {
        this.flyGadget = flyGadget;
        this.interviewGadget = interviewGadget;
        this.searchGadget = searchGadget;
    }

    public void fly(){
        flyGadget.execute();
    }

    public void search(){
        searchGadget.execute();
    }

    public void interview(){
        interviewGadget.execute();
    }
}
