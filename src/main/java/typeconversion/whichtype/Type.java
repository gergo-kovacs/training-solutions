package typeconversion.whichtype;

public enum Type {
    BYTE(Byte.MIN_VALUE,Byte.MAX_VALUE), SHORT(Short.MIN_VALUE,Short.MAX_VALUE), INT(Integer.MIN_VALUE, Integer.MAX_VALUE);

    private final int minValue;
    private final int maxValue;

    Type(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}


