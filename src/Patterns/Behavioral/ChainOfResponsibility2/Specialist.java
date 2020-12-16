package Patterns.Behavioral.ChainOfResponsibility2;

public class Specialist extends Handler {
    Specialist(Priority priority) {
        super(priority);
    }

    @Override
    void answer(String message) {
        System.out.println("Специалист обрабатывает запрос " + message);
        System.out.println("Специалист нашел ответ");
    }
}
