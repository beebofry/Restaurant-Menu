package restaurant;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
        private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDate.now();
    }

    private LocalDate lastUpdated;


        public void addMenuItem(MenuItem item) {
            this.menuItems.add(item);
        }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}


