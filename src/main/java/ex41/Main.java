package ex41;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println( "Number of palindromes in file: " + FileUtils.countPalindroms("src/main/resources/palin.txt"));
        System.out.println("Number of Strings in file: " + FileUtils.countStrings("src/main/resources/palin.txt"));



    }
}
