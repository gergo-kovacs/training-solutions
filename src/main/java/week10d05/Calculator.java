package week10d05;

//Mai junior-mid-level feladat:
//Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
//A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
//Példa: ha az arr tartalma [1, 3, 5, 7, 9],
//akkor a minimum összeg 1+3+5+7=16.

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] array){

        //sort nélkül is vmikor...

        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += array[i];
        }

        return sum;
    }
}
