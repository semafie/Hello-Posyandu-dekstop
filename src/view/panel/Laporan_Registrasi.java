
package view.panel;
import Repository.bayiRepository;
import Repository.ibu_hamilRepository;
import entity.bayi;
import entity.ibu_hamil;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.main;
import util.Conn;
import view.dialog.validasiberhasil;
import view.dialog.validasigagal;
public class Laporan_Registrasi extends javax.swing.JPanel {

    public static int id = 0; 
    private String pilih1 = "bayi";
    
    bayiRepository uwow1 = new bayiRepository();
    ibu_hamilRepository uwow = new ibu_hamilRepository();
    public Laporan_Registrasi() {
        initComponents();
        dataibuhamil.setVisible(false);
        databayi1.setVisible(false);
        load_tabelbayi();
        
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
            for(ibu_hamil apa:uwow.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNama(),
                    apa.getTempat_lahir(),
                    apa.getTanggal_lahir(),
                    apa.getGol_darah(),
                    apa.getAlamat(),
                    apa.getNo_hp(),
                    apa.getTempat_lahir_suami(),
                    apa.getTempat_lahir_suami()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

public void load_tabel(String search) {
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
        String sql = "SELECT * FROM ibu_hamil WHERE id = ? OR nama LIKE ? OR tempat_lahir LIKE ? OR alamat LIKE ? OR no_hp LIKE ?";
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");
        pst.setString(3, "%" + search + "%");
        pst.setString(4, "%" + search + "%");
        pst.setString(5, "%" + search + "%");

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getString("id"),
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getString("tanggal_lahir"),
                res.getString("gol_darah"),
                res.getString("alamat"),
                res.getString("no_hp"),
                res.getString("nama_suami"),
                res.getString("tempat_lahir_suami"),
                res.getString("tanggal_lahir_suami")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void load_tabelbayi(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jenis Kelamin");
        model.addColumn("nama_ibu");
        
        try {
            for(bayi apa:uwow1.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNama(),
                    apa.getTempat_lahir(),
                    apa.getTanggal_lahir(),
                    apa.getJenis_kelamin(),
                    apa.getNama_ibu()
                    
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

public void load_tabelbayi(String search) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Nama");
    model.addColumn("Tempat Lahir");
    model.addColumn("Tanggal Lahir");
    model.addColumn("Jenis Kelamin");
    model.addColumn("nama_ibu");

    try {
        String sql = "SELECT * FROM bayi WHERE id = ? OR nama LIKE ? OR tempat_lahir LIKE ? OR tanggal_lahir LIKE ? OR jenis_kelamin LIKE ? OR nama_ibu LIKE ?";
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");
        pst.setString(3, "%" + search + "%");
        pst.setString(4, "%" + search + "%");
        pst.setString(5, "%" + search + "%");
        pst.setString(6, "%" + search + "%");

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getString("id"),
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getString("tanggal_lahir"),
                res.getString("jenis_kelamin"),
                res.getString("nama_ibu")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
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
        btnsimpanpdf = new javax.swing.JLabel();
        txt_form = new javax.swing.JLabel();
        panelShadow25 = new view.swing.panelcustom.PanelShadow();
        jScrollPane25 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        btncetakdata = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 233));

        jPanel3.setBackground(new Color(0,0,0,0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataibuhamil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih ibu hamil.png"))); // NOI18N
        dataibuhamil.setRequestFocusEnabled(false);
        jPanel3.add(dataibuhamil, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 8, -1, -1));

        databayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih data bayi.png"))); // NOI18N
        jPanel3.add(databayi, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 8, -1, -1));

        databayi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        databayi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                databayi1MouseClicked(evt);
            }
        });
        jPanel3.add(databayi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        dataibuhamil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataibuhamil1.setRequestFocusEnabled(false);
        dataibuhamil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataibuhamil1MouseClicked(evt);
            }
        });
        jPanel3.add(dataibuhamil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 20));

        pilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bg pindah.png"))); // NOI18N
        jPanel3.add(pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 46));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setBackground(new Color(0,0,0,0)
        );
        txt_search.setBorder(null);
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
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

        btnsimpanpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetakpdf1.png"))); // NOI18N
        btnsimpanpdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanpdfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpanpdfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpanpdfMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpanpdfMousePressed(evt);
            }
        });

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Laporan Data Ibu Hamil.png"))); // NOI18N

        panelShadow25.setBackground(new java.awt.Color(234, 245, 255));

        jScrollPane25.setBorder(null);

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
        jScrollPane25.setViewportView(table);

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

        btncetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsetakdata1.png"))); // NOI18N
        btncetakdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncetakdataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncetakdataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncetakdataMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncetakdataMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncetakdata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsimpanpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncetakdata, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(btnsimpanpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanpdfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanpdfMousePressed
    btnsimpanpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetakpdf3.png")));
    }//GEN-LAST:event_btnsimpanpdfMousePressed

    private void btnsimpanpdfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanpdfMouseExited
    btnsimpanpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetakpdf1.png")));
    }//GEN-LAST:event_btnsimpanpdfMouseExited

    private void btnsimpanpdfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanpdfMouseEntered
    btnsimpanpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btncetakpdf2.png")));
    }//GEN-LAST:event_btnsimpanpdfMouseEntered

    private void btnsimpanpdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanpdfMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanpdfMouseClicked

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
    if(pilih1.equals("ibu hamil")){
        
        boolean cobak = uwow.delete(id);
        if(cobak){
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di hapus");
            aa.showPopUp();
            load_tabel();
        } else {
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Pilih dulu dari tabel");
            aa.showPopUp();
        }
    }else {
        boolean cobak1 = uwow1.delete(id);
        if(cobak1){
        main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di hapus");
            aa.showPopUp();
            load_tabel();
    }else {
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Pilih dulu dari tabel");
            aa.showPopUp();
            }
    }
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
    if(pilih1.equals("ibu hamil")){
        
        load_tabel();
    } else {
        
    }
    }//GEN-LAST:event_btneditMouseClicked

    private void dataibuhamil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataibuhamil1MouseClicked
    dataibuhamil.setVisible(true);
    dataibuhamil1.setVisible(false);
        databayi1.setVisible(true);
        databayi.setVisible(false);
        pilih1 = "ibu hamil";
        load_tabel();
    }//GEN-LAST:event_dataibuhamil1MouseClicked

    private void databayi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_databayi1MouseClicked
    dataibuhamil.setVisible(false);
    dataibuhamil1.setVisible(true);
        databayi1.setVisible(false);
        databayi.setVisible(true);
        pilih1 = "bayi";load_tabelbayi();
    }//GEN-LAST:event_databayi1MouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
    if(pilih1.equals("ibu hamil")){
        load_tabel(txt_search.getText());
        
    }else {
        load_tabelbayi(txt_search.getText());
    }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btncetakdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakdataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncetakdataMouseClicked

    private void btncetakdataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakdataMouseEntered
    btncetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsetakdata2.png")));
    }//GEN-LAST:event_btncetakdataMouseEntered

    private void btncetakdataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakdataMouseExited
    btncetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsetakdata1.png")));
    }//GEN-LAST:event_btncetakdataMouseExited

    private void btncetakdataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakdataMousePressed
     btncetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsetakdata3.png")));
    }//GEN-LAST:event_btncetakdataMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgsearch;
    private javax.swing.JLabel btncetakdata;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btnsimpanpdf;
    private javax.swing.JLabel databayi;
    private javax.swing.JLabel databayi1;
    private javax.swing.JLabel dataibuhamil;
    private javax.swing.JLabel dataibuhamil1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane25;
    private view.swing.panelcustom.PanelShadow panelShadow25;
    private javax.swing.JLabel pilih;
    private view.swing.Table table;
    private javax.swing.JLabel txt_form;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
