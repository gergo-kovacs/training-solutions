package enumtype.unit;

import java.math.BigDecimal;

public class UnitConverterMain {

    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(10), LengthUnit.METER, LengthUnit.CENTIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(100), LengthUnit.METER, LengthUnit.CENTIMETER));
    }
}
