package Patterns.Creational.AbstractFabric;

import Patterns.Creational.Terminators.T_800;
import Patterns.Creational.Terminators.Terminator;
import Patterns.Creational.Transport.Chopper;
import Patterns.Creational.Transport.Transport;

public class FullFabricT_800 extends AbstractTerminatorFabric {
    @Override
    public Terminator createTerminator() {
        //дополнительная логика производства, которую мы можем добивать
        return new T_800();
    }

    @Override
    public Transport createTransport() {
        //дополнительная логика производства, которую мы можем добивать
        return new Chopper();
    }
    //так же и тут мы можем добавить дополнительную логику производства
}
