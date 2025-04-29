import java.util.*;

public class DiceGameArena {
    private List<Player> players;
    private int rounds;

    public DiceGameArena(int rounds) {
        players = new ArrayList<>();
        this.rounds = rounds;
    }

    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public void startGame() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        for (int round = 1; round <= rounds; round++) {
            System.out.println("\n🎲 Round " + round + " Begins:");
            for (Player player : players) {
                if (player.shouldSkip()) {
                    System.out.println("⏭️ " + player.getName() + " is skipping this turn.");
                    player.setSkipNextTurn(false);
                    continue;
                }

                System.out.print("🔁 " + player.getName() + ", press Enter to roll the dice...");
                sc.nextLine();

                int roll = rand.nextInt(6) + 1;
                System.out.println("🎲 Rolled: " + roll);
                player.addScore(roll);

                String eventMsg = GameEvent.applyRandomEvent(player);
                System.out.println("🎉 Event: " + eventMsg);
            }
        }

        System.out.println("\n🏆 Final Scores:");
        players.sort((a, b) -> b.getScore() - a.getScore());
        for (Player p : players) {
            System.out.println(p.getName() + ": " + p.getScore() + " points");
        }

        System.out.println("\n👑 Winner: " + players.get(0).getName() + "!");
    }
}
