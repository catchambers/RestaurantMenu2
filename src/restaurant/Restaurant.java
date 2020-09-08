package restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem cheeseBurger =
                new MenuItem("Cheese Burger",5.99, "Regular Cheeseburger", "Main Course");

        MenuItem funnelCake =
                new MenuItem("Funnel Cake", 3.99, "A delicious funnel cake", "Dessert");

        Menu menuItems = new Menu();

        menuItems.addItem(cheeseBurger);
        menuItems.addItem(funnelCake);
        System.out.println(menuItems);
        System.out.println(funnelCake);

        menuItems.removeItem(cheeseBurger);
        System.out.println(menuItems);
    }

}