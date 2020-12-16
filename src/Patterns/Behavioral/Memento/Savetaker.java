package Patterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Savetaker {
    List<Save> saves = new ArrayList<>();

    public void addSave(Save save){
        saves.add(save);
    }

    public Save getSave(int index){
        return saves.get(index);
    }
}
