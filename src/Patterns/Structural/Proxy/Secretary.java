package Patterns.Structural.Proxy;

public class Secretary implements Officer{
    Officer director;
    String documents;

    Secretary(String documents){
        this.documents = documents;
        System.out.println("Принял документы");
    }
    @Override
    public void veryImportantDecision() {
        if(director == null){
            director = new Director(documents);
        }
    }
}
