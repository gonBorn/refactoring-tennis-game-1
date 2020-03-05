package cn.xpbootcamp.tennis;

public class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void wonPoint() {
        score++;
    }

    public boolean isTiedWith(Player player) {
        return score == player.score;
    }
    public boolean hasWonAgainst(Player player) {
        return score >= 4 && score - player.score >= 2;
    }
    public boolean hasAdvantageOver(Player player) {
        return score >= 4 && score - player.score == 1;
    }

}
