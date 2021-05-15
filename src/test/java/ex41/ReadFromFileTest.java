package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class ReadFromFileTest {

    @Test
    public void shouldReturnTrueIfStingPalindrome() {
        String pal = "kayak";
        Assertions.assertTrue(ReadFromFile.isPalindrom(pal));
    }

    @Test
    public void shouldReturnFalseIfStingNotPalindrome() {
        String pal = "abc";
        Assertions.assertFalse(ReadFromFile.isPalindrom(pal));
    }

    @Test
    public void shouldReturnFalseIfStingNull() {
        String pal = null;
        Assertions.assertFalse(ReadFromFile.isPalindrom(pal));
    }

    @Test
    public void  shouldReturnNumberOfStringsInFile() throws FileNotFoundException {
        String path = "src/main/resources/palin.txt";
        Assertions.assertEquals(12, ReadFromFile.readFile(path));
    }
}
