/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

import Repository.bayiRepository;
import Repository.penimbanganRepository;
import entity.bayi;
import entity.penimbangan;
import java.awt.Font;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import main.main;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import util.Conn;
import view.dialog.formcari_bayi;
import view.dialog.formcari_ibuhamil;
import view.notif.Notification;

/**
 *
 * @author RESCOM-1
 */
public class Pelayanan_penimbangan extends javax.swing.JPanel {
 main main =(main)SwingUtilities.getWindowAncestor(this);
    formcari_bayi apaa = new formcari_bayi(main);
    private int id = apaa.id;
    bayiRepository bayi = new bayiRepository();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    penimbanganRepository pinimm = new penimbanganRepository();
    
    public Pelayanan_penimbangan() {
        initComponents();
        Date hariini = new Date();
        input_tanggalhariini.setText(sdf.format(hariini));
        Font font = new Font("Quicksand", Font.PLAIN, 20);
        input_id_bayi.setFont(font);
        input_keterangan.setFont(font);
        input_tanggallahir.setFont(font);
        input_tempatlahir.setFont(font);
        input_tanggalhariini.setFont(font);
        input_BB.setFont(font);
        input_TB.setFont(font);
        input_Deteksi.setFont(font);
        input_namaibu.setFont(font);
        cmb_jeniskelamin.setFont(font);
        cmbbox();
    }
    
    public void cmbbox(){

        try {
            for(bayi apa : bayi.get()){
                cmb_pilih.addItem(apa.getNama());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date1 = new view.customdate.DateChooser();
        txt_form = new javax.swing.JLabel();
        input_id_bayi = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        input_tempatlahir = new view.swing.textfieldcustom.txtfieldcustom();
        input_tanggallahir = new view.swing.textfieldcustom.txtfieldcustom();
        input_tanggalhariini = new view.swing.textfieldcustom.txtfieldcustom();
        input_BB = new view.swing.textfieldcustom.txtfieldcustom();
        input_Deteksi = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnsimpan = new javax.swing.JLabel();
        btnreset = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        input_TB = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        input_keterangan = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel13 = new javax.swing.JLabel();
        input_namaibu = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel8 = new javax.swing.JLabel();
        cmb_jeniskelamin = new javax.swing.JComboBox<>();
        cmb_pilih = new javax.swing.JComboBox<>();

        date1.setTextRefernce(input_tanggallahir);

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Pelayanan Penimbangan.png"))); // NOI18N

        input_id_bayi.setBackground(new java.awt.Color(246, 246, 233));
        input_id_bayi.setFocusable(false);
        input_id_bayi.setRound(40);
        input_id_bayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_id_bayiActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_ID Bayi.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/ibuhamil_Tanggal Lahir.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/ibuhamil_Tempat Lahir.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanpenimbangan_Tanggal Timbang.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanpenimbangan_BB.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanpenimbangan_Deteksi.png"))); // NOI18N

        input_tempatlahir.setBackground(new java.awt.Color(246, 246, 233));
        input_tempatlahir.setFocusable(false);
        input_tempatlahir.setRound(40);
        input_tempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tempatlahirActionPerformed(evt);
            }
        });

