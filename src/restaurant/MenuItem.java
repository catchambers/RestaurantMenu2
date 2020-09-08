package restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public boolean getIsNew() {
        return isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

//    public boolean equals(Object compareItem) {
//        if(compareItem.getClass() != getClass()) {
//            return false;
//        }
//
//        if(compareItem == null) {
//            return false;
//        }
//
//        if(compareItem == this) {
//            return true;
//        }
//
//        MenuItem theItem = (MenuItem) compareItem;
//        return theItem.name.equals(this.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, category);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }
}