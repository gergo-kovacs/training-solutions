package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {
    List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file){

        try(PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(file))){
            for(String n: names){
                if(n.startsWith("Dr")){
                    printWriter.println(n+": 500000");
                }
                else if(n.startsWith("Mr") || n.startsWith("Mrs")){
                    printWriter.println(n+": 200000");
                }else{
                    printWriter.println(n+": 100000");
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.",e);
        }
    }
}
