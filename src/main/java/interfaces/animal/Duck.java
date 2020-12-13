package interfaces.animal;

public class Duck implements Animal{
    private final static int NUMBER_OF_LEGS=2;
    private final static String NAME="Duck";

    @Override
    public int getNumberOfLegs() {

        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {

        return NAME;
    }

    /*
    @Override
    public int getNumberOfLegs() {
        this.numberOfLegs=2;
        return numberOfLegs;
    }

    @Override
    public String getName() {
        this.name="Duck";
        return name;
    }
     */
}
