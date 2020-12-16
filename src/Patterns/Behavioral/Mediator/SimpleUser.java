package Patterns.Behavioral.Mediator;

public class SimpleUser implements User{
    private Chat chat;
    private int number;
    private static int count = 1;

    public SimpleUser(Chat chat) {
        this.chat = chat;
        number = count++;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Пользователь № " + number + " получил сообщение: " + message);
    }
}
