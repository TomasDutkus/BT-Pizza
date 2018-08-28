package lt.baltictalents.pizzeria;

public class PizzeriaMain {
    public static void main(String[] args) {

        MenuItem[] menu = new MenuItem[11];

        for (int i = 0; i < menu.length; i++) {
            menu[i] = new MenuItem();
        }

        menu[0].name = "Beer";
        menu[0].price = 2.50;

        menu[1].name = "Water still";
        menu[1].price = 0.75;

        menu[2].name = "Water sparkling";
        menu[2].price = 1.00;

        menu[3].name = "Soft drink";
        menu[3].price = 1.50;

        menu[4].name = "Tea with sugar";
        menu[4].price = 1.50;

        menu[5].name = "Tea with honey";
        menu[5].price = 1.75;

        menu[6].name = "Coffee with sugar";
        menu[6].price = 1.50;

        menu[7].name = "Coffee with milk";
        menu[7].price = 1.75;

        menu[8].name = "Pizza";
        menu[8].price = 6.00;

        menu[9].name = "Wrap";
        menu[9].price = 2.00;

        menu[10].name = "Tortilla";
        menu[10].price = 3.00;

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].name + " - " + menu[i].price);
        }
    }
}
