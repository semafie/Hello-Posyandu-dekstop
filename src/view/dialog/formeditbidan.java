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
public class formeditbidan extends Dialog {
    
    private int id = Data_Bidan.id;
    bidanRepository bidan = new bidanRepository();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public formeditbidan(JFrame fram) {
        super(fram);
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 20);
        input_nama.setFont(font);
        input_alamat.setFont(font);
        input_notelp.setFont(font);
        input_pendidikanterakhir.setFont(font);
        input_tanggallahir.setFont(font);
        input_tempatlahir.setFont(font);
        
        String ambiltanggal = sdf.format(bidan.get(id).getTanggal_lahir());
        input_nama.setText(bidan.get(id).getNama());
        input_alamat.setText(bidan.get(id).getAlamat());
        input_notelp.setText(bidan.get(id).getNo_hp());
        input_pendidikanterakhir.setText(bidan.get(id).getPendidikan_terakhir());
        input_tanggallahir.setText(ambiltanggal);
        input_tempatlahir.setText(bidan.get(id).getTempat_lahir());
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
        btnbatal = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        input_tempatlahir = new javax.swing.JTextField();
        input_tanggallahir = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        input_pendidikanterakhir = new javax.swing.JTextField();
        input_alamat = new javax.swing.JTextField();
        input_notelp = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        date1.setNextFocusableComponent(input_tanggallahir);

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
        input_nama.setBounds(40, 160, 350, 50);

        input_tempatlahir.setBackground(new Color(0,0,0,0));
        input_tempatlahir.setBorder(null);
        getContentPane().add(input_tempatlahir);
        input_tempatlahir.setBounds(40, 260, 350, 50);

        input_tanggallahir.setBackground(new Color(0,0,0,0));
        input_tanggallahir.setBorder(null);
        getContentPane().add(input_tanggallahir);
        input_tanggallahir.setBounds(40, 370, 330, 40);

        jButton1.setText("...");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 370, 40, 40);

        input_pendidikanterakhir.setBackground(new Color(0,0,0,0));
        input_pendidikanterakhir.setBorder(null);
        getContentPane().add(input_pendidikanterakhir);
        input_pendidikanterakhir.setBounds(490, 160, 350, 50);

        input_alamat.setBackground(new Color(0,0,0,0));
        input_alamat.setBorder(null);
        getContentPane().add(input_alamat);
        input_alamat.setBounds(490, 260, 350, 50);

        input_notelp.setBackground(new Color(0,0,0,0));
        input_notelp.setBorder(null);
        getContentPane().add(input_notelp);
        input_notelp.setBounds(490, 370, 350, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/formeditbidan.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 910, 560);

        setSize(new java.awt.Dimension(926, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    closeMessage();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        if(!input_nama.getText().equals("") || !input_alamat.getText().equals("") || !input_notelp.getText().equals("") ||
                !input_tempatlahir.getText().equals("")|| !input_tanggallahir.getText().equals("")|| !input_pendidikanterakhir.getText().equals("")){
        
        try {
            Date ambilformat = sdf.parse(input_tanggallahir.getText());
            bidan apa = new bidan(input_nama.getText(), input_tempatlahir.getText(),ambilformat,
            input_pendidikanterakhir.getText(),input_alamat.getText(),input_notelp.getText());
            bidan.update(apa);
            Data_Bidan tabel = new Data_Bidan();
                tabel.load_tabel();
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Di Edit");
            panel.showNotification();
            closeMessage();
        } catch (Exception e) {
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Di Edit");
            panel.showNotification();
        }
}else{
        main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Tidak Boleh Kosong");
            panel.showNotification();}
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
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnedit;
    private view.customdate.DateChooser date1;
    private javax.swing.JTextField input_alamat;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_notelp;
    private javax.swing.JTextField input_pendidikanterakhir;
    private javax.swing.JTextField input_tanggallahir;
    private javax.swing.JTextField input_tempatlahir;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
