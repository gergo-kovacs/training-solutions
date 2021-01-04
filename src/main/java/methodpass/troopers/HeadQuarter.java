package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    List<Trooper> troopers = new ArrayList<>();

    public List<Trooper>getTroopers(){
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        if(trooper==null){
            throw new IllegalArgumentException();
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target){
        if(target==null){
            throw new IllegalArgumentException();
        }
        if(name.equals("") || name == ""){
            throw new IllegalArgumentException();
        }
        findTrooperByName(name).changePosition(target);
    }

    private Trooper findTrooperByName(String name){

        for (Trooper t:troopers) {
            if(t.getName().equals(name)){
                return t;
            }
        }
        return null;
    }

    public void moveClosestTrooper(Position target){
        if(target==null){
            throw new IllegalArgumentException();
        }
        findClosesTrooper(target).changePosition(target);
    }

    private Trooper findClosesTrooper(Position target){
        double minDistance=troopers.get(0).distanceFrom(target);
        for (int i = 0; i <troopers.size() ; i++) {
            if(minDistance>troopers.get(i).distanceFrom(target)){
                minDistance = troopers.get(i).distanceFrom(target);
            }
        }
        for (Trooper t: troopers ) {
            if(t.distanceFrom(target)==minDistance){
                return t;
            }
        }
        return null;
    }



}
