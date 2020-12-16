package Patterns.Creational.AbstractFabric;

import Patterns.Creational.Terminators.T_1000;
import Patterns.Creational.Terminators.Terminator;
import Patterns.Creational.Transport.PoliceCar;
import Patterns.Creational.Transport.Transport;

public class FullFabricT_1000 extends AbstractTerminatorFabric {
    @Override
    public Terminator createTerminator() {
        //дополнительная логика производства, которую мы можем добивать
        return new T_1000();
    }

    @Override
    public Transport createTransport() {
        //дополнительная логика производства, которую мы можем добивать
        return new PoliceCar();
    }
    //так же и тут мы можем добавить дополнительную логику производства
}
