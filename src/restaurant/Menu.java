package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfdishes;
    private Date lastUpdated;

    public Menu() {
        this.listOfdishes = new ArrayList<>();
        this.lastUpdated = new Date(); //right now
    }
}
