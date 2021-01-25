package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Register {


    public void newMark(Path file, int mark){

            try {
                if(Files.exists(file)) {
                    Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
                }else{
                    Files.writeString(file, Integer.toString(mark));
                }
            } catch (IOException e) {
                throw new IllegalStateException("Can not write file",e);
            }

    }

    public void average(Path file){

        try {
            List<String> lines = Files.readAllLines(file);
            Files.writeString(file, "average: "+ avg(lines),StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Double avg(List<String> marksList){
        List<Double> doubleList = new ArrayList<>();
        for (String item:marksList) {
            doubleList.add(Double.valueOf(item));
        }
        double sum=0.0;
        for (Double item:doubleList) {
            sum += item;
        }

        return sum/marksList.size();
    }

}
