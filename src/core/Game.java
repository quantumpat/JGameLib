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
     * Starts up the game.
     */
    public void start() {
        printInfo();
    }

    /**
     * Pauses the game.
     */
    public void pause() {

    }

    /**
     * Terminates the game.
     */
    public void stop() {

    }

    /**
     * Prints game info.
     */
    private void printInfo() {

        int len = config.getName().length();
        System.out.print(config.getName());

        if (config.getVersion() != null) {
            System.out.println(" [" + config.getVersion() + "]");
            len += config.getVersion().length() + 3;
        }

        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println();

        if (config.getAuthor() != null) {
            System.out.println("By " + config.getAuthor());
        }

        if (config.getGenre() != null) {
            System.out.println("Genre: " + config.getGenre());
        }

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
