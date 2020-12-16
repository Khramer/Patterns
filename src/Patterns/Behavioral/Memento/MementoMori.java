package Patterns.Behavioral.Memento;

public class MementoMori {
    public static void main(String[] args) {
        Game game = new Game();
        Savetaker savetaker = new Savetaker();

        game.set("lvl_1", 100, 100);
        savetaker.addSave(game.save());
        System.out.println(game);

        game.set("lvl_2", 55, 44);
        savetaker.addSave(game.save());
        System.out.println(game);

        game.load(savetaker.getSave(0));
        System.out.println(game);
    }
}
