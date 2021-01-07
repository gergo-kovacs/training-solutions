package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    //Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név, valamint skillek (hogy mihez ért az illető).
    // A skill egy névvel és egy számmal (szint) rendelkezik, utóbbi 1 - 5 között.
    //
    //Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.
    //
    //A skillek megadása a nevével, valamint a szintjével történik, pl. programming (5).
    //
    //A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét.

    private String name;
    private Skill skill;
    private List<Skill> skillsList = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skillsList;
    }

    public void addSkills(String... skills) {

        for (String s: skills) {
            skillsList.add(new Skill(s.substring(0,s.length()-4),Integer.parseInt(s.substring(s.length()-2,s.length()-1))));
        }
    }

    public int findSkillLevelByName(String name){
        int result=0;
        for (Skill item:skillsList) {
            if(item.getName().equals(name)){
                result= item.getLevel();
            }
        }
        return result;
    }

}
