package ex3;

class DiceTest {

    public static void main(String[] args) {
        diceThrower();
    }

    public static void diceThrower() {
        Dice dice = new Dice();

        for (int i = 1; i <= 20; i++) {
            System.out.println( "Wynik rzutu " + (i) + " to " + dice.roll());
        }
    }
}

