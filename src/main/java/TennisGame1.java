
public class TennisGame1 implements TennisGame {

    private int nScore1 = 0;
    private int nScore2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void scorePoints(String playerName) {
        int i = (playerName == player1Name) ? (nScore1 += 1) : (nScore2 += 1);
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (nScore1 == nScore2) {
            return equalsScore(nScore1, score);
        } if (nScore1 >= 4 || nScore2 >= 4) {
            return showScore(nScore1, nScore2, score);
        } return showScore2(nScore1, nScore2, score, tempScore);
    }

    public String equalsScore(int nScore1, String score) {
        switch (nScore1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public String showScore(int nScore1, int nScore2, String score) {
        int minusResult = nScore1 - nScore2;
        if (minusResult == 1) {
            return  "Advantage player1";
        } if (minusResult == -1) {
            return  "Advantage player2";
        } if (minusResult >= 2) {
            return  "Win for player1";
        } return  "Win for player2";
    }

    public String showScore2(int nScore1, int nScore2, String score, int tempScore) {
        for (int i = 1; i < 3; i++) {
            if (i == 1){
                tempScore = nScore1;
            }
            else {
                score += "-";
                tempScore = nScore2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
