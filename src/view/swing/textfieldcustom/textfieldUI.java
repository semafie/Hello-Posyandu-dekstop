
package view.swing.textfieldcustom;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalTextFieldUI;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class textfieldUI extends MetalTextFieldUI  {
    
    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        border.setRound(round);
        textfield.repaint();
        
    }
    public textfieldUI (JTextField textfield){
        this.textfield = textfield;
        border = new Border(20);
        border.setRound(round);
        textfield.setBorder(border);
//        textfield.setBackground(Color.WHITE);
        textfield.setSelectedTextColor(Color.WHITE);
        textfield.setSelectionColor(new Color(54, 189, 248));
        textfield.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                border.setColor(new Color(255,96,177));
                textfield.repaint();
            }

            @Override
            public void focusLost(FocusEvent fe) {
                border.setColor(new Color(206, 212, 218));
                textfield.repaint();
            }
        });
        AutoCompleteDecorator.decorate(textfield, items, false);
    }
    
     private JTextField textfield;
    private Border border;
    private int round = 15;
    private List<String> items = new ArrayList<>();
    
    
    private class Border extends EmptyBorder {

        public int getRound() {
            return round;
        }

        public void setRound(int round) {
            this.round = round;
        }

        public Color getFocusColor() {
            return focusColor;
        }

        public void setFocusColor(Color focusColor) {
            this.focusColor = focusColor;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        private Color focusColor = new Color(255,96,177);
        private Color color = new Color(206, 212, 218);
        private int round;

        public Border(int border) {
            super(border, border, border, border);
        }

        public Border() {
            this(10);
        }
//        public Border(int round, int border) {
//        super(border, border, border, border);
//        this.round = round;
//     }
//
//        public Border(int round) {
//        this(round, 20); // Ubah nilai ketebalan border di sini
//        }

        @Override
        public void paintBorder(Component cmpnt, Graphics grphcs, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (cmpnt.isFocusOwner()) {
                g2.setColor(focusColor);
            } else {
                g2.setColor(color);
            }
           float borderThickness = 2.0f; // Ubah nilai ketebalan border di sini
        g2.setStroke(new BasicStroke(borderThickness));
            
            g2.drawRoundRect(x, y, width - 1, height - 1, round, round);
            g2.dispose();
        }
    }
    
}
