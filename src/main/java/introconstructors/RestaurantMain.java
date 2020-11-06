package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Vadász",10);
        System.out.println(restaurant.capacity);
        System.out.println(restaurant.menu);

    }
}
