package stringbasic.pets;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void add(Pet pet){

        for (Pet p:getPets()) {
            if(areEquals(p,pet)){
            return;
            }
        }
            pets.add(pet);
    }

    private boolean areEquals(Pet petA, Pet petB){
        if(petA.getRegNumber().equals(petB.getRegNumber())){
            return true;
        }
        return false;
    }

}
