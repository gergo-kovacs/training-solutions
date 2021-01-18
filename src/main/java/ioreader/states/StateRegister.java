package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }


    public void readStatesFromFile(String fileName){
        Path path = Path.of(fileName);

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                states.add(new State(line.substring(0, line.indexOf("-")), line.substring(line.indexOf("-")+1, line.length())));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!");
        }
    }

    public String findCapitalByStateName(String stateName){

        for (State item:states) {
            if(item.getStateName().equals(stateName)){
                return item.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }
}
