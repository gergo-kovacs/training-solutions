package collectionsequalshash.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testEquals(){

        // ==     Ugyanarra az obkeltumra referálnak-e
        // equals Két objektum állapota megegyezik-e
        String literal1 = "John";  //JVM String pool -> string literálnak tartja fenn a helyet...
        String literal2 = "John";
        String text1 = new String("John");
        String text2 = new String("John");

        System.out.println(literal1 == literal2);  //true
        System.out.println(literal1.equals(literal2)); //true

        System.out.println(text1 == text2);  //false
        System.out.println(text1.equals(text2)); //true

        Trainer trainer1 = new Trainer("John Doe");
        Trainer trainer2 = new Trainer("John Doe");

        System.out.println(trainer1==trainer2);  //false
        System.out.println(trainer1.equals(trainer2));  //false   Object-ben van az equals és ez az eqauls
                                                        //az == operátort használja
        //Object osztályban lévő equals még az == operátorral egyezően viselkedik,
        //de az olyan osztályokban, mint a String, ArrayList, primitív burkolók már felülírták.

        List<Integer> integerList1 = Arrays.asList(1,2,3);
        List<Integer> integerList2 = Arrays.asList(1,2,3);

        System.out.println(integerList1.equals(integerList2));  //true

        System.out.println(trainer1.hashCode()); //1586845078
        System.out.println(trainer2.hashCode()); //1356728614

      //   Ovverride után:       //-1367319356
                                 //-1367319356
    }

}