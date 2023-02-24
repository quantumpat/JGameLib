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
    private int width, height;


    /*
     * Object(s)
     */

    /**
     * A window to contain the canvas.
     * @param game The game object.
     */
    public Window(Game game) {

        this.game = game;

        width = game.getConfig().getWidth();
        height = game.getConfig().getHeight();

        frame = new JFrame(game.getConfig().getName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(width, height));
        frame.setFocusable(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();

        frame.setVisible(true);

    }


    /*
     * Methods
     */

    /**
     * Called when the game config is changed.
     */
    public void configUpdated() {

        frame.setTitle(game.getConfig().getName());

        width = game.getConfig().getWidth();
        height = game.getConfig().getHeight();
        frame.setSize(new Dimension(width, height));

        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));

        frame.pack();

    }


    /*
     * Getters & Setters
     */

    /**
     * Returns the game object.
     * @return The game object.
     */
    public Game getGame() {
        return game;
    }

    /**
     * Returns the JFrame object.
     * @return The JFrame object.
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Returns the Canvas object.
     * @return The Canvas object.
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * Returns the width of the window (in pixels).
     * @return The width of the window (in pixels).
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the window (in pixels).
     * @return The height of the window (in pixels).
     */
    public int getHeight() {
        return height;
    }

}
