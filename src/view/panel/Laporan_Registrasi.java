
package view.panel;
import java.awt.Color;
public class Laporan_Registrasi extends javax.swing.JPanel {

    public Laporan_Registrasi() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        dataibuhamil = new javax.swing.JLabel();
        databayi = new javax.swing.JLabel();
        databayi1 = new javax.swing.JLabel();
        dataibuhamil1 = new javax.swing.JLabel();
        pilih = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        bgsearch = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();
        btnsimpancetak = new javax.swing.JLabel();
        txt_form = new javax.swing.JLabel();
        panelShadow25 = new view.swing.panelcustom.PanelShadow();
        jScrollPane25 = new javax.swing.JScrollPane();
        table25 = new view.swing.Table();

        setBackground(new java.awt.Color(246, 246, 233));

        jPanel3.setBackground(new Color(0,0,0,0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataibuhamil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih ibu hamil.png"))); // NOI18N
        dataibuhamil.setRequestFocusEnabled(false);
        jPanel3.add(dataibuhamil, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 8, -1, -1));

        databayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih data bayi.png"))); // NOI18N
        jPanel3.add(databayi, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 8, -1, -1));
        jPanel3.add(databayi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        dataibuhamil1.setRequestFocusEnabled(false);
        jPanel3.add(dataibuhamil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 20));

        pilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bg pindah.png"))); // NOI18N
        jPanel3.add(pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 46));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setBackground(new Color(0,0,0,0)
        );
        txt_search.setBorder(null);
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 230, 30));

        bgsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bgsearch.png"))); // NOI18N
        jPanel1.add(bgsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 284, 57));

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png"))); // NOI18N
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btneditMousePressed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png"))); // NOI18N
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnhapusMousePressed(evt);
            }
        });

        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png"))); // NOI18N
        btnsimpancetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpancetakMousePressed(evt);
            }
        });

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Laporan Data Ibu Hamil.png"))); // NOI18N

        panelShadow25.setBackground(new java.awt.Color(234, 245, 255));

        jScrollPane25.setBorder(null);

        table25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane25.setViewportView(table25);

        javax.swing.GroupLayout panelShadow25Layout = new javax.swing.GroupLayout(panelShadow25);
        panelShadow25.setLayout(panelShadow25Layout);
        panelShadow25Layout.setHorizontalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsimpancetak))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_form)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(btnsimpancetak)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpancetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMousePressed
        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak3.png")));
    }//GEN-LAST:event_btnsimpancetakMousePressed

    private void btnsimpancetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseExited
        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png")));
    }//GEN-LAST:event_btnsimpancetakMouseExited

    private void btnsimpancetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseEntered
        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak2.png")));
    }//GEN-LAST:event_btnsimpancetakMouseEntered

    private void btnsimpancetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpancetakMouseClicked

    private void btnhapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMousePressed
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus3.png")));
    }//GEN-LAST:event_btnhapusMousePressed

    private void btnhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseExited
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png")));
    }//GEN-LAST:event_btnhapusMouseExited

    private void btnhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseEntered
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus2.png")));
    }//GEN-LAST:event_btnhapusMouseEntered

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btneditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMousePressed
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit3.png")));
    }//GEN-LAST:event_btneditMousePressed

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png")));
    }//GEN-LAST:event_btneditMouseExited

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit2.png")));
    }//GEN-LAST:event_btneditMouseEntered

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgsearch;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btnsimpancetak;
    private javax.swing.JLabel databayi;
    private javax.swing.JLabel databayi1;
    private javax.swing.JLabel dataibuhamil;
    private javax.swing.JLabel dataibuhamil1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane25;
    private view.swing.panelcustom.PanelShadow panelShadow25;
    private javax.swing.JLabel pilih;
    private view.swing.Table table25;
    private javax.swing.JLabel txt_form;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
