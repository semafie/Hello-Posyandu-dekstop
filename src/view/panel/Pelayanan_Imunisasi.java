
package view.panel;
import Repository.bayiRepository;
import Repository.imunisasiRepository;
import entity.bayi;
import entity.imunisasi;
import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
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

public class Pelayanan_Imunisasi extends javax.swing.JPanel {
    main main =(main)SwingUtilities.getWindowAncestor(this);
    
    private int id;
    bayiRepository bayi = new bayiRepository();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    imunisasiRepository imun = new imunisasiRepository();
    
    public Pelayanan_Imunisasi() {
        initComponents();
        Date hariini = new Date();
        input_tanggalhariini.setText(sdf.format(hariini));
        Font font = new Font("Quicksand", Font.PLAIN, 20);
        
        input_id_bayi.setFont(font);
        input_keterangan.setFont(font);
        input_tanggallahir.setFont(font);
        input_tempatlahir.setFont(font);
        input_jenisImunisasi.setFont(font);
        input_jenisvitamin.setFont(font);
        input_tanggalhariini.setFont(font);
        input_keterangan.setFont(font);
        input_usia.setFont(font);
        input_namaibu.setFont(font);
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
        input_usia = new view.swing.textfieldcustom.txtfieldcustom();
        input_jenisvitamin = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel7 = new javax.swing.JLabel();
        input_namaibu = new view.swing.textfieldcustom.txtfieldcustom();
        jButton2 = new javax.swing.JButton();
        btnsimpan = new javax.swing.JLabel();
        btnreset = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        input_jenisImunisasi = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        input_keterangan = new view.swing.textfieldcustom.txtfieldcustom();
        cmb_pilih = new javax.swing.JComboBox<>();

        date1.setTextRefernce(input_tanggallahir);

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Pelayanan Imunisasi.png"))); // NOI18N

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Tanggal Imunisasi.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Usia.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Jenis Vitamin.png"))); // NOI18N

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

        input_usia.setBackground(new java.awt.Color(246, 246, 233));
        input_usia.setRound(40);
        input_usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usiaActionPerformed(evt);
            }
        });

        input_jenisvitamin.setBackground(new java.awt.Color(246, 246, 233));
        input_jenisvitamin.setRound(40);
        input_jenisvitamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jenisvitaminActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Nama Ibu.png"))); // NOI18N

        input_namaibu.setBackground(new java.awt.Color(246, 246, 233));
        input_namaibu.setAutoscrolls(false);
        input_namaibu.setFocusable(false);
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

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Bulan");

        input_jenisImunisasi.setBackground(new java.awt.Color(246, 246, 233));
        input_jenisImunisasi.setRound(40);
        input_jenisImunisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jenisImunisasiActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Jenis Imunisasi.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanimunisasi_Keterangan.png"))); // NOI18N

        input_keterangan.setBackground(new java.awt.Color(246, 246, 233));
        input_keterangan.setRound(40);
        input_keterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_keteranganActionPerformed(evt);
            }
        });

        cmb_pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih dulu--" }));
        cmb_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pilihActionPerformed(evt);
            }
        });
        cmb_pilih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmb_pilihKeyReleased(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_tanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_form))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(input_tempatlahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_id_bayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(input_namaibu, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(input_usia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(input_jenisImunisasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(input_jenisvitamin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(input_keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(265, 265, 265))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input_tanggalhariini, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_namaibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_id_bayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_pilih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_tempatlahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_tanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_tanggalhariini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_usia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_jenisImunisasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_jenisvitamin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void input_usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usiaActionPerformed

    private void input_jenisvitaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jenisvitaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jenisvitaminActionPerformed

    private void input_namaibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaibuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaibuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        date1.showPopup();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
    if(!input_id_bayi.getText().equals("") || input_usia.getText().equals("") ||
            !input_jenisImunisasi.getText().equals("") || !input_jenisvitamin.getText().equals("")||
            !input_keterangan.getText().equals("") || !input_namaibu.getText().equals("")||
            !input_tempatlahir.getText().equals("")){
        try {
            Date hari = new Date();
        bayi bayiii = new bayi(Integer.valueOf(input_id_bayi.getText()));
        imunisasi kirim = new imunisasi(bayiii,hari,Integer.valueOf(input_usia.getText()),input_jenisImunisasi.getText(),
        input_jenisvitamin.getText(),input_keterangan.getText());
        boolean apa = imun.add(kirim);
        if(apa){
            int idfinalrekap = imun.getlastid().getId();
            InputStream struk = getClass().getResourceAsStream("/jasper_report/report_pelayanan_imunisasi.jrxml");
            String query = "SELECT * FROM imunisasi JOIN bayi ON imunisasi.id_bayi = bayi.id where imunisasi.id = " + idfinalrekap;
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
            viewer.setDefaultCloseOperation(main.DISPOSE_ON_CLOSE);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Ditambahakan");
            panel.showNotification();
            input_id_bayi.setText("");
        input_keterangan.setText("");
        input_tanggallahir.setText("");
        input_tempatlahir.setText("");
        input_jenisImunisasi.setText("");
        input_jenisvitamin.setText("");
        
        input_keterangan.setText("");
        input_usia.setText("");
        input_namaibu.setText("");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        } else {
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
        }
        } catch (Exception e) {
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Data Gagal Ditambahakan");
            panel.showNotification();
        }
        
    }else{
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
        input_usia.setText("");
        input_id_bayi.setText("");
        input_namaibu.setText("");
        input_jenisvitamin.setText("");
        input_tempatlahir.setText("");
        input_jenisImunisasi.setText("");
        input_keterangan.setText("");
        

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

    private void input_jenisImunisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jenisImunisasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jenisImunisasiActionPerformed

    private void input_keteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_keteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_keteranganActionPerformed

    private void cmb_pilihKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_pilihKeyReleased
    
    }//GEN-LAST:event_cmb_pilihKeyReleased

    private void cmb_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pilihActionPerformed
    Object cmb_pilih1 = cmb_pilih.getSelectedItem();
        input_id_bayi.setText(String.valueOf(bayi.getidbynama(cmb_pilih1.toString()).getId()));
        input_namaibu.setText(bayi.getidbynama(cmb_pilih1.toString()).getNama_ibu());
        input_tempatlahir.setText(bayi.getidbynama(cmb_pilih1.toString()).getTempat_lahir());
        input_tanggallahir.setText(String.valueOf(bayi.getidbynama(cmb_pilih1.toString()).getTanggal_lahir()));
    }//GEN-LAST:event_cmb_pilihActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnreset;
    private javax.swing.JLabel btnsimpan;
    private javax.swing.JComboBox<String> cmb_pilih;
    private view.customdate.DateChooser date1;
    public static view.swing.textfieldcustom.txtfieldcustom input_id_bayi;
    private view.swing.textfieldcustom.txtfieldcustom input_jenisImunisasi;
    private view.swing.textfieldcustom.txtfieldcustom input_jenisvitamin;
    private view.swing.textfieldcustom.txtfieldcustom input_keterangan;
    private view.swing.textfieldcustom.txtfieldcustom input_namaibu;
    private view.swing.textfieldcustom.txtfieldcustom input_tanggalhariini;
    private view.swing.textfieldcustom.txtfieldcustom input_tanggallahir;
    private view.swing.textfieldcustom.txtfieldcustom input_tempatlahir;
    private view.swing.textfieldcustom.txtfieldcustom input_usia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel txt_form;
    // End of variables declaration//GEN-END:variables
}
