package exceptionmulticatch.converter;

public class InvalidBinaryStringException  extends RuntimeException {


    public InvalidBinaryStringException() {

    }

    public InvalidBinaryStringException(String message) {
        super(message);

    }


    public InvalidBinaryStringException(Throwable throwable) {
        super(throwable);
    }
}
