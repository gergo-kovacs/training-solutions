package ioreadbytes.training;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Employees {

    public static void main(String[] args) {
        Path path = Path.of("data.dat");
        try (InputStream i = new BufferedInputStream(Files.newInputStream(path))) {
            byte[] puffer = new byte[1000];
           int size;
            while ((size=i.read(puffer))>0){
                System.out.println(Arrays.toString(puffer));
                System.out.println(size);
            }
        } catch (IOException e) {
           throw new IllegalStateException("Can not read file");
        }

    }
}
