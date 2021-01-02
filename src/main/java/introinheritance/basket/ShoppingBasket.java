package introinheritance.basket;

public class ShoppingBasket {
    private Basket basket = new Basket();

    public void addItem(Item item){
    basket.addItem(item);
    }

    public void removeItem(String barcode){
        basket.removeItem(barcode);
    }

    public double sumNettoPrice(){
        double resultSum = 0.0;
        for (int i = 0; i < basket.getItems().size(); i++) {
        resultSum += basket.getItems().get(i).getNettoPrice();
        }
        return resultSum;
    }

    public double sumTaxValue(){
        double resultSum = 0.0;
        for (int i = 0; i < basket.getItems().size(); i++) {
            resultSum += basket.getItems().get(i).getTaxAmount();
        }
        return resultSum;
    }
    public double sumBruttoPrice(){
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout(){
        basket.clearBasket();
    }
    public void removeMostExpensiveItem(){
        double price = basket.getItems().get(0).getNettoPrice();
        for (int i = 0; i < basket.getItems().size(); i++) {
            if(basket.getItems().get(i).getNettoPrice() > price){
                price = basket.getItems().get(i).getNettoPrice();
            }
        }
        for (Item i: basket.getItems()) {
            if(i.getNettoPrice()==price){
                basket.removeItem(i.getBarcode());
            }
        }

    }
}
