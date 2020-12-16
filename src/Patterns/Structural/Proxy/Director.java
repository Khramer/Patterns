package Patterns.Structural.Proxy;

public class Director implements Officer{
    //очень много данных и действий
    String documents;
    Director(String documents){
        this.documents = documents;
        System.out.println("Принял документы");
        call();
    }

    void call(){
        System.out.println("Оторваться от другого важного дела..");
        System.out.println("Собраться с мыслями...");
        System.out.println("Анализ " + documents);
        System.out.println("Приступить к решению важной проблемы");
    }

    @Override
    public void veryImportantDecision() {
        System.out.println("Принять гениальное решение решение!");
        System.out.println("Вернуться к предыдущей важной проблеме");
    }
}
