package week12d05;

/*
*
* Töltsd le az index.hu nyitólapját böngészőből, ez egy html állomány!
* Másold be a projektedbe (index.html) néven! Ez egy szöveges állomány.
*  Olvasd be, és számold meg, hány sorban szerepel a koronavírus szó!*/

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaFinder {

    public static void main(String[] args) {
        CoronaFinder coronaFinder = new CoronaFinder();
        System.out.println(coronaFinder.find());
    }

    public int find(){
        Path path = Path.of("index.htm");
        int counter=0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line;
            while((line=bufferedReader.readLine())!=null){

                if(line.contains("koronavirus")){
                    counter++;
                }
            }


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }

        return counter;

    }

}