        input_tanggallahir.setBackground(new java.awt.Color(246, 246, 233));
        input_tanggallahir.setFocusable(false);
        input_tanggallahir.setRound(40);
        input_tanggallahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tanggallahirActionPerformed(evt);
            }
        });

        input_tanggalhariini.setBackground(new java.awt.Color(246, 246, 233));
        input_tanggalhariini.setFocusable(false);
        input_tanggalhariini.setRound(40);
        input_tanggalhariini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tanggalhariiniActionPerformed(evt);
            }
        });

        input_BB.setBackground(new java.awt.Color(246, 246, 233));
        input_BB.setRound(40);
        input_BB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_BBActionPerformed(evt);
            }
        });

        input_Deteksi.setBackground(new java.awt.Color(246, 246, 233));
        input_Deteksi.setRound(40);
        input_Deteksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_DeteksiActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanpenimbangan_Jenis Kelamin Bayi.png"))); // NOI18N

        jButton2.setText("...");
        jButton2.setBorder(null);
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

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Kg");

        input_TB.setBackground(new java.awt.Color(246, 246, 233));
        input_TB.setRound(40);
        input_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_TBActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanpenimbangan_TB.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Keterangan.png"))); // NOI18N

        input_keterangan.setBackground(new java.awt.Color(246, 246, 233));
        input_keterangan.setRound(40);
        input_keterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_keteranganActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Cm");

        input_namaibu.setBackground(new java.awt.Color(246, 246, 233));
        input_namaibu.setFocusable(false);
        input_namaibu.setRound(40);
        input_namaibu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaibuActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Nama Ibu.png"))); // NOI18N

        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- pilih dulu--", "Laki -Laki", "Perempuan" }));
        cmb_jeniskelamin.setBorder(null);
        cmb_jeniskelamin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_jeniskelamin.setFocusTraversalPolicyProvider(true);

        cmb_pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih dulu--" }));
        cmb_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pilihActionPerformed(evt);
            }
        });

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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input_tanggalhariini, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_keterangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(input_BB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(input_TB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(input_Deteksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(282, 282, 282))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_tanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_form))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(input_id_bayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(input_tempatlahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_namaibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_jeniskelamin, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))))
                                .addGap(64, 64, 64))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_pilih)
                    .addComponent(input_id_bayi, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(cmb_jeniskelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_tempatlahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_namaibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_tanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(input_tanggalhariini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_Deteksi, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_BB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(input_TB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsimpan)
                    .addComponent(btnreset))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void input_id_bayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_id_bayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_id_bayiActionPerformed

    private void input_tempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tempatlahirActionPerformed

    private void input_tanggallahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tanggallahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tanggallahirActionPerformed

    private void input_tanggalhariiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tanggalhariiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tanggalhariiniActionPerformed

    private void input_BBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_BBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_BBActionPerformed

    private void input_DeteksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_DeteksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_DeteksiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        date1.showPopup();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        if(!input_BB.getText().equals("") || !input_Deteksi.getText().equals("") || !input_TB.getText().equals("")||
                !input_id_bayi.getText().equals("") || !input_keterangan.getText().equals("")|| !input_namaibu.getText().equals("")||
                !input_tempatlahir.getText().equals("")){
        try {
            Date hari = new Date();
        bayi bayiii = new bayi(Integer.valueOf(input_id_bayi.getText()));
            penimbangan kirim = new penimbangan(bayiii,hari,Integer.valueOf(input_BB.getText()),Integer.valueOf(input_TB.getText()),
            input_Deteksi.getText(),input_keterangan.getText());
            boolean cobak = pinimm.add(kirim);
            if (cobak){
                int idfinalrekap = pinimm.getlastid().getId();
            InputStream struk = getClass().getResourceAsStream("/jasper_report/report_pelayanan_penimbangan.jrxml");
            String query = "SELECT * FROM penimbangan JOIN bayi ON penimbangan.id_bayi = bayi.id where penimbangan.id = " + idfinalrekap;
//        String path = "E:/SEMUA FOLDER/imam/kuliah/semester 3/joki/SIsiloam/SIsiloam/SISILOAM/src/jasper_report/no_antrian.jrxml";

        try {
               Connection koneksi = (Connection) Conn.configDB();
            Statement pstCek = koneksi.createStatement();
            ResultSet res = pstCek.executeQuery(query);
            JasperDesign design = JRXmlLoader.load(struk);
            JasperReport jr = JasperCompileManager.compileReport(design);
            JRResultSetDataSource rsDataSource = new JRResultSetDataSource(res);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);

            JasperViewer viewer = new JasperViewer(jp, false); // argumen 'false' mencegah aplikasi keluar
            viewer.setVisible(true);
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Ditambahakan");
            panel.showNotification();
            input_id_bayi.setText("");
        input_keterangan.setText("");
        input_tanggallahir.setText("");
        input_tempatlahir.setText("");
        
        input_BB.setText("");
        input_TB.setText("");
        input_Deteksi.setText("");
        input_namaibu.setText("");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
                main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Ditambahakan");
            panel.showNotification();
            } else {
                main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
            }
            
        } catch (Exception e) {
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
        }} else {
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Tidak Boleh Kosong");
            panel.showNotification();
        }
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void btnsimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseEntered
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan2.png")));
    }//GEN-LAST:event_btnsimpanMouseEntered

    private void btnsimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseExited
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan1.png")));
    }//GEN-LAST:event_btnsimpanMouseExited

    private void btnsimpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMousePressed
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan3.png")));
    }//GEN-LAST:event_btnsimpanMousePressed

    private void btnresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseClicked
        input_BB.setText("");
        
        input_Deteksi.setText("");
        input_TB.setText("");
        input_keterangan.setText("");
        input_id_bayi.setText("");
        input_namaibu.setText("");
        input_Deteksi.setText("");
        input_tempatlahir.setText("");

    }//GEN-LAST:event_btnresetMouseClicked

    private void btnresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseEntered
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset2.png")));
    }//GEN-LAST:event_btnresetMouseEntered

    private void btnresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseExited
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset1.png")));
    }//GEN-LAST:event_btnresetMouseExited

    private void btnresetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMousePressed
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset3.png")));
    }//GEN-LAST:event_btnresetMousePressed

    private void input_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_TBActionPerformed

    private void input_keteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_keteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_keteranganActionPerformed

    private void input_namaibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaibuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaibuActionPerformed

    private void cmb_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pilihActionPerformed
    Object cmb_pilih1 = cmb_pilih.getSelectedItem();
        input_id_bayi.setText(String.valueOf(bayi.getidbynama(cmb_pilih1.toString()).getId()));
        input_namaibu.setText(bayi.getidbynama(cmb_pilih1.toString()).getNama_ibu());
        if (cmb_pilih1.toString().equals("--pilih dulu--")){
            cmb_jeniskelamin.setSelectedIndex(0);
        } else if(bayi.getidbynama(cmb_pilih1.toString()).getJenis_kelamin().equals("Laki - Laki")){
            cmb_jeniskelamin.setSelectedIndex(1);
        } else if(bayi.getidbynama(cmb_pilih1.toString()).getJenis_kelamin().equals("Perempuan")){
            cmb_jeniskelamin.setSelectedIndex(2);
        }
        
        input_tempatlahir.setText(bayi.getidbynama(cmb_pilih1.toString()).getTempat_lahir());
        input_tanggallahir.setText(String.valueOf(bayi.getidbynama(cmb_pilih1.toString()).getTanggal_lahir()));
    }//GEN-LAST:event_cmb_pilihActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnreset;
    private javax.swing.JLabel btnsimpan;
    private javax.swing.JComboBox<String> cmb_jeniskelamin;
    private javax.swing.JComboBox<String> cmb_pilih;
    private view.customdate.DateChooser date1;
    private view.swing.textfieldcustom.txtfieldcustom input_BB;
    private view.swing.textfieldcustom.txtfieldcustom input_Deteksi;
    private view.swing.textfieldcustom.txtfieldcustom input_TB;
    public static view.swing.textfieldcustom.txtfieldcustom input_id_bayi;
    private view.swing.textfieldcustom.txtfieldcustom input_keterangan;
    private view.swing.textfieldcustom.txtfieldcustom input_namaibu;
    private view.swing.textfieldcustom.txtfieldcustom input_tanggalhariini;
    private view.swing.textfieldcustom.txtfieldcustom input_tanggallahir;
    private view.swing.textfieldcustom.txtfieldcustom input_tempatlahir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txt_form;
    // End of variables declaration//GEN-END:variables
}
