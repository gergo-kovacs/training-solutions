package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//Hisztogram
//
//Olvass be egy szöveges fájlt soronként, melyben soronkont számok vannak. Majd hozz létre egy stringet,
// mely ugyanennyi sort tartalmaz, és annyi csillagot ír ki egymás mellé soronkont, amennyi a bemeneti
// fájlban lévő szám.
//
//Azaz a bemeneti fájl:
//
//3
//4
//1
//2
//
//A létrehozott String:
//
//***
//****
//*
//**
//
//Figyelj, hogy az algoritmusod lehetőleg hatékony legyen!
//
//A Histogram osztályba dolgozz, tesztje HistogramTest. Minden sor után legyen sortörés, az utolsó után is.
public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        String result="";
        while ((line = reader.readLine())  != null) {
            //System.out.println(line);
            result += word(line);
            result+="\n";
        }
        return result;
    }

    private StringBuilder word(String text){
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(text); i++) {
            stars.append("*");
        }
        System.out.println(stars);
        return stars;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("histogram.txt"))) {
            new Histogram().createHistogram(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

}
