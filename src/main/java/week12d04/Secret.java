package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {

    public static void main(String[] args) {
    Secret secret = new Secret();
    secret.secretMessage();

    }

    Path path = Path.of("secret.dat");
    byte[] input=null;
    public void secretMessage(){
        try {
            input = Files.readAllBytes(path);
        } catch (IOException e) {
            throw new IllegalStateException("File not found.");
        }

        for (byte b:input) {
            b+=10;
            System.out.print((char) b);
        }

    }
}
