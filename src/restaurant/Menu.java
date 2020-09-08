package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfDishes;
    private Date lastUpdated;

    public Menu() {
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date(); //right now
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void addItem(MenuItem itemName) {
        if (!listOfDishes.contains(itemName)) {
            listOfDishes.add(itemName);
            this.lastUpdated = new Date();
        } else {
            System.out.println("This item is already on the menu!");
        }
    }

    public void removeItem(MenuItem itemName) {
        listOfDishes.remove(itemName);
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "listOfDishes=" + listOfDishes +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
