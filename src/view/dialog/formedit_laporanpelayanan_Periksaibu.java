/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import javax.swing.JFrame;
import java.awt.Color;
/**
 *
 * @author Be Mine
 */
public class formedit_laporanpelayanan_Periksaibu extends Dialog {

    /**
     * Creates new form formedit_laporanpelayanan_Periksaibu
     */
    private int id;
    
    public formedit_laporanpelayanan_Periksaibu(JFrame fram) {
        super(fram);
        initComponents();
        jPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnbatal = new javax.swing.JLabel();
        btnpilih = new javax.swing.JLabel();
        input_TEMPATLAHIR = new javax.swing.JTextField();
        input_tanggallahir = new javax.swing.JTextField();
        input_tanggaltimbang = new javax.swing.JTextField();
        input_bb = new javax.swing.JTextField();
        input_tb = new javax.swing.JTextField();
        input_deteksi = new javax.swing.JTextField();
        input_keterangan = new javax.swing.JTextField();
        input_namaibu = new javax.swing.JTextField();
        input_idbayi = new javax.swing.JTextField();
        btcaribayi = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        search = new javax.swing.JTextField();
        bg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(null);

        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png"))); // NOI18N
        btnbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbatalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbatalMousePressed(evt);
            }
        });
        jPanel1.add(btnbatal);
        btnbatal.setBounds(580, 630, 190, 60);

        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih1.png"))); // NOI18N
        btnpilih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpilihMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpilihMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpilihMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnpilihMousePressed(evt);
            }
        });
        jPanel1.add(btnpilih);
        btnpilih.setBounds(820, 630, 190, 60);

        input_TEMPATLAHIR.setBackground(new Color(0,0,0,0));
        input_TEMPATLAHIR.setBorder(null);
        jPanel1.add(input_TEMPATLAHIR);
        input_TEMPATLAHIR.setBounds(70, 220, 420, 40);

        input_tanggallahir.setBackground(new Color(0,0,0,0));
        input_tanggallahir.setBorder(null);
        jPanel1.add(input_tanggallahir);
        input_tanggallahir.setBounds(60, 310, 420, 30);

        input_tanggaltimbang.setBackground(new Color(0,0,0,0));
        input_tanggaltimbang.setBorder(null);
        jPanel1.add(input_tanggaltimbang);
        input_tanggaltimbang.setBounds(60, 390, 210, 30);

        input_bb.setBackground(new Color(0,0,0,0));
        input_bb.setBorder(null);
        jPanel1.add(input_bb);
        input_bb.setBounds(70, 470, 50, 40);

        input_tb.setBackground(new Color(0,0,0,0));
        input_tb.setBorder(null);
        jPanel1.add(input_tb);
        input_tb.setBounds(190, 470, 40, 40);

        input_deteksi.setBackground(new Color(0,0,0,0));
        input_deteksi.setBorder(null);
        jPanel1.add(input_deteksi);
        input_deteksi.setBounds(320, 470, 200, 40);

        input_keterangan.setBackground(new Color(0,0,0,0));
        input_keterangan.setBorder(null);
        jPanel1.add(input_keterangan);
        input_keterangan.setBounds(60, 560, 420, 30);

        input_namaibu.setBackground(new Color(0,0,0,0));
        input_namaibu.setBorder(null);
        jPanel1.add(input_namaibu);
        input_namaibu.setBounds(590, 220, 420, 40);

        input_idbayi.setBackground(new Color(0,0,0,0));
        input_idbayi.setBorder(null);
        jPanel1.add(input_idbayi);
        input_idbayi.setBounds(70, 140, 310, 30);

        btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_caribayi1.png"))); // NOI18N
        btcaribayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcaribayiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btcaribayiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btcaribayiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btcaribayiMousePressed(evt);
            }
        });
        jPanel1.add(btcaribayi);
        btcaribayi.setBounds(390, 140, 100, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(590, 140, 430, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/laporanpelayanan_penimbangan.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1080, 710);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 0, 1090, 710);

        jPanel2.setBackground(new Color(0,0,0,0));
        jPanel2.setLayout(null);

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 1160, 370);

        search.setBackground(new Color(0,0,0,0));
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(950, 30, 230, 30);

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/formcari_bayi.png"))); // NOI18N
        jPanel2.add(bg1);
        bg1.setBounds(6, 0, 1218, 557);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1230, 560);

        setSize(new java.awt.Dimension(1245, 717));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    jPanel2.setVisible(false);
    jPanel1.setVisible(true);
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal2.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal3.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void btnpilihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMouseClicked
        if(id != 0 ){
            closeMessage();
        }else {
            System.out.println("pilih sulu bro");
        }
    }//GEN-LAST:event_btnpilihMouseClicked

    private void btnpilihMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMouseEntered

        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih2.png")));
    }//GEN-LAST:event_btnpilihMouseEntered

    private void btnpilihMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMouseExited
        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih1.png")));
    }//GEN-LAST:event_btnpilihMouseExited

    private void btnpilihMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMousePressed
        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih3.png")));
    }//GEN-LAST:event_btnpilihMousePressed

    private void btcaribayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseClicked
      jPanel2.setVisible(true);
      jPanel1.setVisible(false);
    }//GEN-LAST:event_btcaribayiMouseClicked

    private void btcaribayiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseEntered
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_caribayi2.png")));
    }//GEN-LAST:event_btcaribayiMouseEntered

    private void btcaribayiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseExited
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_caribayi1.png")));
    }//GEN-LAST:event_btcaribayiMouseExited

    private void btcaribayiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMousePressed
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_caribayi3.png")));
    }//GEN-LAST:event_btcaribayiMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
        System.out.println(id);
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_tableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
//        load_tabel(search.getText());
    }//GEN-LAST:event_searchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel btcaribayi;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnpilih;
    private javax.swing.JTextField input_TEMPATLAHIR;
    private javax.swing.JTextField input_bb;
    private javax.swing.JTextField input_deteksi;
    private javax.swing.JTextField input_idbayi;
    private javax.swing.JTextField input_keterangan;
    private javax.swing.JTextField input_namaibu;
    private javax.swing.JTextField input_tanggallahir;
    private javax.swing.JTextField input_tanggaltimbang;
    private javax.swing.JTextField input_tb;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private view.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
