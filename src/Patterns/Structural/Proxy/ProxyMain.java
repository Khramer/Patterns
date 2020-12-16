package Patterns.Structural.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Officer officer = new Secretary("<Важный документ!>");
        officer.veryImportantDecision();
    }
}
