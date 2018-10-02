/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_38_INTERMEDIATE_REVERSE_POLISH_NOTATION;

/**
 *
 * @author adam
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Player {

    public static final List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");

    private int score;
    public int getScore() {
        return score;
    }
    String name;
    public String getName() {
        return name;
    }

    public void winBall() {
        this.score = this.score + 1;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getScoreDescription(){
        return pointsDescription.get(score);
    }

}