package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma2 {

    public String printSecret(Path path){
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b:bytes) {
                char c = (char) (b+10);
                sb.append(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = new Enigma2().printSecret(Path.of("secret.dat"));
        System.out.println(result);
    }
}
