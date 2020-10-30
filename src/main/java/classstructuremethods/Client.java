package classstructuremethods;

public class Client {
    private String name;
    private int year;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*költözés*/
    public void migrate(String address){
        this.address = address;
    }

    /*adatok kiiratás*/
    public void writeData(){
        System.out.println("Ügyfél neve: "+getName()+"\n"+"Ügyfél címe: "+getAddress()+"\n"+"Ügyfél kora: "+getYear()+"\n");
    }
}
