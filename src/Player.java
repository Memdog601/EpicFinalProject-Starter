/**
 * Stores the player's name, level, and chosen adventure theme.
 */
public class Player {
    private String name;
    private int level;
    private GameMode gameMode;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.gameMode = null;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    /** Displays the current player profile in the console. */
    public void displayProfile() {
        Utils.printHeader("PLAYER INFO");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Theme: " + (gameMode == null
                ? "Not selected" : gameMode.getDisplayName()));
    }
}
