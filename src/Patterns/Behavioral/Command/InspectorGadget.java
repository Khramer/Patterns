package Patterns.Behavioral.Command;

public class InspectorGadget {

    public void search(){
        System.out.println("Исследовать место преступления");
    }

    public void interview(){
        System.out.println("Опрашивать свидетелей");
    }

    public void fly(){
        System.out.println("Летать на пропеллере с мотором");
    }
}
