package scene;

import core.Game;

import java.util.ArrayList;

public class SceneManager {

    /*
     * Variable(s)
     */

    private Game game;
    private ArrayList<Scene> scenes;
    private Scene currentScene;
    private Scene firstScene;


    /*
     * Object(s)
     */

    /**
     * Manages all scene components.
     * @param game The game object.
     */
    public SceneManager(Game game) {

        this.game = game;

        scenes = new ArrayList<Scene>();

    }


    /*
     * Method(s)
     */

    /**
     * Adds a scene.
     * @param scene The scene to be added.
     */
    public void add(Scene scene) {

        if (scene == null)
            return;

        scenes.add(scene);

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

}
