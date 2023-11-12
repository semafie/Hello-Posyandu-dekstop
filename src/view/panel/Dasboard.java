
package view.panel;

import javax.swing.SwingUtilities;
import main.main;
import view.dialog.validasiberhasil;

public class Dasboard extends javax.swing.JPanel {

    public Dasboard() {
        initComponents();
//        main main =(main)SwingUtilities.getWindowAncestor(this);
//        validasiberhasil aa = new validasiberhasil(main,"Anda Berhasil Login");
//            aa.showPopUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_form = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Form Beranda.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_form)
                .addContainerGap(697, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(698, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txt_form;
    // End of variables declaration//GEN-END:variables
}
