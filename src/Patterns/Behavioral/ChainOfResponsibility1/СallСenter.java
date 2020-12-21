package Patterns.Behavioral.ChainOfResponsibility1;

public class СallСenter implements Handler{
    private Handler handlerNext;
    private final Priority priority;

    СallСenter(Priority priority) {
        this.priority = priority;
    }

    public void HandlerNext(Handler handlerNext){
        this.handlerNext = handlerNext;
    }

    @Override
    public void toHelp(String message, Priority priorityMessage){
        if(priorityMessage == priority){
            System.out.println("Коллцентр обрабатывает запрос " + message);
            System.out.println("Коллцентр нашел ответ");
        }else{
            if(handlerNext != null){
                System.out.println("Колцентр нашел ответ");
                handlerNext.toHelp(message, priorityMessage);
            }
        }
    }
}
