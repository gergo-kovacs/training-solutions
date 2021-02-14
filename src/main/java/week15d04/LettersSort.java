package week15d04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LettersSort {


public Path path = Path.of("pelda.txt");

    public static void main(String[] args) {
        Path path = Path.of("src/pelda.txt");
        LettersSort ls = new LettersSort();
        ls.reader(path);

    }

    public void reader(Path path){
    try (BufferedReader br = Files.newBufferedReader(path)) {
        String line;
        int vowels=0;
        int consonants=0;
        int otherCharacters=0;

        while((line = br.readLine()) != null) {
            List<Integer> lines = counter(line);
            vowels+=lines.get(0);
            consonants+=lines.get(1);
            otherCharacters+=lines.get(2);
        }
        System.out.println(vowels+" "+consonants+" "+otherCharacters);
    }
    catch (IOException ioe) {
        throw new IllegalStateException("Can not read file", ioe);
    }


}

    public List<Integer> counter(String line){
        List<Integer> resultLine = new ArrayList<>();
        int characterNumber = 0;
        int characterSum=0;
        line=line.toLowerCase();
        List<Character> chars = Arrays.asList('a','á','e','é','i','í','o','ó','ö','ő','ü','ű','u','ú');
        List<Character> oneLine = new LinkedList<>();

    for (int i = 0; i < line.length(); i++) {
        if(line.charAt(i)!=' ') {
            oneLine.add(line.charAt(i));
            characterSum++;
        }
    }

    List<Character> copyline = new ArrayList<>(oneLine);
    copyline.removeAll(chars);

    int i = copyline.size() - 1;
    while (i >= 0) {
        if(((int) copyline.get(i))>=97 && (((int) copyline.get(i))<=122)){
            characterNumber++;
        }
        i--;
    }

    oneLine.retainAll(chars);
    resultLine.addAll(new ArrayList<>(Arrays.asList(oneLine.size(),characterNumber,characterSum - (oneLine.size()+characterNumber))));
    return resultLine;
}



}
