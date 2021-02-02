package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    Path path;

    public NameWriter(Path path) {
        this.path = path;
    }

    public void addAndWrite(String name){
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            writer.write(name);
            writer.newLine();
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file.");
        }
    }
}
