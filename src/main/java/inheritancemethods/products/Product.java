package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private String name;
    private BigDecimal unitWeigth;
    private int numberOfDecimals;



    public Product(String name, BigDecimal unitWeigth){
    this.name = name;
    this.unitWeigth = unitWeigth;
    }

    public Product(String name, BigDecimal unitWeigth, int numberOfDecimals){
        this(name, unitWeigth);
        this.numberOfDecimals = numberOfDecimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitWeigth() {
        return unitWeigth;
    }

    public void setUnitWeigth(BigDecimal unitWeigth) {
        this.unitWeigth = unitWeigth;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public void setNumberOfDecimals(int numberOfDecimals) {
        this.numberOfDecimals = numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        return unitWeigth.multiply(new BigDecimal(String.valueOf(pieces))).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    }

    public BigDecimal getUnitWeight() {
        return unitWeigth;
    }
}
