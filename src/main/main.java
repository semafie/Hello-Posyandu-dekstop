 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import view.dialog.validasiberhasil;
import view.dialog.validasiberhasil1;
import view.menu.EventMenuSelected;
import view.panel.Dasboard;
import view.panel.Data_Bayi;
import view.panel.Data_Bidan;
import view.panel.Data_Kader;
import view.panel.Data_Ibuhamil;
import view.panel.Laporan_Pelayanan;
import view.panel.Laporan_Registrasi;

import view.panel.Pelayanan_Imunisasi;
import view.panel.Pelayanan_penimbangan;
import view.panel.Pelayanan_periksa_ibuhamil;

/**
 *
 * @author semafie
 */
public class main extends javax.swing.JFrame {
    private static main main;
    
    public main() {
        initComponents();
        
        getContentPane().setBackground(new Color(246,246,233));
        Font font = new Font("Quicksand", Font.PLAIN, 18);
        titleBar.initJFram(this);
        setLocationRelativeTo(this);
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
        tanggal.setFont(font);
        jam.setFont(font);
        init();
        validasiberhasil1 aa = new validasiberhasil1(this,"Anda Berhasil Login");
            aa.showPopUp();
    }
    private void updateTime() {
        // Mendapatkan waktu saat ini
        Date now = new Date();

        // Format tanggal dan jam
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        // Mengatur nilai label sesuai dengan waktu saat ini
        tanggal.setText(dateFormat.format(now));
        jam.setText("|   "+timeFormat.format(now));
    }
    private void init() {
        main = this;
        
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new Dasboard());
                }else if (index == 1 && indexSubMenu == 0) {
                    showForm(new Data_Bidan());
                }else if (index == 2 && indexSubMenu == 0) {
                    showForm(new Data_Kader());
                }else if (index == 3 && indexSubMenu == 0) {
                    showForm(new Data_Ibuhamil());
                }else if (index == 4 && indexSubMenu == 0) {
                    showForm(new Data_Bayi());
                }else if (index == 5 && indexSubMenu == 1) {
                    showForm(new Pelayanan_penimbangan());
                }else if (index == 5 && indexSubMenu == 2) {
                    showForm(new Pelayanan_Imunisasi ());
                }else if (index == 5 && indexSubMenu == 3) {
                    showForm(new Pelayanan_periksa_ibuhamil());
                }else if (index == 6 && indexSubMenu == 1) {
                    showForm(new Laporan_Registrasi());
                }else  {
                    showForm(new Laporan_Pelayanan());
                }
            }
        });
        menu.setSelectedIndex(0, 0);
    }
    
    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    
    public static main getMain() {
        return main;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneltitle = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        menu = new view.menu.Menu();
        body = new javax.swing.JPanel();
        tanggal = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        titleBar = new view.swing.TitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 246, 233));
        setUndecorated(true);

        paneltitle.setBackground(new java.awt.Color(101, 172, 229));

        jPanel1.setBackground(new java.awt.Color(206, 222, 235));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/title.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paneltitleLayout = new javax.swing.GroupLayout(paneltitle);
        paneltitle.setLayout(paneltitleLayout);
        paneltitleLayout.setHorizontalGroup(
            paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneltitleLayout.setVerticalGroup(
            paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltitleLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );

        body.setBackground(new java.awt.Color(246, 246, 233));
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paneltitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 629, Short.MAX_VALUE)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1210, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jam;
    private view.menu.Menu menu;
    private javax.swing.JPanel paneltitle;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel title;
    private view.swing.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables
}
