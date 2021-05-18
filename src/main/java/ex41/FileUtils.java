package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    static int countStrings(String path) throws FileNotFoundException {
        int strCounter = 0;
        for (int i = 0; i < readFile(path).size(); i++) {
            if (readFile(path).get(i) != null) {
                strCounter++;
            }
        }
        return strCounter;
    }

    static int countPalindroms(String path) throws FileNotFoundException {
        int plnCounter = 0;
        for (int i = 0; i < readFile(path).size() ; i++) {
            if (isPalindrom(readFile(path).get(i))) {
                plnCounter++;
            }
        }
        return plnCounter;
    }

    static boolean isPalindrom(String s) {
        if (s == null) return false;
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        return true;
    }

    public static List<String> readFile(String path) throws FileNotFoundException {
        List<String> scannerList = new ArrayList();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()) {
                scannerList.add(scanner.next());
            }
        }
        return scannerList;
    }
}
