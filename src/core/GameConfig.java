package core;

public class GameConfig {

    /*
     * Variable(s)
     */

    private String name, genre, author, version;


    /*
     * Object(s)
     */

    /**
     * Used to configure and store information regarding the game.
     *
     * @param name - The name of the game.
     */
    public GameConfig(String name) {

        this.name = name;

    }

    /**
     * Used to configure and store information regarding the game.
     *
     * @param name The name of the game.
     * @param author The author of the game.
     */
    public GameConfig(String name, String author) {

        this.name = name;
        this.author = author;

    }

    /**
     * Used to configure and store information regarding the game.
     *
     * @param name The name of the game.
     * @param author The author of the game.
     * @param genre The genre of the game.
     */
    public GameConfig(String name, String author, String genre) {

        this.name = name;
        this.author = author;
        this.genre = genre;

    }

    /**
     * Used to configure and store information regarding the game.
     *
     * @param name The name of the game.
     * @param author The author of the game.
     * @param genre The genre of the game.
     * @param version The version of the game.
     */
    public GameConfig(String name, String author, String genre, String version) {

        this.name = name;
        this.author = author;
        this.genre = genre;
        this.version = version;

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
    }

}
