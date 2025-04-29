public class Player {
    private String name;
    private int score;
    private boolean skipNextTurn;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.skipNextTurn = false;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public boolean shouldSkip() {
        return skipNextTurn;
    }

    public void setSkipNextTurn(boolean skip) {
        this.skipNextTurn = skip;
    }
}
