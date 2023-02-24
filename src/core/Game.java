package core;

import gfx.Window;
import scene.SceneManager;
import time.GameLoop;

import java.awt.event.WindowEvent;

public class Game {

    /*
     * Variable(s)
     */

    private String name = "";
    private GameConfig config;
    private Window window;
    private GameLoop gameLoop;
    private SceneManager sceneManager;


    /*
     * Object(s)
     */

    /**
     * Manages all components of the game.
     *
     * @param name The name of the game
     */
    public Game(String name) {

        this.name = name;
        config = new GameConfig(this);

    }


    /*
     * Method(s)
     */

    /**
     * Called when the config game config is changed.
     */
    protected void configUpdated() {

        if (window != null) {
            window.configUpdated();
        }

    }

    /**
     * Updates the game.
     */
    public void update() {

    }

    /**
     * Renders the game.
     */
    public void render() {

    }

    /**
     * Debugs the game.
     */
    public void debug() {

    }

    /**
     * Starts up the game.
     */
    public synchronized void start() {

        printInfo();

        if (window == null)
            window = new Window(this);

        if (gameLoop == null) {
            gameLoop = new GameLoop(this);
            gameLoop.start();
        }

    }

    /**
     * Pauses the game.
     */
    public void pause() {

        if (gameLoop != null)
            gameLoop.setPaused(true);

    }

    /**
     * Unpauses the game.
     */
    public void unpause() {

        if (gameLoop != null)
            gameLoop.setPaused(false);

    }

    /**
     * Terminates the game.
     */
    public synchronized void stop() {

        if (gameLoop != null)
            gameLoop.stop();

        if (window != null) {
            window.close();
        }

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

        if (config.getAuthor() != null || config.getGenre() != null)
            System.out.println();

    }


    /*
     * Getter(s) & Setter(s)
     */

    /**
     * Returns the name of the game.
     * @return The name of the game.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the config object.
     * @return The config object.
     */
    public GameConfig getConfig() {
        return config;
    }

    /**
     * Returns the game's window.
     * @return The game's window.
     */
    public Window getWindow() {
        return window;
    }

    /**
     * Returns the game's loop object.
     * @return The game's loop object.
     */
    public GameLoop getGameLoop() {
        return gameLoop;
    }

}
