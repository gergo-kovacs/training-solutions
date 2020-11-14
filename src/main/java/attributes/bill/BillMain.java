package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
    Bill bill = new Bill();
    bill.addItem(new Item("asztal",1,4.5));
    bill.addItem(new Item("szék",3,2.5));
    bill.addItem(new Item("lámpa",2,1.5));

    bill.calculateTotalPrice();
        for (int i = 0;  i < bill.getItems().size() ; i++) {
            System.out.println(bill.getItems().get(i).getProduct());
        }

    }
}
