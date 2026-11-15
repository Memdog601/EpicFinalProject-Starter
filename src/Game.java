import java.util.Scanner;

/**
 * Controls the menu, player creation, and future adventure actions.
 */
public class Game {
    private final Scanner input;
    private Player player;
    private boolean running;

    public Game() {
        input = new Scanner(System.in);
        running = true;
    }

    public void start() {
        Utils.printHeader("Welcome to the Java EPIC Final Project");

        while (running) {
            displayMenu();
            int choice = Utils.readInt(input, "Enter your choice: ");

            if (choice == 1) {
                createPlayer();
            } else if (choice == 2) {
                chooseGameMode();
            } else if (choice == 3) {
                viewPlayer();
            } else if (choice == 4) {
                runPlaceholderAction();
            } else if (choice == 5) {
                exitGame();
            } else {
                System.out.println("Invalid choice. Select a number from 1 to 5.");
            }
        }

        input.close();
    }

    private void displayMenu() {
        System.out.println();
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Create Player");
        System.out.println("2. Choose Game Theme");
        System.out.println("3. View Player");
        System.out.println("4. Start Action");
        System.out.println("5. Exit");
        System.out.println("================================");
    }

    private void createPlayer() {
        if (player != null) {
            System.out.println("Player already created: " + player.getName());
            return;
        }

        String name = Utils.readNonEmptyString(input, "Enter your player name: ");
        player = new Player(name);
        System.out.println("Welcome, " + player.getName() + "! Your player is ready.");
    }

    private void chooseGameMode() {
        if (player == null) {
            System.out.println("Please create a player first.");
            return;
        }

        System.out.println();
        System.out.println("Choose your game theme:");
        System.out.println("1. Fantasy Dungeon");
        System.out.println("2. Cyber Hacker");
        System.out.println("3. Space Explorer");

        int choice = Utils.readInt(input, "Enter your theme choice: ");
        if (choice == 1) {
            player.setGameMode(GameMode.FANTASY_DUNGEON);
        } else if (choice == 2) {
            player.setGameMode(GameMode.CYBER_HACKER);
        } else if (choice == 3) {
            player.setGameMode(GameMode.SPACE_EXPLORER);
        } else {
            System.out.println("Invalid theme choice. Please select 1, 2, or 3.");
            return;
        }

        System.out.println("Theme selected: " + player.getGameMode().getDisplayName());
    }

    private void viewPlayer() {
        if (player == null) {
            System.out.println("No player exists yet. Choose option 1 first.");
            return;
        }
        player.displayProfile();
    }

    /** Placeholder for future game actions in upcoming weeks. */
    private void runPlaceholderAction() {
        if (player == null) {
            System.out.println("Create a player before starting an action.");
        } else if (player.getGameMode() == null) {
            System.out.println("Choose a game theme before starting an action.");
        } else {
            System.out.println(player.getName() + " prepares for a "
                    + player.getGameMode().getDisplayName() + " adventure!");
            System.out.println("More gameplay features are coming in future weeks.");
        }
    }

    private void exitGame() {
        System.out.println("Thanks for playing. Goodbye!");
        running = false;
    }
}
