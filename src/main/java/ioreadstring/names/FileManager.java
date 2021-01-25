package ioreadstring.names;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("src/test/resources/names.txt");
        fileManager.readFromFile();
        fileManager.print();
    }


    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String path) {
        this.myFile = Path.of(path);
    }

    public void readFromFile(){

        try {
            List<String> fileReader = Files.readAllLines(myFile);
            for (int i = 0; i < fileReader.size(); i++) {
                String[] parts = fileReader.get(i).split(" ");
                humans.add(new Human(parts[0],parts[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

    public void print(){
        for (Human h: humans) {
            System.out.print(h.getFirstName()+" "+h.getLastName()+"\n");
        }
    }

    public Path getMyFile() {

        return myFile;
    }

    public List<Human> getHumans() {
        return List.copyOf(humans);
    }
}
