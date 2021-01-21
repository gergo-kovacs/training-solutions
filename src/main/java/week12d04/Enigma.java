package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma {

    public void printSecret(Path path){
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b:bytes) {
                char c = (char) (b+10);
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    public static void main(String[] args) {
        new Enigma().printSecret(Path.of("secret.dat"));

    }
}
