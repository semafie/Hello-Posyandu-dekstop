/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;
import Repository.bayiRepository;
import Repository.bidanRepository;
import Repository.ibu_hamilRepository;
import Repository.pemeriksaan_ibuhamilRepository;
import entity.bayi;
import entity.bidan;
import entity.ibu_hamil;
import entity.pemeriksaan_ibuhamil;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.main;
import view.notif.Notification;
import view.panel.Data_User;
import view.panel.Laporan_Pelayanan;

/**
 *
 * @author RESCOM-1
 */
public class formedit_laporanpelayanan_ibuhamil extends Dialog {
    private int ids;
    private int id = Laporan_Pelayanan.id;
    ibu_hamilRepository ibuhh = new ibu_hamilRepository();
    pemeriksaan_ibuhamilRepository pibu= new pemeriksaan_ibuhamilRepository();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public formedit_laporanpelayanan_ibuhamil(JFrame fram) {
        super(fram);
        initComponents();
        jPanel2.setVisible(false);
        Font font = new Font("Quicksand", Font.PLAIN, 20);
//        input_tgl.setFont(font);
//        input_idbayi.setFont(font);
////        input_notelp.setFont(font);
//        input_tgllahir.setFont(font);
//        input_namaibu.setFont(font);
//        input_tempatlahir.setFont(font);
        load_tabel();
        input_BB.setText(String.valueOf(pibu.get(id).getBb()));
        input_Deteksi.setText(pibu.get(id).getDeteksi());
        input_Hamilke.setText(String.valueOf(pibu.get(id).getHamil_ke()));
        input_Keterangan.setText(pibu.get(id).getKeterangan());
        input_RiwayatPenyakit.setText(pibu.get(id).getRiwayat_penyakit());
        input_TB.setText(String.valueOf(pibu.get(id).getTb()));
        input_Tanggallahir.setText(sdf.format(pibu.get(id).getId_ibuhamil().getTanggal_lahir()));
        input_idibu.setText(String.valueOf(pibu.get(id).getId_ibuhamil().getId()));
        input_namaibu.setText(pibu.get(id).getId_ibuhamil().getNama());
        input_usiaKandungan.setText(String.valueOf(pibu.get(id).getUsia_kandungan()));
        input_tanggalperiksa.setText(sdf.format(pibu.get(id).getTanggal_periksa()));
        
    }
    public void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Tempat Lahir Ibu");
        model.addColumn("Tanggal Lahir Ibu");
        model.addColumn("Gol Darah");
        model.addColumn("Alamat");
        model.addColumn("N0 hp");
        model.addColumn("Nama Suami");
        model.addColumn("Tempat Lahir Suami");
        model.addColumn("Tanggal Lahir Suami");
        try {
            for(ibu_hamil apa:ibuhh.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNama(),
                    apa.getTempat_lahir(),
                    apa.getTanggal_lahir(),
                    apa.getGol_darah(),
                    apa.getAlamat(),
                    apa.getNo_hp(),
                    apa.getNama_suami(),
                    apa.getTempat_lahir_suami(),
                    apa.getTanggal_lahir_suami()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        jPanel1 = new javax.swing.JPanel();
        btnbatal = new javax.swing.JLabel();
        btcaribayi = new javax.swing.JLabel();
        input_usiaKandungan = new javax.swing.JTextField();
        input_idibu = new javax.swing.JTextField();
        input_Hamilke = new javax.swing.JTextField();
        input_RiwayatPenyakit = new javax.swing.JTextField();
        input_BB = new javax.swing.JTextField();
        input_TB = new javax.swing.JTextField();
        input_Deteksi = new javax.swing.JTextField();
        input_Keterangan = new javax.swing.JTextField();
        input_Tempatlahir = new javax.swing.JTextField();
        input_Tanggallahir = new javax.swing.JTextField();
        input_namaibu = new javax.swing.JTextField();
        btn_edit = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        input_tanggalperiksa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        jPanel3 = new javax.swing.JPanel();
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

        btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_cariibuhamil1.png"))); // NOI18N
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
        btcaribayi.setBounds(380, 150, 130, 40);

        input_usiaKandungan.setBackground(new Color(0,0,0,0));
        input_usiaKandungan.setBorder(null);
        jPanel1.add(input_usiaKandungan);
        input_usiaKandungan.setBounds(70, 320, 100, 30);

        input_idibu.setBackground(new Color(0,0,0,0));
        input_idibu.setBorder(null);
        input_idibu.setFocusable(false);
        jPanel1.add(input_idibu);
        input_idibu.setBounds(70, 150, 300, 40);

        input_Hamilke.setBackground(new Color(0,0,0,0));
        input_Hamilke.setBorder(null);
        jPanel1.add(input_Hamilke);
        input_Hamilke.setBounds(300, 320, 200, 30);

        input_RiwayatPenyakit.setBackground(new Color(0,0,0,0));
        input_RiwayatPenyakit.setBorder(null);
        jPanel1.add(input_RiwayatPenyakit);
        input_RiwayatPenyakit.setBounds(70, 400, 430, 30);

        input_BB.setBackground(new Color(0,0,0,0));
        input_BB.setBorder(null);
        jPanel1.add(input_BB);
        input_BB.setBounds(70, 470, 50, 40);

        input_TB.setBackground(new Color(0,0,0,0));
        input_TB.setBorder(null);
        jPanel1.add(input_TB);
        input_TB.setBounds(180, 480, 60, 30);

        input_Deteksi.setBackground(new Color(0,0,0,0));
        input_Deteksi.setBorder(null);
        jPanel1.add(input_Deteksi);
        input_Deteksi.setBounds(320, 480, 180, 30);

        input_Keterangan.setBackground(new Color(0,0,0,0));
        input_Keterangan.setBorder(null);
        jPanel1.add(input_Keterangan);
        input_Keterangan.setBounds(70, 560, 430, 30);

        input_Tempatlahir.setBackground(new Color(0,0,0,0));
        input_Tempatlahir.setBorder(null);
        input_Tempatlahir.setFocusable(false);
        jPanel1.add(input_Tempatlahir);
        input_Tempatlahir.setBounds(600, 150, 430, 40);

        input_Tanggallahir.setBackground(new Color(0,0,0,0));
        input_Tanggallahir.setBorder(null);
        input_Tanggallahir.setFocusable(false);
        jPanel1.add(input_Tanggallahir);
        input_Tanggallahir.setBounds(600, 230, 430, 40);

        input_namaibu.setBackground(new Color(0,0,0,0));
        input_namaibu.setBorder(null);
        input_namaibu.setFocusable(false);
        jPanel1.add(input_namaibu);
        input_namaibu.setBounds(70, 230, 430, 40);

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
        btn_edit.setBounds(810, 630, 190, 60);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/laporanpelayanan_ibuhamil (3).png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1080, 710);

        input_tanggalperiksa.setText("jTextField1");
        jPanel1.add(input_tanggalperiksa);
        input_tanggalperiksa.setBounds(590, 310, 73, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 0, 1100, 710);

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
        jPanel2.add(jPanel3);
        jPanel3.setBounds(870, 20, 340, 60);

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

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/formcari_ibuhamil.png"))); // NOI18N
        jPanel2.add(bg1);
        bg1.setBounds(6, 0, 1218, 557);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 140, 1240, 560);

