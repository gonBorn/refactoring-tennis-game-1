
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {
    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        AbstractScore tiedScore = new TiedScore(player1, player2);
        if (tiedScore.isApplied()) {
            return tiedScore.state();
        }
        AbstractScore advantageScore = new AdvantageScore(player1, player2);
        if (advantageScore.isApplied()) {
            return advantageScore.state();
        }
        AbstractScore winScore = new WinScore(player1, player2);
        if (winScore.isApplied()) {
            return winScore.state();
        }
        AbstractScore regularLandScore = new RegularLandScore(player1, player2);
        if (regularLandScore.isApplied()) {
            return regularLandScore.state();
        }
        return "";
    }
}