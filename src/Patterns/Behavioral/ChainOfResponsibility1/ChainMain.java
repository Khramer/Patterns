package Patterns.Behavioral.ChainOfResponsibility1;

public class ChainMain {
    public static void main(String[] args) {
        Answerphone handler1 = new Answerphone(Priority.EASY);
        СallСenter handler2 = new СallСenter(Priority.MIDDLE);
        Specialist handler3 = new Specialist(Priority.HARD);

        handler1.HandlerNext(handler2);
        handler2.HandlerNext(handler3);

        handler1.toHelp("Простая проблема", Priority.HARD);
    }
}
