import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private String menuType;
    private ArrayList<MenuItem> menuItems;

    public Menu(String menuType) {
        this.menuType = menuType;
    }

    public Menu(String menuType, ArrayList<MenuItem> menuItems) {
        this.menuType = menuType;
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getMenuType() {
        return menuType;
    }

    protected boolean setMenuType(String menuType) {
        this.menuType = menuType;
        return true;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

//    public MenuItem getMenuItemByName(String name) {
//        //should search menuItems and return the one with that name
//
//    }

    public MenuItem getMenuItemByName(int index) {
       return menuItems.get(index);

   }

    protected boolean addMenuItem(MenuItem newMenuItem) {
        //adding a menu item if there isn't already one by that name
        this.menuItems.add(newMenuItem);
        return true;
        //return false;
    }

    protected boolean removeMenuItem(String name) {
        //removes a menu item bearing this name
        return true;
        //return false;
    }
}
