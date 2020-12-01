package immutable.satellite;


import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    List<Satellite> satellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite){
        if(satellite==null){
            throw new NullPointerException("Parameter must not be null!");
        }
            satellites.add(satellite);

    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        for (int i = 0; i < satellites.size(); i++) {
            if(satellites.get(i).getRegisterIdent().equals(registerIdent)){
                return satellites.get(i);
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!"+registerIdent);
    }

    //"[ASD345: CelestialCoordinates: x=12, y=23, z=45, QWE789: CelestialCoordinates: x=22, y=33, z=44]"
    @Override
    public String toString() {

        return satellites.toString();
    }
}
