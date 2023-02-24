import core.Game;
import core.GameConfig;

public class Main {
    public static void main(String[] args) {

        GameConfig config = new GameConfig("Demo Game", "Patrick Carroll", "Adventure", "1.0.0");
        Game demoGame = new Game(config);
        demoGame.start();

    }
}