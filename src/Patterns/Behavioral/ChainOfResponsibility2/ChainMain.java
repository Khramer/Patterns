package Patterns.Behavioral.ChainOfResponsibility2;

public class ChainMain {
    public static void main(String[] args) {
        Handler handler1 = new Answerphone(Priority.EASY);
        Handler handler2 = new СallСenter(Priority.MIDDLE);
        Handler handler3 = new Specialist(Priority.HARD);

        handler1.HandlerNext(handler2);
        handler2.HandlerNext(handler3);

        handler1.toHelp("Простая проблема", Priority.HARD);
    }
}
