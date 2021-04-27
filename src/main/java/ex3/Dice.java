package ex3;

import java.util.Random;

public class Dice {
    private int dieThrow;

    public Dice() {
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}

