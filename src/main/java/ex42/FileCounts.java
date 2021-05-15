package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCounts {
    private static int lineCounter;
    private static int wordCounter;
    static int charCounter;

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("type your filepath here:");
        Scanner input = new Scanner(System.in);

        readFile(input.next());

        System.out.println("Lines no = " + lineCounter);
        System.out.println("Words no = " + wordCounter);
        System.out.println("Char no = " + charCounter);
    }

    public static int charCounts(String stringToCountChars) {
        if (stringToCountChars == null) {
            return 0;
        }
        charCounter += stringToCountChars.length();
        return charCounter;

    }

    public static int wordCounts(String line) {
        if (line == null) {
            return 0;
        }
        String[] stringsToCount = line.split(" ");

        for (int i = 0; i < stringsToCount.length; i++) {
            charCounts(stringsToCount[i]);
            wordCounter++;
        }
        return wordCounter;
    }

    public static boolean readFile(String path) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCounter++;
                if(!line.isEmpty()) {
                    wordCounts(line);
                    return true;
                }
            }
            return false;
        }
    }
}
