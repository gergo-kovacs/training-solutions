package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public static void main(String[] args) {
        ByteChecker b = new ByteChecker();
        System.out.println(b.readBytesAndFindAs("data.dat"));

    }


    public int readBytesAndFindAs(String file) {
        int counter=0;
        char a = 'a';
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(Path.of(file)))) {

        byte[] buffer = new byte[1000];

            int size;
            while((size=inputStream.read(buffer))>0){
                for (int i = 0; i < size; i++) {
                    if (buffer[i] == a) {
                        counter++;
                    }
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }

        return counter;
    }


}
