package interfaces;

public class Trainer implements Human, HasName{

    private String name;

    @Override
    public String getName() {
        return name;
    }
}
