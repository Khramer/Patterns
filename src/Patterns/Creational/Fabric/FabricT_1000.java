package Patterns.Creational.Fabric;

import Patterns.Creational.Terminators.T_1000;
import Patterns.Creational.Terminators.Terminator;

public class FabricT_1000 extends FabricTerminators {
    @Override
    public Terminator createTerminators() {
        //дополнительная логика производства, которую мы можем добивать
        return new T_1000();
    }
    //так же и тут мы можем добавить дополнительную логику производства
}
