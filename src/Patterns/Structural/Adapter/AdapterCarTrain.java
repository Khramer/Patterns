package Patterns.Structural.Adapter;

//через композицию
public class AdapterCarTrain extends Train{
    Car car;

    AdapterCarTrain(Car car){
        this.car = car;
    }
}
