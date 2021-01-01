package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{
    private int cargoWeight;
    private int maxCargoWeight;


    public CanCarryGoodsBehaviour(int maxCargoWeight) {

        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int loadCargo(int weight) {
        int leftWeight = 0;
        if(weight<=maxCargoWeight){
            cargoWeight = weight;
        }else{
            leftWeight = weight-maxCargoWeight;
            cargoWeight = maxCargoWeight;
        }

        return leftWeight;
    }
}
