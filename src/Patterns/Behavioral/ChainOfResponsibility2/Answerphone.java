package Patterns.Behavioral.ChainOfResponsibility2;

public class Answerphone extends Handler {

    Answerphone(Priority priority){
        super(priority);
    }

    @Override
    public void answer(String message){
        System.out.println("Автоответчик обрабатывает запрос " + message);
        System.out.println("Автоответчик нашел ответ");
    }
}
