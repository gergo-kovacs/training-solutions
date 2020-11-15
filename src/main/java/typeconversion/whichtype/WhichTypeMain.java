package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {
        WhichType whichType = new WhichType();

        System.out.println(whichType.whichType("1312")); //[SHORT, INT]
        System.out.println(whichType.whichType("13")); //[BYTE, SHORT, INT]
        System.out.println(whichType.whichType("132345")); //[INT]

    }
}
