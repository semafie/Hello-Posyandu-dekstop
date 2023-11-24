/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;
import Repository.bidanRepository;
import entity.bidan;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import main.main;
import view.notif.Notification;
import view.panel.Data_Bidan;

/**
 *
 * @author RESCOM-1
 */
public class formedit_laporanpelayanan_imunisasi extends Dialog {
    Data_Bidan apa = new Data_Bidan();
    private int id = apa.id;
    bidanRepository bidan = new bidanRepository();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public formedit_laporanpelayanan_imunisasi(JFrame fram) {
        super(fram);
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 20);
        input_tgl.setFont(font);
        input_idbayi.setFont(font);
//        input_notelp.setFont(font);
        input_tgllahir.setFont(font);
        input_namaibu.setFont(font);
        input_tempatlahir.setFont(font);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date1 = new view.customdate.DateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnbatal1 = new javax.swing.JLabel();
        btnpilih = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        search = new javax.swing.JTextField();
        bg1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JLabel();
        btnbatal = new javax.swing.JLabel();
        input_keterangan = new javax.swing.JTextField();
        input_jenisvitamin = new javax.swing.JTextField();
        input_jenisimunisasi = new javax.swing.JTextField();
        input_usia = new javax.swing.JTextField();
        input_tgl = new javax.swing.JTextField();
        input_tempatlahir = new javax.swing.JTextField();
        input_namaibu = new javax.swing.JTextField();
        input_tgllahir = new javax.swing.JTextField();
        btcaribayi = new javax.swing.JLabel();
        input_idbayi = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        btnbatal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png"))); // NOI18N
        btnbatal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatal1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbatal1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbatal1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbatal1MousePressed(evt);
            }
        });
        jPanel2.add(btnbatal1);
        btnbatal1.setBounds(800, 480, 190, 60);

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
        jPanel2.add(btnpilih);
        btnpilih.setBounds(1010, 480, 190, 60);

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
        jPanel2.setBounds(0, 70, 1230, 560);

        jPanel1.setLayout(null);

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit1.png"))); // NOI18N
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editMousePressed(evt);
            }
        });
        jPanel1.add(btn_edit);
        btn_edit.setBounds(810, 640, 190, 50);

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
        btnbatal.setBounds(580, 640, 190, 60);

        input_keterangan.setBackground(new Color(0,0,0,0));
        input_keterangan.setBorder(null);
        jPanel1.add(input_keterangan);
        input_keterangan.setBounds(330, 570, 350, 30);

        input_jenisvitamin.setBackground(new Color(0,0,0,0));
        input_jenisvitamin.setBorder(null);
        jPanel1.add(input_jenisvitamin);
        input_jenisvitamin.setBounds(40, 570, 240, 30);

        input_jenisimunisasi.setBackground(new Color(0,0,0,0));
        input_jenisimunisasi.setBorder(null);
        jPanel1.add(input_jenisimunisasi);
        input_jenisimunisasi.setBounds(190, 480, 480, 40);

        input_usia.setBackground(new Color(0,0,0,0));
        input_usia.setBorder(null);
        jPanel1.add(input_usia);
        input_usia.setBounds(30, 480, 70, 40);

        input_tgl.setBackground(new Color(0,0,0,0));
        input_tgl.setBorder(null);
        jPanel1.add(input_tgl);
        input_tgl.setBounds(40, 400, 200, 40);

        input_tempatlahir.setBackground(new Color(0,0,0,0));
        input_tempatlahir.setBorder(null);
        jPanel1.add(input_tempatlahir);
        input_tempatlahir.setBounds(40, 240, 370, 30);

        input_namaibu.setBackground(new Color(0,0,0,0));
        input_namaibu.setBorder(null);
        jPanel1.add(input_namaibu);
        input_namaibu.setBounds(570, 150, 370, 40);

        input_tgllahir.setBackground(new Color(0,0,0,0));
        input_tgllahir.setBorder(null);
        jPanel1.add(input_tgllahir);
        input_tgllahir.setBounds(40, 320, 410, 30);

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
        btcaribayi.setBounds(370, 150, 100, 40);

        input_idbayi.setBackground(new Color(0,0,0,0));
        input_idbayi.setBorder(null);
        jPanel1.add(input_idbayi);
        input_idbayi.setBounds(40, 150, 320, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/laporanpelayanan_imunisasi.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1040, 710);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 0, 1050, 710);

        setSize(new java.awt.Dimension(1245, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    closeMessage();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btcaribayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseClicked
//        if(!input_nama.getText().equals("") || !input_jk.getText().equals("") || !input_notelp.getText().equals("") ||
//                !input_tempatlahir.getText().equals("")|| !input_namaibu.getText().equals("")|| !input_tgllahir.getText().equals("")){
//        
//        try {
//            Date ambilformat = sdf.parse(input_namaibu.getText());
//            bidan apa = new bidan(input_nama.getText(), input_tempatlahir.getText(),ambilformat,
//            input_tgllahir.getText(),input_jk.getText(),input_notelp.getText());
//            bidan.update(apa);
//            Data_Bidan tabel = new Data_Bidan();
//                tabel.load_tabel();
//            main main =(main)SwingUtilities.getWindowAncestor(this);
//            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Di Edit");
//            panel.showNotification();
//            closeMessage();
//        } catch (Exception e) {
//            main main =(main)SwingUtilities.getWindowAncestor(this);
//            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Di Edit");
//            panel.showNotification();
//        }
//}else{
//        main main =(main)SwingUtilities.getWindowAncestor(this);
//            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Tidak Boleh Kosong");
//            panel.showNotification();}
    }//GEN-LAST:event_btcaribayiMouseClicked

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal2.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal3.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void btcaribayiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseEntered
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit2.png")));
    }//GEN-LAST:event_btcaribayiMouseEntered

    private void btcaribayiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseExited
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit1.png")));
    }//GEN-LAST:event_btcaribayiMouseExited

    private void btcaribayiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMousePressed
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit3.png")));
    }//GEN-LAST:event_btcaribayiMousePressed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editMouseEntered

    private void btn_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editMouseExited

    private void btn_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editMousePressed

    private void btnbatal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatal1MouseClicked
        closeMessage();
    }//GEN-LAST:event_btnbatal1MouseClicked

    private void btnbatal1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatal1MouseEntered
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal2.png")));
    }//GEN-LAST:event_btnbatal1MouseEntered

    private void btnbatal1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatal1MouseExited
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png")));
    }//GEN-LAST:event_btnbatal1MouseExited

    private void btnbatal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatal1MousePressed
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal3.png")));
    }//GEN-LAST:event_btnbatal1MousePressed

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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
        System.out.println(id);
    }//GEN-LAST:event_tableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        load_tabel(search.getText());
    }//GEN-LAST:event_searchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel btcaribayi;
    private javax.swing.JLabel btn_edit;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnbatal1;
    private javax.swing.JLabel btnpilih;
    private view.customdate.DateChooser date1;
    private javax.swing.JTextField input_idbayi;
    private javax.swing.JTextField input_jenisimunisasi;
    private javax.swing.JTextField input_jenisvitamin;
    private javax.swing.JTextField input_keterangan;
    private javax.swing.JTextField input_namaibu;
    private javax.swing.JTextField input_tempatlahir;
    private javax.swing.JTextField input_tgl;
    private javax.swing.JTextField input_tgllahir;
    private javax.swing.JTextField input_usia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private view.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
