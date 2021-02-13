package ioreadbytes.bytematrix;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {


    private List<byte[]> myMatrix = new ArrayList<>();
    private Path file;

    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(myMatrix);
    }

    public void readBytesAndCreateMatrix(String fileName) {
        file = Path.of(fileName);
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] buffer = new byte[1000];
            int size=0;
            while((size=inputStream.read(buffer))>0) {
            myMatrix.add(buffer);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public int numberOfColumnsWhereMoreZeros() {
        int col = 0;

        for (int i = 0; i < 1000; i++) {
            int counter0=0;
            int counter1=0;
            for (byte[] m : myMatrix) {
                if (m[i] == 48) {  //48 ->zero
                    counter0++;
                } else {
                    counter1++;
                }
            }
            if(counter0>counter1){
                col++;
            }
        }

        return col;
    }
}
