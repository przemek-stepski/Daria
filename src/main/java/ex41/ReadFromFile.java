package ex41;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        palindromAndStringCounter();
    }

    public static void palindromAndStringCounter() throws FileNotFoundException {
        int stringCounter = 0;
        int palinCounter = 0;

        Scanner scanner = new Scanner(new File("/Users/pstepski/IdeaProjects/The Person class p.12/src/main/resources/palin.txt"));

        while (scanner.hasNext()) {
            stringCounter++;
            palinCounter ++;

            String stringFromFile = scanner.next();

            for (int i = 0; i < stringFromFile.length() / 2; i++) {
                if (stringFromFile.charAt(i) != stringFromFile.charAt(stringFromFile.length() - 1 - i)) {
                    palinCounter--;
                    break;
                }
            }
        }
            System.out.println("Strings = " + stringCounter);
            System.out.println("Palindromes = " + palinCounter);

    }
}

