package co.com.sofka;

import co.com.sofka.tennis.TennisGame;
import co.com.sofka.tennis.TennisGame1;

public class App {
    public static void main(String[] args) {
        String jugador = "Leonardo";
        TennisGame tennisGame = new TennisGame1(jugador);
        tennisGame.wonPoint("Andrea");
        tennisGame.wonPoint(jugador);
        tennisGame.wonPoint(jugador);
        tennisGame.wonPoint(jugador);
        System.out.println(tennisGame.getScore());
    }
}