        setSize(new java.awt.Dimension(1277, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
    closeMessage();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btcaribayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
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
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_cariibuhamil2.png")));
    }//GEN-LAST:event_btcaribayiMouseEntered

    private void btcaribayiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMouseExited
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_cariibuhamil1.png")));
    }//GEN-LAST:event_btcaribayiMouseExited

    private void btcaribayiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcaribayiMousePressed
    btcaribayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btn_cariibuhamil3.png")));
    }//GEN-LAST:event_btcaribayiMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        ids = Integer.valueOf(idd);
        System.out.println(ids);
        input_idibu.setText(String.valueOf(ibuhh.get(ids).getId()));
        input_namaibu.setText(ibuhh.get(ids).getNama());
        input_Tempatlahir.setText(ibuhh.get(ids).getTempat_lahir());
        try {
        input_Tanggallahir.setText(sdf.format(ibuhh.get(ids).getTanggal_lahir()));
            
        } catch (Exception e) {
        }
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_tableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
//        load_tabel(search.getText());
    }//GEN-LAST:event_searchKeyReleased

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        ibu_hamil idbayi = new ibu_hamil(Integer.valueOf(input_idibu.getText()));
        try {
            pemeriksaan_ibuhamil apa = new pemeriksaan_ibuhamil(id, idbayi, sdf.parse(input_tanggalperiksa.getText()),
                    Integer.valueOf(input_usiaKandungan.getText()), Integer.valueOf(input_Hamilke.getText()),
                    input_RiwayatPenyakit.getText(), Integer.valueOf(input_BB.getText()),Integer.valueOf(input_TB.getText()),
                    input_Deteksi.getText(), input_Keterangan.getName());
            boolean cobak = pibu.update(apa);
            if(cobak) {
                main main =(main)SwingUtilities.getWindowAncestor(this);
                Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "Data Berhasil Ditambahakan");
                panel.showNotification();
                closeMessage();
            }else {
                main main =(main)SwingUtilities.getWindowAncestor(this);
                Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Data Gagal Ditambahakan");
                panel.showNotification();
            }
        } catch (Exception e) {
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Data Gagal Ditambahakan");
            panel.showNotification();
        }

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseEntered
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit2.png")));
    }//GEN-LAST:event_btn_editMouseEntered

    private void btn_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseExited
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit1.png")));
    }//GEN-LAST:event_btn_editMouseExited

    private void btn_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMousePressed
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformedit3.png")));
    }//GEN-LAST:event_btn_editMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel btcaribayi;
    private javax.swing.JLabel btn_edit;
    private javax.swing.JLabel btnbatal;
    private view.customdate.DateChooser date1;
    private javax.swing.JTextField input_BB;
    private javax.swing.JTextField input_Deteksi;
    private javax.swing.JTextField input_Hamilke;
    private javax.swing.JTextField input_Keterangan;
    private javax.swing.JTextField input_RiwayatPenyakit;
    private javax.swing.JTextField input_TB;
    private javax.swing.JTextField input_Tanggallahir;
    private javax.swing.JTextField input_Tempatlahir;
    private javax.swing.JTextField input_idibu;
    private javax.swing.JTextField input_namaibu;
    private javax.swing.JTextField input_tanggalperiksa;
    private javax.swing.JTextField input_usiaKandungan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private view.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
