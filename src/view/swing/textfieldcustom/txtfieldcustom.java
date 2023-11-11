
package view.swing.textfieldcustom;

import javax.swing.JTextField;

public class txtfieldcustom extends JTextField {
    private textfieldUI textUI;
    
    public txtfieldcustom (){
        textUI = new textfieldUI(this);
        setUI(textUI);
    }
    
    public void setRound(int round) {
        textUI.setRound(round);
    }

    public int getRound() {
        return textUI.getRound();
    }
    public static void main(String[] args) {
        
    }
}
