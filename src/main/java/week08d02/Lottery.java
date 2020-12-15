package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {


    public List<Integer> getNumbers(int interval, int numbers){
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numbers; i++) {
        numbersList.add(random.nextInt(interval)+1);
        }
        return numbersList;
    }


}
