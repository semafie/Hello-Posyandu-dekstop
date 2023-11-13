
package view.panel;

import Repository.bayiRepository;
import entity.bayi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import main.main;
import view.notif.Notification;

public class Data_Bayi extends javax.swing.JPanel {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    bayiRepository bayi = new bayiRepository();
    public Data_Bayi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date1 = new view.customdate.DateChooser();
        txt_form = new javax.swing.JLabel();
        input_namabayi = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input_tempatlahir = new view.swing.textfieldcustom.txtfieldcustom();
        input_tanggallahir = new view.swing.textfieldcustom.txtfieldcustom();
        input_namaibu = new view.swing.textfieldcustom.txtfieldcustom();
        jButton2 = new javax.swing.JButton();
        btnsimpan = new javax.swing.JLabel();
        btnreset = new javax.swing.JLabel();
        cmb_jeniskelamin = new javax.swing.JComboBox<>();

        date1.setTextRefernce(input_tanggallahir);

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Data Bayi.png"))); // NOI18N

        input_namabayi.setBackground(new java.awt.Color(246, 246, 233));
        input_namabayi.setRound(40);
        input_namabayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namabayiActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/databayi_Nama Bayi.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/ibuhamil_Tanggal Lahir.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/ibuhamil_Tempat Lahir.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/databayi_Jenis Kelamin.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/databayi_Nama Ibu.png"))); // NOI18N

        input_tempatlahir.setBackground(new java.awt.Color(246, 246, 233));
        input_tempatlahir.setRound(40);
        input_tempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tempatlahirActionPerformed(evt);
            }
        });

        input_tanggallahir.setBackground(new java.awt.Color(246, 246, 233));
        input_tanggallahir.setRound(40);
        input_tanggallahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tanggallahirActionPerformed(evt);
            }
        });

        input_namaibu.setBackground(new java.awt.Color(246, 246, 233));
        input_namaibu.setRound(40);
        input_namaibu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaibuActionPerformed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan1.png"))); // NOI18N
        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpanMousePressed(evt);
            }
        });

        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset1.png"))); // NOI18N
        btnreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnresetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnresetMousePressed(evt);
            }
        });

        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnreset)
                .addGap(26, 26, 26)
                .addComponent(btnsimpan)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input_tanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(605, 605, 605))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmb_jeniskelamin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_namaibu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(input_tempatlahir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_namabayi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_form, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(604, 604, 604))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_namabayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_tanggallahir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_jeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_namaibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsimpan)
                    .addComponent(btnreset))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void input_namabayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namabayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namabayiActionPerformed

    private void input_tempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tempatlahirActionPerformed

    private void input_tanggallahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tanggallahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tanggallahirActionPerformed

    private void btnresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseClicked
    input_namaibu.setText("");
    
    input_namabayi.setText("");
    
    input_tempatlahir.setText("");
    
    
    }//GEN-LAST:event_btnresetMouseClicked

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
    if(!input_namabayi.getText().equals("") || !input_namaibu.getText().equals("")|| 
            !input_tempatlahir.getText().equals("") ){
        try {
            Object ambilah = cmb_jeniskelamin.getSelectedItem();
            Date formattanggal = sdf.parse(input_tanggallahir.getText());
            bayi apa =  new bayi(input_namabayi.getText(),input_tempatlahir.getText(),formattanggal,ambilah.toString(),input_namaibu.getText());
            bayi.add(apa);
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Ditambahakan");
            panel.showNotification();
            input_namaibu.setText("");
    input_namabayi.setText("");
    input_tempatlahir.setText("");
    cmb_jeniskelamin.setSelectedIndex(0);
        } catch (ParseException ex) {
            Logger.getLogger(Data_Bayi.class.getName()).log(Level.SEVERE, null, ex);
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
        }
        
    } else {
        main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Tidak Boleh Kosong");
            panel.showNotification();
    }
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void btnresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseEntered
    btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset2.png")));
    }//GEN-LAST:event_btnresetMouseEntered

    private void btnresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseExited
    btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset1.png")));
    }//GEN-LAST:event_btnresetMouseExited

    private void btnresetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMousePressed
    btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset3.png")));
    }//GEN-LAST:event_btnresetMousePressed

    private void btnsimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseEntered
    btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan2.png")));
    }//GEN-LAST:event_btnsimpanMouseEntered

    private void btnsimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseExited
    btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan1.png")));
    }//GEN-LAST:event_btnsimpanMouseExited

    private void btnsimpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMousePressed
    btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan3.png")));
    }//GEN-LAST:event_btnsimpanMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    date1.showPopup();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void input_namaibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaibuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaibuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnreset;
    private javax.swing.JLabel btnsimpan;
    private javax.swing.JComboBox<String> cmb_jeniskelamin;
    private view.customdate.DateChooser date1;
    private view.swing.textfieldcustom.txtfieldcustom input_namabayi;
    private view.swing.textfieldcustom.txtfieldcustom input_namaibu;
    private view.swing.textfieldcustom.txtfieldcustom input_tanggallahir;
    private view.swing.textfieldcustom.txtfieldcustom input_tempatlahir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txt_form;
    // End of variables declaration//GEN-END:variables
}
