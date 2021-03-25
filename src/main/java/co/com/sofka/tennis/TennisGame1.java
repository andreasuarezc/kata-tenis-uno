package co.com.sofka.tennis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;

    public TennisGame1(String player1Name) {
        this.player1Name = player1Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            player1Score++;
        else
            player2Score++;
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return equalsScore();
        }
        if (player1Score >= 4 || player2Score >= 4) {
            return showScore();
        } return showScore2();
    }

    public String equalsScore() {
        Map<Integer, String> options = new HashMap<>();
        options.put(0, "Love-All");
        options.put(1, "Fifteen-All");
        options.put(2, "Thirty-All");
        return options.containsKey(player1Score) ? options.get(player1Score) : "Deuce";
    }

    public String showScore() {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return  "Advantage player1";
        }
        if (minusResult == -1) {
            return  "Advantage player2";
        } return minusResult >= 2 ?  "Win for player1" : "Win for player2";
    }

    public String showScore2() {
        ArrayList<String> options = new ArrayList<>(Arrays.asList("Love", "Fifteen", "Thirty", "Forty"));
            return options.get(player1Score) + "-" + options.get(player2Score);
    }
}
