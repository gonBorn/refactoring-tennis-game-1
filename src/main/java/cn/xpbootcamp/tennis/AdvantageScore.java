package cn.xpbootcamp.tennis;

public class AdvantageScore extends AbstractScore {
    public AdvantageScore(Player player1, Player player2) {
        super(player1,player2);
    }

    @Override
    public boolean isApplied() {
        return player1.hasAdvantageOver(player2) || player2.hasAdvantageOver(player1);
    }

    @Override
    public String state() {
        return "Advantage " + (player1.hasAdvantageOver(player2) ? player1.getName() : player2.getName());
    }
}
