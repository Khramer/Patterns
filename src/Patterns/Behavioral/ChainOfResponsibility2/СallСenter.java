package Patterns.Behavioral.ChainOfResponsibility2;

public class СallСenter extends Handler {

    СallСenter(Priority priority) {
        super(priority);
    }

    @Override
    void answer(String message) {
        System.out.println("Коллцентр обрабатывает запрос " + message);
        System.out.println("Коллцентр нашел ответ");
    }
}
