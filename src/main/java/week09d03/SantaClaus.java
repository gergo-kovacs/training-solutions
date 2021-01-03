package week09d03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SantaClaus{

    List<Person> personList = new ArrayList();

    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }

    public void getThroughChimneys(){

        for (Person p:personList) {

          p.setPresent();
        }
    }

    public void presentList(){
        for (Person p: personList) {
            if(p.getPresent()==null){
                System.out.println(p.getName()+" "+p.getAge()+" "+"Nem kapott ajándékot.");
            }else{
                System.out.println(p.getName()+" "+p.getAge()+" "+p.getPresent());
            }

        }
    }

}
