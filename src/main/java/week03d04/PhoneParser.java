package week03d04;

public class PhoneParser {

    Phone phone;

    Phone parsePhone(String s){
        //30-1234567
        String prefix = s.substring(0,2);
        String number = s.substring(3);
        phone = new Phone(prefix,number);
        return phone;
    }


    public static void main(String[] args) {
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parsePhone("30-1234567");
        System.out.println(phone);
    }

}