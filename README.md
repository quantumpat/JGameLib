# JGameLib

A Java-based 2D game engine.

<details><summary><h3>Getting Started</h3></summary>

#### Creating a game
Learn how to get started and make a game for yourself.

```java
Game demoGame = new Game("Demo Game");
demoGame.getConfig().setAuthor("Patrick Carroll");
demoGame.getConfig().setGenre("Adventure");
demoGame.getConfig().setVersion("1.0.0");
demoGame.getConfig().setSize(1280, 720);

demoGame.start();
```

#### Turning on debugging
Learn how to turn on debugging. Also learn how to turn on fps debugging.

```java
//Turns on debugging.
demoGame.getConfig().setDebugging(true);

//Logs FPS, also turns on debugging.
demoGame.getConfig().setDebuggingFPS(true);
```

</details>