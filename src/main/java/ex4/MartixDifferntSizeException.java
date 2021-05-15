package ex4;

public class MartixDifferntSizeException extends Exception {
    private final static String message = "Matrix must be the same size";

    MartixDifferntSizeException () {
        super(message);
    }
    MartixDifferntSizeException (String yourMessage) {
        super(yourMessage);
    }
}
