package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {

        Client user1 = new Client();
        user1.setAddress("Tokod Fő utca 1.");
        user1.setName("Nagy István");
        user1.setYear(100);

        user1.writeData();
        user1.migrate("Tokodaltáró");
        user1.writeData();

    }
}