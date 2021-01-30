package collectionsequalshash.trainer;

import java.util.Objects;

public class Trainer {

    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(name, trainer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

/*
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;            //NullPointer Exception ellen
        }

        if(obj.getClass() != Trainer.class){
            return false;           //ClassCast Exception ellen
        }

        if(this.name == null){      //ha a name attributum null
            return false;
        }

        return Objects.equals(this.name, ((Trainer) obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/
}
