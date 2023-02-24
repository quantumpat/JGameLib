package time;

import core.Game;

public class GameLoop implements Runnable {

    /*
     * Variable(s)
     */

    private Game game;
    private Thread thread;
    private boolean running;


    /*
     * Object(s)
     */

    /**
     * Controls the speed of the game.
     * @param game The game object.
     */
    public GameLoop(Game game) {
        this.game = game;
    }


    /*
     * Method(s)
     */

    /**
     * Required by the Thread object.
     * Controls the FPS of the game loop.
     *
     * The FPS is set by default to 60.
     */
    @Override
    public void run() {

        //60FPS is default.
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0.0;
        long now;
        long lastTime = System.nanoTime();

        long timer = 0, ticks = 0;

        while(running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                update();
                render();

                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
                if (game.getConfig().isDebugging()) {
                    debug(ticks);
                }

                ticks = 0;
                timer = 0;
            }
        }

    }

    /**
     * Starts the game loop.
     */
    public synchronized void start() {

        if (running) {
            return;
        }

        running = true;

        thread = new Thread(this);
        thread.start();

    }

    /**
     * Stops the game loop.
     */
    public synchronized void stop() {

        if (!running) {
            return;
        }

        running = false;

        try {
            thread.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * Calls the game's update method.
     */
    public void update() {

        game.update();

    }

    /**
     * Calls the game's render method.
     */
    public void render() {

        game.render();

    }

    /**
     * Debugs the game (Called every 1 second or 1000ms).
     * @param fps The FPS (Frames Per Second) the game loop is running at.
     */
    public void debug(long fps) {

        if (game.getConfig().isDebuggingFPS())
            System.out.println("FPS: " + fps);

        game.debug();

    }


    /*
     * Getter(s) & Setter(s)
     */

    /**
     * Returns the Thread object.
     * @return The Thread object.
     */
    public Thread getThread() {
        return thread;
    }

    /**
     * Returns whether the game loop is running or not.
     * @return A boolean variable stating whether the game loop is running or not.
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Sets whether the game loop is running or not (if true, game loop starts, if false game loop stops).
     * @param running Whether the game loop is running or not.
     */
    public void setRunning(boolean running) {

        if (running)
            start();
        else
            stop();

    }

}
