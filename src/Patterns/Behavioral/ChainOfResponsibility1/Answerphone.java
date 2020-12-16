package Patterns.Behavioral.ChainOfResponsibility1;

public class Answerphone implements Handler {
    private Handler handlerNext;
    private Priority priority;

    Answerphone(Priority priority){
        this.priority = priority;
    }

    public void HandlerNext(Handler handlerNext){
        this.handlerNext = handlerNext;
    }

    @Override
    public void toHelp(String message, Priority priorityMessage){
        if(priorityMessage == priority){
            System.out.println("Автоответчик обрабатывает запрос " + message);
            System.out.println("Автоответчик нашел ответ");
        }else{
            if(handlerNext != null){
                handlerNext.toHelp(message, priorityMessage);
            }
        }
    }
}
