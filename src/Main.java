import core.Game;
import core.GameConfig;

public class Main {
    public static void main(String[] args) {

        Game demoGame = new Game("Demo Game");
        demoGame.getConfig().setAuthor("Patrick Carroll");
        demoGame.getConfig().setGenre("Adventure");
        demoGame.getConfig().setVersion("1.0.0");
        demoGame.getConfig().setSize(1280, 720);

        demoGame.start();

    }
}