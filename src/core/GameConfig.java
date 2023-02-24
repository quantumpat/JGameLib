package core;

public class GameConfig {

    /*
     * Variable(s)
     */

    private Game game;
    private String name, genre, author, version;
    private int width = 800, height = 600;


    /*
     * Object(s)
     */

    /**
     * Used to configure and store information regarding the game.
     *
     * @param game The game object.
     */
    public GameConfig(Game game) {

        this.game = game;

        name = game.getName();

    }


    /*
     * Getters & Setters
     */

    /**
     * Returns the name of the game.
     * @return The name of the game.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the game.
     * @param name The name of the game.
     */
    public void setName(String name) {
        this.name = name;
        game.configUpdated();
    }

    /**
     * @return The genre of the game.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre name of the game.
     * @param genre The genre of the game.
     */
    public void setGenre(String genre) {
        this.genre = genre;
        game.configUpdated();
    }

    /**
     * Returns the author's name.
     * @return The author of the game.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the game.
     * @param author - The author of the game.
     */
    public void setAuthor(String author) {
        this.author = author;
        game.configUpdated();
    }

    /**
     * Returns the current version of the game.
     * @return The version of the game.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the current version of the game.
     * @param version - The version of the game.
     */
    public void setVersion(String version) {
        this.version = version;
        game.configUpdated();
    }

    /**
     * Returns the width of the game window (in pixels).
     * @return The width of the game window (in pixels).
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the game window.
     * @param width The width of the game window to be set (in pixels).
     */
    public void setWidth(int width) {
        this.width = width;
        game.configUpdated();
    }

    /**
     * Returns the height of the game window (in pixels).
     * @return The height of the game window (in pixels).
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the game window (in pixels).
     * @param height The height of the game window to be set (in pixels).
     */
    public void setHeight(int height) {
        this.height = height;
        game.configUpdated();
    }

}
