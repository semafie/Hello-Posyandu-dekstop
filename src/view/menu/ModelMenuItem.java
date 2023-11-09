package view.menu;

import javaswingdev.GoogleMaterialDesignIcon;
import javax.swing.Icon;

public class ModelMenuItem {

    public GoogleMaterialDesignIcon getIcon() {
        return icon;
    }

    public void setIcon(GoogleMaterialDesignIcon icon) {
        this.icon = icon;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String[] getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String[] subMenu) {
        this.subMenu = subMenu;
    }

    public ModelMenuItem(GoogleMaterialDesignIcon icon, String menuName, String... subMenu) {
        this.icon = icon;
        this.menuName = menuName;
        this.subMenu = subMenu;
    }
    
    public ModelMenuItem(Icon icon, String menuName, String... subMenu) {
        this.icon1 = icon;
        this.menuName = menuName;
        this.subMenu = subMenu;
    }

    public ModelMenuItem() {
    }

    private GoogleMaterialDesignIcon icon;
    private Icon icon1;
    private String menuName;
    private String subMenu[];
}
