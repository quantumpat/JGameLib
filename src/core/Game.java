package core;

public class Game {

    /*
     * Variable(s)
     */
    private GameConfig config;


    /*
     * Object(s)
     */

    /**
     * Manages all components of the game.
     *
     * @param name The name of the game
     */
    public Game(String name) {

        config = new GameConfig(name);

    }

    /**
     * Manages all components of the game.
     *
     * @param config Configures the game.
     */
    public Game(GameConfig config) {

        this.config = config;

    }


    /*
     * Method(s)
     */

    /**
     * Prints game info.
     */

    private void printInfo() {
        System.out.println("Game created!");
    }


    /*
     * Getter(s) & Setter(s)
     */

    /**
     * @return The config object.
     */
    public GameConfig getConfig() {
        return config;
    }

}
