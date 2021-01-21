package week12d02;

public class Site {
    private int even;
    private int length;
    private Fence fence;

    public Site(int even, int length, Fence fence) {
        this.even = even;
        this.length = length;
        this.fence = fence;
    }

    public int getSide() {
        return even;
    }

    public int getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }


}
