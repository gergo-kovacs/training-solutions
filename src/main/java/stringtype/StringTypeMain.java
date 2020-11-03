package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message= prefix+name;
        System.out.println(message);
        message = message+444;
        System.out.println(message);
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(b+" "+c);

        String empty1 = "";
        String empty2 = "";
        System.out.println((empty1+empty2).length());

        String Abcde = "Abcde";
        System.out.println(Abcde.length());
        System.out.println(Abcde.substring(0,1)+","+Abcde.substring(2,3));
        System.out.println(Abcde.substring(0,3));


    }
}
