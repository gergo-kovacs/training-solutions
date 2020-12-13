package interfaces.animal;

public class Lion implements Animal{

    private static final int NUMBER_OF_LEGS = 4;
    private static final String NAME = "Lion";

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return NAME;
    }

}
