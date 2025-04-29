import java.util.Random;

public class GameEvent {
    public static String applyRandomEvent(Player player) {
        Random random = new Random();
        int event = random.nextInt(4); // 0 to 3

        switch (event) {
            case 0:
                player.addScore(5);
                return "🎁 Bonus! +5 points";
            case 1:
                player.setSkipNextTurn(true);
                return "⛔ Skip next turn!";
            case 2:
                player.addScore(player.getScore());
                return "💥 Double Score!";
            case 3:
                return "🙂 No event.";
        }
        return "";
    }
}
