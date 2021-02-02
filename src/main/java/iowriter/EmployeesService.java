package iowriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesService {


    List<String> employees = new ArrayList<>(Arrays.asList("Nagy Lajos","Kis Lajos","Magas Lajos"));
    Path path = Path.of("employees.txt");

    public void writer(){
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            for (String s:employees) {
                bufferedWriter.write(s);
                bufferedWriter.write("\n");
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not write file.",e);
        }
    }

    public  void writerBeforeJava8(){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("employees.txt"))){
            for(String s: employees){
                bufferedWriter.write(s);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file",e);
        }
    }



    public static void main(String[] args) {
        EmployeesService service = new EmployeesService();
        service.writer();
        service.writerBeforeJava8();
    }

}
