package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent){
        this.price+=(getPrice()*percent)/100;
    }

    public int comparePricePerCapacity(Pendrive pendrive){
        if(((double) getPrice()/(double) getCapacity())>((double) pendrive.getPrice()/(double) pendrive.getCapacity())){
            return 1;
        }else if(((double) getPrice()/(double) getCapacity())<((double) pendrive.getPrice()/(double) pendrive.getCapacity())) {
            return -1;
        }else{
            return 0;
        }
    }

    public boolean cheaperThan(Pendrive pendrive){
        return getPrice()<pendrive.getPrice();
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
