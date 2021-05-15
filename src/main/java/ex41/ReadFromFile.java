package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    private static int strCounter = 0;
    private static int plnCounter = 0;


    public static void main(String[] args) throws FileNotFoundException {
        readFile("src/main/resources/palin.txt");
        System.out.println("Strings no = " + strCounter);
        System.out.println("Palindromes no = " + plnCounter);
    }

    static boolean isPalindrom(String s) {
        if (s == null) return false;
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        plnCounter++;
        return true;
    }


    public static int readFile(String path) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()) {
                String strFromFile = scanner.next();
                strCounter++;
                isPalindrom(strFromFile);
            }
        }
        return strCounter;
    }
}
