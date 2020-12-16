package Patterns.Creational.Fabric;

import Patterns.Creational.Terminators.T_800;
import Patterns.Creational.Terminators.Terminator;

public class FabricT_800 extends FabricTerminators {
    @Override
    public Terminator createTerminators() {
        //дополнительная логика производства, которую мы можем добивать
        return new T_800();
    }
    //так же и тут мы можем добавить дополнительную логику производства
}


