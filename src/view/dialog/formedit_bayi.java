/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;
import Repository.bayiRepository;
import Repository.bidanRepository;
import entity.bayi;
import entity.bidan;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import main.main;
import view.notif.Notification;
import view.panel.Data_Bayi;
import view.panel.Data_User;
import view.panel.Laporan_Registrasi;

/**
 *
 * @author RESCOM-1
 */
public class formedit_bayi extends Dialog {
    private int id = Laporan_Registrasi.id;
    bayiRepository bayi = new bayiRepository();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public formedit_bayi(JFrame fram) {
        super(fram);
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 20);
        input_nama.setFont(font);
        input_tgllahir.setFont(font);
        input_namaibu.setFont(font);
        input_tempatlahir.setFont(font);
        
        if(bayi.get(id).getJenis_kelamin().equals("Laki - Laki")){
        cmb_jeniskelamin.setSelectedIndex(0);    
        } else {
        cmb_jeniskelamin.setSelectedIndex(1);    
        }
        input_nama.setText(bayi.get(id).getNama());
        input_tgllahir.setText(sdf.format(bayi.get(id).getTanggal_lahir()));
        input_namaibu.setText(bayi.get(id).getNama_ibu());
        input_tempatlahir.setText(bayi.get(id).getTempat_lahir());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date1 = new view.customdate.DateChooser();
        btnbatal = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        input_tempatlahir = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        input_namaibu = new javax.swing.JTextField();
        cmb_jeniskelamin = new javax.swing.JComboBox<>();
        input_tgllahir = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();

        date1.setTextRefernce(input_tgllahir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

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
        getContentPane().add(btnbatal);
        btnbatal.setBounds(470, 490, 190, 60);

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit1.png"))); // NOI18N
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
        getContentPane().add(btnedit);
        btnedit.setBounds(690, 490, 190, 60);

        input_nama.setBackground(new Color(0,0,0,0));
        input_nama.setBorder(null);
        getContentPane().add(input_nama);
        input_nama.setBounds(45, 165, 360, 40);

        input_tempatlahir.setBackground(new Color(0,0,0,0));
        input_tempatlahir.setBorder(null);
        getContentPane().add(input_tempatlahir);
        input_tempatlahir.setBounds(40, 263, 370, 40);

        jButton1.setText("...");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(810, 165, 40, 40);

        input_namaibu.setBackground(new Color(0,0,0,0));
        input_namaibu.setBorder(null);
        getContentPane().add(input_namaibu);
        input_namaibu.setBounds(270, 380, 370, 40);

        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        getContentPane().add(cmb_jeniskelamin);
        cmb_jeniskelamin.setBounds(500, 270, 360, 40);

        input_tgllahir.setBackground(new Color(0,0,0,0));
        input_tgllahir.setBorder(null);
        getContentPane().add(input_tgllahir);
        input_tgllahir.setBounds(490, 165, 320, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/formedit_bayi.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 910, 560);

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/formedit_bayi.png"))); // NOI18N
        getContentPane().add(bg1);
        bg1.setBounds(0, 0, 910, 560);

        setSize(new java.awt.Dimension(926, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    closeMessage();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        try {
            Object ambilah = cmb_jeniskelamin.getSelectedItem();
            Date formattanggal = sdf.parse(input_tgllahir.getText());
            bayi apa =  new bayi(id,input_nama.getText(),input_tempatlahir.getText(),
                    formattanggal,ambilah.toString(),input_namaibu.getText());
            boolean cobak = bayi.update(apa);
            if(cobak){
                main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Ditambahakan");
            panel.showNotification();
            closeMessage();
            }else {
                main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(Data_Bayi.class.getName()).log(Level.SEVERE, null, ex);
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
        }
    
    }//GEN-LAST:event_btneditMouseClicked

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal2.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
    btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal3.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
    btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit2.png")));
    }//GEN-LAST:event_btneditMouseEntered

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
    btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit1.png")));
    }//GEN-LAST:event_btneditMouseExited

    private void btneditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMousePressed
    btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit3.png")));
    }//GEN-LAST:event_btneditMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        date1.showPopup();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnedit;
    private javax.swing.JComboBox<String> cmb_jeniskelamin;
    private view.customdate.DateChooser date1;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_namaibu;
    private javax.swing.JTextField input_tempatlahir;
    private javax.swing.JTextField input_tgllahir;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
