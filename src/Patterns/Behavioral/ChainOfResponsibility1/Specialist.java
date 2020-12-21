package Patterns.Behavioral.ChainOfResponsibility1;

public class Specialist implements Handler{
    private Handler handlerNext;
    private final Priority priority;

    Specialist(Priority priority) {
        this.priority = priority;
    }

    public void HandlerNext(Handler handlerNext){
        this.handlerNext = handlerNext;
    }

    @Override
    public void toHelp(String message, Priority priorityMessage){
        if(priorityMessage == priority){
            System.out.println("Специалист обрабатывает запрос " + message);
            System.out.println("Специалист нашел ответ");
        }else{
            if(handlerNext != null){
                handlerNext.toHelp(message, priorityMessage);
            }
        }
    }
}
