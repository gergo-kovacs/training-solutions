package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FilesSum {

/*
 Adott az aktuális könyvtárban több, fájl, melynek a nevei: number00.txt, number03.txt, number20.txt,
 egészen 99-ig.
 Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt.
 Olvasd be az állományból a benne lévő
 számot, és ezt összegezd!
 Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
 Használd a Files.readString() metódust a fájl beolvasására!
 A FilesSum osztály sumNumbers(InputStream) metódusába dolgozz!
* */

public static void main(String[] args) {
    FilesSum filesSum = new FilesSum();
    filesSum.sumNubers();
}

   public int sumNubers(){
        int sum = 0;
        for (int i = 0; i < listOfNames().size(); i++) {
           Path path = Path.of(listOfNames().get(i));
           if(Files.isRegularFile(path)){
               System.out.println(path);
               sum += readFromFile(path);
           }
       }

       System.out.println(sum);
       return sum;
    }

    private List<String> listOfNames(){
        List<String> filenames = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            if(i<10){
                filenames.add("number0"+i+".txt");
            }
                filenames.add("number"+i+".txt");
        }
    return filenames;
    }

    private int readFromFile(Path path){
       int content;
        try {
            content = Integer.parseInt(Files.readString(path));
        } catch (IOException e) {
            throw  new IllegalStateException("Can not read file.");
        }
        return content;
    }

}

