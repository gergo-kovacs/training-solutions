package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();

    private int waitingPersons;
    private int waitingCargo;

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void addShip(Ship ship){
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeights){
        int remainingPersons = passengers;
        int remainingCargo = cargoWeights;

        for (Ship s:ships) {
        if(s instanceof CanCarryPassengers){
            if(remainingPersons != 0){
                remainingPersons =  ((CanCarryPassengers) s).loadPassenger(remainingPersons);
            }
        }
        if(s instanceof CanCarryGoods){
                if(remainingCargo != 0){
                    remainingCargo =  ((CanCarryGoods) s).loadCargo(remainingCargo);
                }
            }
        }

        waitingCargo = remainingCargo;
        waitingPersons = remainingPersons;
    }
}
