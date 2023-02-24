package gfx;

import core.Game;

import javax.swing.*;
import java.awt.*;

public class Window {

    /*
     * Variable(s)
     */

    private Game game;
    private JFrame frame;
    private Canvas canvas;
    private int width = 800, height = 600;


    /*
     * Object(s)
     */

    /**
     * A window to contain the canvas.
     * @param game The game object.
     */
    public Window(Game game) {

        this.game = game;

        frame = new JFrame(game.getConfig().getName());

    }


    /*
     * Methods
     */

    protected void configUpdated() {

        width = game.getConfig().getWidth();
        height = game.getConfig().getHeight();

        frame.setSize(new Dimension(width, height));

    }


    /*
     * Getters & Setters
     */

    public Game getGame() {
        return game;
    }

    public JFrame getFrame() {
        return frame;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
