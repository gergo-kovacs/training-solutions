package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Corona {

    private List<CovidCaseByWeek> cases = new ArrayList<>();


    public void readFile(BufferedReader bufferedReader) {
        try {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
               if(line.contains("Hungary")){
                   cases.add(processLine(line));
               }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Fail at reading!");
        }

    }

        private CovidCaseByWeek processLine(String line){
        String[] temp = line.split(",");
        int numberOfCases = Integer.parseInt(temp[2]);

        return new CovidCaseByWeek(temp[1],numberOfCases);
        }

        public List<String> findFirstThree(){
        List<CovidCaseByWeek> sorted = new ArrayList<>(cases);
            Collections.sort(sorted);
            List<String> result = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                result.add(sorted.get(i).getWeek());
            }
            return result;
        }


        public List<CovidCaseByWeek> getCases(){
        return new ArrayList<>(cases);
        }

    public static void main(String[] args) {


        Path file = Path.of("data2.csv");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            Corona coronaStat = new Corona();
            coronaStat.readFile(reader);
            System.out.println(coronaStat.getCases());
            System.out.println(coronaStat.findFirstThree());
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!");
        }

    }
}