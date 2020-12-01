package immutable.satellite;

public class Satellite {
    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent){
    if(registerIdent==""){
        throw new IllegalArgumentException("Register ident must not be empty!");
    }

    this.registerIdent = registerIdent;
    this.destinationCoordinates = destinationCoordinates;

    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public void modifyDestination(CelestialCoordinates diff){
    destinationCoordinates = new CelestialCoordinates(destinationCoordinates.getX() + diff.getX(),
                                                      destinationCoordinates.getY() + diff.getY(),
                                                      destinationCoordinates.getZ() + diff.getZ());
    }

    @Override
    public String toString() {
        return
                registerIdent +": "+ destinationCoordinates;
    }
}

