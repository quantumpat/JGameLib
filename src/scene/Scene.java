package scene;

import core.Game;

public class Scene {

    /*
     * Variable(s)
     */

    private Game game;
    private boolean active = false;


    /*
     * Object(s)
     */

    /**
     * A state of the game.
     */
    public Scene() {

    }


    /*
     * Method(s)
     */

    /**
     * Starts the scene.
     */
    public void start() {

        if (active)
            return;

    }

    /**
     * Stops the scene.
     */
    public void stop() {

        if (!active)
            return;

    }


    /*
     * Getter(s) & Setter(s)
     */

    /**
     * Returns the game object.
     * @return The game object.
     */
    public Game getGame() {
        return game;
    }

    /**
     * Returns the name of the scene (same as the class name).
     * @return Returns the name of the scene (same as the class name).
     */
    public String getName() {
        return getClass().getSimpleName();
    }

    /**
     * Returns whether the scene is actively running or not.
     * @return Whether the scene is actively running or not.
     */
    public boolean isActive() {
        return active;
    }

}
