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
import java.util.Locale;

public class CoronaFinder {

    public static void main(String[] args) {
    CoronaFinder cvf = new CoronaFinder();
    Path path = Path.of("src/main/resources/index.htm");
        try {
            System.out.println(cvf.find(Files.newBufferedReader(path),"koronavírus"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int find(BufferedReader bufferedReader, String word){

        int counter=0;
        try {
            String line;

            while((line=bufferedReader.readLine())!=null){

                if(line.contains(word)){
                    counter++;
                }
            }


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        } catch (NullPointerException npe){
            throw new IllegalStateException("File not found",npe);
        }

        return counter;

    }

}
