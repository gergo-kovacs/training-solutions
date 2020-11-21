package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target) {
        return length.multiply(new BigDecimal(source.getMm()))
                .divide(new BigDecimal(target.getMm()), 4, RoundingMode.HALF_UP);
    }

    public List<LengthUnit> siUnits() {
        List<LengthUnit> units = new ArrayList<>();
        for (LengthUnit unit: LengthUnit.values()) {
            if (unit.isSi()) {
                units.add(unit);
            }
        }
        return units;
    }

}
