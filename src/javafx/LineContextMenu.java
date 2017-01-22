package javafx;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.util.HashMap;

/**
 * Created by Laiserg on 22.01.2017.
 */
public class LineContextMenu extends ContextMenu {

    public HashMap<String, MenuItem> menuItems = new HashMap<>();

    public LineContextMenu() {
        super();
        initMenuItems();
    }

    public void initMenuItems() {
        MenuItem fixFull = new MenuItem("Fix line");
        MenuItem fixAxis = new MenuItem("Fix axis");
        MenuItem fixLength = new MenuItem("Fix length");
        MenuItem fixAngle = new MenuItem("Fix angle");
        menuItems.put("fixFull", fixFull);
        menuItems.put("fixAxis", fixAxis);
        menuItems.put("fixLength", fixLength);
        menuItems.put("fixAngle", fixAngle);
        this.getItems().addAll(fixFull, fixAngle, fixAxis, fixLength);
    }

}
