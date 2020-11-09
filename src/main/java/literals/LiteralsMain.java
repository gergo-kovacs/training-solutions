package literals;

public class LiteralsMain {
    public static void main(String[] args) {

        System.out.println(""+1+2);
        System.out.println("1"+"2");
        System.out.println("12");
        System.out.println(1+""+2);
        System.out.println(Integer.toString(1)+Integer.toString(2));

        double quotion = 3/4;
        System.out.println(quotion);
        quotion = 3.0/4.0;
        System.out.println(quotion);
        quotion = (double) 3/4;
        System.out.println(quotion);
        quotion = 3/4d;
        System.out.println(quotion);


        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);


        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));

        System.out.println(Integer.toBinaryString(-2));
    }
}
