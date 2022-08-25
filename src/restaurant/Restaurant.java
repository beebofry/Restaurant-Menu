package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem corndog = new MenuItem ("pizza", 2.99, "delicious", "entree");
        MenuItem taco = new MenuItem ("taco", 1.99, "also delicious", "app");

        Menu menu = new Menu();
        menu.addMenuItem(corndog);
        menu.addMenuItem(taco);

        for(MenuItem item : menu.getMenuItems()){
            System.out.println(item.getName());
        }

        menu.setLastUpdated();
        System.out.println(menu.getLastUpdated()); //prints null.... need arg?

    }
}
