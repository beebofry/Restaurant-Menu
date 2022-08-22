package restaurant;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();

        MenuItem item1 = new MenuItem("Tacos", 3.99, "delicious", "appetizer");
        menu.add(item1);

        System.out.println(item1.getName() + ": " +item1.getPrice());
    }
}


