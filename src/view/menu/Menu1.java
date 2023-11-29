package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import view.swing.ScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Menu1 extends JPanel {

    private int index = -1;
    private final List<EventMenuSelected> events = new ArrayList<>();

    public Menu1() {
        init();
    }

    private void init() {
//        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        JScrollPane scroll = createScroll();
        panelMenu = createPanelMenu();
        scroll.setViewportView(panelMenu);
//        scroll.setBackground(Color.GRAY);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);
        addTitle("All Menu");
        Icon icon = new ImageIcon("/view/image/iconibu.png");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Beranda"));
//        addTitle("WEB APPS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PREGNANT_WOMAN, "Data Ibu Hamil"));
//        addTitle("COMPONENT");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.CHILD_FRIENDLY, "Data Bayi"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ACCESSIBILITY, "Pelayanan","Penimbangan", "Imunisasi", "Pemeriksaan Ibu Hamil"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DESCRIPTION, "Laporan", "Registrasi", "Pelayanan"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PIE_CHART_OUTLINED, "Charts", "Apex", "Flot", "Peity", "Sparkline"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.VIEW_LIST, "Table", "Basic Tables", "Data Table"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.INSERT_EMOTICON, "Icons", "Feather Icons", "Flag Icons", "Mdi Icons"));
////        addTitle("PAGES");
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.INBOX, "Special Pages", "Blank page", "Faq", "Invoice", "Profile", "Pricing", "Timeline"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.LOCK_OUTLINE, "Authentication", "Login", "Register"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ERROR_OUTLINE, "Error", "404", "500"));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(206, 222, 235); // Hijau
        Color color2 = new Color(101, 172, 229); // Biru

        // Membuat gradien vertical
        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, height, color2);

        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, width, height);
    }

    private JScrollPane createScroll() {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        ScrollBar apa = new ScrollBar();
        apa.setForeground(Color.GRAY);
        scroll.setVerticalScrollBar(apa);
        return scroll;
    }

    private JPanel createPanelMenu() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fill,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
    }

    private JPanel createMenuItem(ModelMenuItem item) {
        MenuItem menuItem = new MenuItem(item, ++index, menuLayout);
        Font menuFont = new Font("Arial", Font.PLAIN, 36); // Ganti dengan ukuran font yang diinginkan
    menuItem.setFont(menuFont);
//    menuItem.setIconSize(new Dimension(30, 30));
        menuItem.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelected();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent(int index, int indexSubMenu) {
        for (EventMenuSelected event : events) {
            event.menuSelected(index, indexSubMenu);
        }
    }

    //  Public Method
    public void addMenuItem(ModelMenuItem menu) {
        panelMenu.add(createMenuItem(menu), "h 32!");
    }

    public void addTitle(String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        label.setForeground(new Color(170, 170, 170));
        panelMenu.add(label);
    }

    public void addSpace(int size) {
        panelMenu.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex(int index, int indexSubMenu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getIndex() == index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    break;
                }
            }
        }
    }

    public void clearSelected() {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                item.clearSelected();
            }
        }
    }

    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }

    private MigLayout menuLayout;
    private JPanel panelMenu;
    public static void main(String[] args) {
        
    }
}
