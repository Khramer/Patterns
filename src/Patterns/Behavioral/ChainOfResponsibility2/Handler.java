package Patterns.Behavioral.ChainOfResponsibility2;

public abstract class Handler {
    protected Handler handlerNext;
    protected Priority priority;

    abstract void answer(String message);

    Handler(Priority priority){
        this.priority = priority;
    }

    public void HandlerNext(Handler handlerNext){
        this.handlerNext = handlerNext;
    }

    public void toHelp(String message, Priority priorityMessage){
        if(priorityMessage == priority){
            answer(message);
        }else{
            if(handlerNext != null){
                handlerNext.toHelp(message, priorityMessage);
            }
        }
    }
}
