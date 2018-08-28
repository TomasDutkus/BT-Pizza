package lt.baltictalents.pizzeria;

public class PizzeriaMain {

    private static MenuItem[] menu = new MenuItem[11];

    public static void main(String[] args) {

        initializeData();

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }

    private static void initializeData() {

        menu[0] = new MenuItem("Beer", 2.50);
        menu[1] = new MenuItem("Water still", 0.75);
        menu[2] = new MenuItem("Water sparkling", 1.00);
        menu[3] = new MenuItem("Soft drink", 1.50);
        menu[4] = new MenuItem("Tea with sugar", 1.50);
        menu[5] = new MenuItem("Tea with honey", 1.75);
        menu[6] = new MenuItem("Coffee with sugar", 1.50);
        menu[7] = new MenuItem("Coffee with milk", 1.75);
        menu[8] = new MenuItem("Pizza", 6.00);
        menu[9] = new MenuItem("Wrap", 2.00);
        menu[10] = new MenuItem("Tortilla", 3.00);

    }
}
