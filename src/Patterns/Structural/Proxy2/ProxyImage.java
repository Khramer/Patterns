package Patterns.Structural.Proxy2;

public class ProxyImage implements Image {
    Image realImage;
    String file;

    ProxyImage(String file){
        this.file = file;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(file);
        }
    }
}
