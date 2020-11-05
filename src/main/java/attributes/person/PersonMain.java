package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Person agent = new Person("Tom","sf2424");
        Address address = new Address("UK","London","A407","WC2N 5DU");
        agent.moveTo(address);
        System.out.println(agent.personToString());
        agent.correctData("Tomas","sf242446");
        System.out.println(agent.personToString());
        System.out.println(agent.getAddress().streetAndNumber);

    }
}
