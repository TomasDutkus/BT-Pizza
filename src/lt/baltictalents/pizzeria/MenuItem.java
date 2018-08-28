package lt.baltictalents.pizzeria;

public class MenuItem {

    String name;
    double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {

        String temp;
        temp = name + " - " + price;
        return temp;

    }
}
