package Patterns.Behavioral.Mediator;

public class MediatorMain {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User user0 = new SimpleUser(chat);
        User user1 = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);
        User admin = new Admin(chat);

        chat.setAdmin(admin);
        chat.addUser(user0);
        chat.addUser(user1);
        chat.addUser(user2);

        admin.sendMessage("Привет");
    }
}
