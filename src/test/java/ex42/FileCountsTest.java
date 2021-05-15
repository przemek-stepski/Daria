package ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FileCountsTest {

    @Test
    void shouldReturnCharNumberInString() {
        String string1 = "Get out!";
        FileCounts.charCounter = 0;

        Assertions.assertEquals(8, FileCounts.charCounts(string1));
    }

    @Test
    void shouldReturnNumberOfWordsInString() {
        String string = "Get out + of my way ! ! !!!";

        Assertions.assertEquals(9, FileCounts.wordCounts(string));
    }

    @Test
    void shouldReturnFalseIfFilEmpty() throws FileNotFoundException {
        String path = "/Users/pstepski/Desktop/empty.txt";

        Assertions.assertFalse(FileCounts.readFile(path));
    }

    @Test
    void shouldReturnExceptionIfWrongPath() {
        String path = "wrong path";
        Assertions.assertThrows(FileNotFoundException.class, () -> FileCounts.readFile(path));
    }

}