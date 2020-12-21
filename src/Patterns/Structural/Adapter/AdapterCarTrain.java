package Patterns.Structural.Adapter;

//через композицию
public class AdapterCarTrain extends Train{
    Car car;
    AdapterCarTrain(Car car){
        this.car = car;
    }

    @Override
    public String goTrain() {
       return car.go();
    }
}
