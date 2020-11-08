package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        Introcontrol control = new Introcontrol();
        System.out.println(control.substractTenIfGreaterThanTen(10));
        System.out.println(control.describeNumber(0));
        System.out.println(control.greetingToJoe("Joe"));
        System.out.println(control.calculateBonus(54646));
        System.out.println(control.calculateConsumption(4000,10005));
        control.printNumbers(30);
        control.printNumbersBetween(5,40);
        control.printNumbersBetweenAnyDirection(20,10);
        control.printOddNumbers(13);

    }
}
