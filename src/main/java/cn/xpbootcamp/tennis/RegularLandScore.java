package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class RegularLandScore {
    private final Player player1;
    private final Player player2;

    public RegularLandScore(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String state() {
        return getScoreName(player1.getScore()) + "-" + getScoreName(player2.getScore());
    }

    private String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}
