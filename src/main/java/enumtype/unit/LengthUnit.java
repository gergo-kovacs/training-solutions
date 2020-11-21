package enumtype.unit;

public enum LengthUnit {

        METER(1000, true), CENTIMETER(100, true), MILLIMETER(1, true),
        YARD(9144, false), FOOT(3048, false), INCH(254, false);

        private final int mm;
        private final boolean si;

    LengthUnit(int mm, boolean si) {
        this.mm = mm;
        this.si = si;
    }

    public int getMm() {
        return mm;
    }

    public boolean isSi() {
        return si;
    }
}


