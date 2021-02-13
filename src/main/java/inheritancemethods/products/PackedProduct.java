package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox){
        super(name,unitWeight,numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(int packingUnit) {
        this.packingUnit = packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    public void setWeightOfBox(BigDecimal weightOfBox) {
        this.weightOfBox = weightOfBox;
    }

    public BigDecimal totalWeight(int pieces){
        int numberOfBoxes;
        if(pieces % packingUnit == 0){
            numberOfBoxes = pieces / packingUnit;
        }else{
            numberOfBoxes = pieces / packingUnit + 1;
        }
        BigDecimal box = weightOfBox.multiply(new BigDecimal(String.valueOf(numberOfBoxes)));
        return  super.totalWeight(pieces).add(box).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }
}
