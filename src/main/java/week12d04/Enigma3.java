package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma3 {

    public String printSecret(Path path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is = Files.newInputStream(path)){
            byte[] buffer = new byte[10];
            int size;
            while((size= is.read(buffer))>0){
                System.out.println(size);
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i]+10);
                    sb.append(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = new Enigma3().printSecret(Path.of("secret.dat"));
        System.out.println(result);
    }


}