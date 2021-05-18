package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;


class FileUtilsTest {

    @Test
    public void shouldReturnTrueIfStingPalindrome() {
        String pal = "kayak";
        Assertions.assertTrue(FileUtils.isPalindrom(pal));
    }

    @Test
    public void shouldReturnFalseIfStingNotPalindrome() {
        String pal = "abc";
        Assertions.assertFalse(FileUtils.isPalindrom(pal));
    }

    @Test
    public void shouldReturnFalseIfStingNull() {
        String pal = null;
        Assertions.assertFalse(FileUtils.isPalindrom(pal));
    }

    @Test
    public void  shouldReturnNumberOfStringsInFile() throws FileNotFoundException {
        String path = "src/main/resources/palin.txt";
        Assertions.assertLinesMatch(Arrays.asList("ovo", "xpto", "radar", "Porto", "pco", "ppo", "pop", "level", "xyz", "xyx", "abba", "abcba"), FileUtils.readFile(path));
    }

    @Test
    public void shouldReturnNumberOfStringsInTheSource () throws FileNotFoundException {
        String path = "src/main/resources/test.txt";

        Assertions.assertEquals(5,FileUtils.countStrings(path));
    }

    @Test
    public void shouldReturnNumberOfPalindromesInTheSource () throws FileNotFoundException {
        String path = "src/main/resources/test.txt";

        Assertions.assertEquals(2,FileUtils.countPalindroms(path));
    }

    @Test
    public void shouldReturnExceptionIfNoSource () throws FileNotFoundException {
        String path = "wrong path";

        Assertions.assertThrows(FileNotFoundException.class, () -> FileUtils.countPalindroms(path));
    }

    @Test
    public void shouldReturnExceptionIfNoSource2 () throws FileNotFoundException {
        String path = "wrong path";

        Assertions.assertThrows(FileNotFoundException.class, () -> FileUtils.countStrings(path));
    }


}
