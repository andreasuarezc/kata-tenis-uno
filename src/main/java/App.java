public class App {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame1("Andrea", "Leonardo");
        tennisGame.scorePoints("Andrea");
        tennisGame.scorePoints("Leonardo");
        tennisGame.scorePoints("Leonardo");
        tennisGame.scorePoints("Leonardo");
        System.out.println(tennisGame.getScore());
    }
}
