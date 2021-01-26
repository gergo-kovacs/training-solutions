package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class StatisticFromResources {
    public static void main(String[] args) {
        StatisticFromResources cityStatistic = new StatisticFromResources();
        System.out.println(cityStatistic.maxLengthCityFromFile("/iranyitoszamok_varosok-2021.csv"));
    }

    public String maxLengthCityFromFile(String fileName){

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(StatisticFromResources.class.getResourceAsStream(fileName)))) {

            skipHeader(bufferedReader);
            return maxLengthCity(bufferedReader);
        } catch (IOException e) {
            throw new IllegalArgumentException("Something went wrong!",e);
        }

    }

    private void skipHeader(BufferedReader br) throws IOException{
        br.readLine();
    }

    private String maxLengthCity(BufferedReader bufferedReader) throws IOException{
        String maxLength="";
        int lineNumber=0;
        String line;
        while ((line=bufferedReader.readLine())!=null){
            lineNumber++;
            String city = splitLine(line,lineNumber);
            if(city.length()>maxLength.length()){
                maxLength=city;
            }
        }
        return maxLength;
    }

    private String splitLine(String line, int lineNumber) throws IOException{
        String[] temp = line.split(";");
        if(temp.length>0){
            return temp[1].trim();
        }
        throw new IOException("Wrong line"+line+" in line"+lineNumber);
    }

}
