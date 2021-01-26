package week13d01;

//Add vissza a leghosszabb nevű várost!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HungarianCities {

    public static void main(String[] args) {
        HungarianCities h = new HungarianCities();
        System.out.println(h.searchLongestCityName());
    }

    String file = "iranyitoszamok_varosok-2021.csv";

    public String searchLongestCityName() {
        String line;
        Path path = Path.of(file);
        String tmp=" ";
        try {
            InputStream inputStream = Files.newInputStream(path);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            int i=0;
            while(bufferedReader.readLine() !=null){
                i++;
                if(i>1){
                    line=bufferedReader.readLine();
                    String[] city = line.split(";");
                    String postCodeAndName = city[0]+" "+city[1];
                    if(postCodeAndName.substring(postCodeAndName.indexOf(" ")).length()
                            >tmp.substring(tmp.indexOf(" ")).length()){
                        tmp = postCodeAndName;
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }

        return tmp;
    }
}