package Patterns.Behavioral.ChainOfResponsibility1;

public class СallСenter implements Handler{
    private Handler handlerNext;
    private Priority priority;

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
                handlerNext.toHelp(message, priorityMessage);
            }
        }
    }
}
