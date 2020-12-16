package Patterns.Behavioral.Command;

public class CommandMain {
    public static void main(String[] args) {
        InspectorGadget ins = new InspectorGadget();

        Gadget shootGadget = new FlyGadget(ins);
        Gadget interviewGadget = new InterviewGadget(ins);
        Gadget searchGadget = new SearchGadget(ins);

        MiniInspectorGadget miniIns = new MiniInspectorGadget(shootGadget, interviewGadget, searchGadget);

        miniIns.interview();
        miniIns.search();
        miniIns.fly();
    }
}
