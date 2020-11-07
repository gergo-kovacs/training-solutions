package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person people1 = new Person("Tom",19);
        Person people2 = new Person("Tim",40);

        people1 = new Person("David",30);
        people2 = people1;
        people2.setName("Amanda");
        System.out.println(people1.hashCode());
        System.out.println(people2.hashCode());
        System.out.println("people1: "+people1.getName());
        System.out.println("people2: "+people2.getName());

        int number1 = 24;
        int number2 = number1;

        number2 = number2+1;

        System.out.println(number1+" "+number2);

        Person people3 = people2;

        System.out.println("people2: "+people2.getName());
        System.out.println("people3: "+people3.getName());


    }
}
