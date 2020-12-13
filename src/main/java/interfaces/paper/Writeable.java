package interfaces.paper;

public interface Writeable {
    int DEFAULT_CONTENT_SIZE = 100;

    boolean write(String text);
}
