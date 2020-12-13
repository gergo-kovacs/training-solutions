package interfaces.animal;

public class Worm implements Animal{

    private static final int NUMBER_OF_LEGS = 0;
    private static final String NAME = "Worm";

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
