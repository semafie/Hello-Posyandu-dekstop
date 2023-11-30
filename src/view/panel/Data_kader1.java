/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

import Repository.bidanRepository;
import Repository.userRepository;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import entity.bidan;
import entity.user;
import java.awt.Font;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.main;
import util.Conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.dialog.formeditbidan;
import view.dialog.formtambahbidan;
import view.dialog.formtambahkader;
import view.dialog.validasiberhasil;
import view.dialog.validasigagal;

/**
 *
 * @author RESCOM-1
 */
public class Data_kader1 extends javax.swing.JPanel {
    bidanRepository uwow = new bidanRepository();
    userRepository uwow1 = new userRepository();
    public static int id;
    
    public Data_kader1() {
        initComponents();
        Font font = new Font("Quicksand", Font.BOLD, 20);
        txttotal.setFont(font);
        total.setFont(font);
        
        load_tabel();
        int rowCount = table.getRowCount();
        total.setText(String.valueOf(rowCount));
        
    }
    
    public void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("EMAIL");
        model.addColumn("NAMA_KADER");
        model.addColumn("TEMPAT LAHIR");
        model.addColumn("TANGGAL LAHIR");
        model.addColumn("PENDIDIKAN");
        model.addColumn("ALAMAT");
        model.addColumn("NO HP");
        try {
            for(user apa:uwow1.getkader()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getUsername(),
                    apa.getPassword(),
                    apa.getEmail(),
                    apa.getNama(),
                    apa.getTempat_lahir(),
                    apa.getTanggal_lahir(),
                    apa.getPendidikan_terakhir(),
                    apa.getAlamat(),
                    apa.getNo_hp()
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
        model.addColumn("NAMA_KADER");
        model.addColumn("TEMPAT LAHIR");
        model.addColumn("TANGGAL LAHIR");
        model.addColumn("PENDIDIKAN");
        model.addColumn("ALAMAT");
        model.addColumn("NO HP");

    try {
        String sql = "SELECT * FROM user WHERE id = ? OR nama LIKE ? OR tempat_lahir LIKE ? OR alamat LIKE ? OR no_hp LIKE ? role = 'kader'";
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
                res.getString("pendidikan"),
                res.getString("alamat"),
                res.getString("no_hp")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private boolean convertJTableToPDF(JTable jTable) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan sebagai PDF");
    fileChooser.setFileFilter(new FileNameExtensionFilter("File PDF", "pdf"));

    int userSelection = fileChooser.showSaveDialog(null);
        try {
            
        
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
        Document document = new Document(PageSize.A4.rotate());

        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            // Tambahkan judul laporan
                Paragraph title = new Paragraph("LAPORAN IBU BIDAN", new com.lowagie.text.Font(com.lowagie.text.Font.BOLD, 18, com.lowagie.text.Font.NORMAL));
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);
                
                Paragraph title1 = new Paragraph(" ", new com.lowagie.text.Font(com.lowagie.text.Font.BOLD, 18, com.lowagie.text.Font.NORMAL));
                title1.setAlignment(Element.ALIGN_CENTER);
                document.add(title1);
                
                
                
                
                // Tambahkan tanggal hari ini
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String currentDate = "Tanggal: " + sdf.format(new Date()) ;
                Paragraph date = new Paragraph(currentDate, new com.lowagie.text.Font(com.lowagie.text.Font.BOLD, 12, com.lowagie.text.Font.NORMAL));
                date.setAlignment(Element.ALIGN_RIGHT);
                document.add(date);
                
                Paragraph title2 = new Paragraph(" ", new com.lowagie.text.Font(com.lowagie.text.Font.BOLD, 20, com.lowagie.text.Font.NORMAL));
                title2.setAlignment(Element.ALIGN_CENTER);
                document.add(title2);
                
                date.setSpacingAfter(25);
            
            PdfPTable pdfTable = new PdfPTable(jTable.getColumnCount());
            
            pdfTable.getDefaultCell().setBorderColor(new Color(219,219,219));
            
            pdfTable.setTotalWidth(PageSize.A4.getHeight());

            // Mengisi header tabel PDF dengan nama kolom dari JTable
            for (int i = 0; i < jTable.getColumnCount(); i++) {
//                pdfTable.addCell(jTable.getColumnName(i));
                PdfPCell cell = new PdfPCell(new Phrase(jTable.getColumnName(i)));
                    cell.setBackgroundColor(new Color(140,170,126)); // Warna latar belakang
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER); // Pusatkan teks
                    cell.setPadding(1);
                    cell.setBorderColor(Color.WHITE);
                    pdfTable.addCell(cell);
            }
//            float[] columnWidths = {1f, 1.5f, 2f, 1.5f}; // Sesuaikan lebar kolom sesuai kebutuhan
//                pdfTable.setWidths(columnWidths);


            // Mengisi data dari JTable ke tabel PDF
            for (int i = 0; i < jTable.getRowCount(); i++) {
                for (int j = 0; j < jTable.getColumnCount(); j++) {
                    pdfTable.addCell(jTable.getValueAt(i, j).toString());
                }
            }

            document.add(pdfTable);
            document.close();
//            JOptionPane.showMessageDialog(null, "Berhasil menyimpan PDF", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di cetak");
            aa.showPopUp();
            return true;
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Gagal menyimpan PDF", "Error", JOptionPane.ERROR_MESSAGE);
    main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Data gagal dicetak");
            aa.showPopUp();
return false;
        }   
    }
    return true;
    } catch (Exception e) {
        return false;
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

        txt_form = new javax.swing.JLabel();
        panelShadow25 = new view.swing.panelcustom.PanelShadow();
        jScrollPane25 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        btnsimpancetak = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        bgsearch = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Form Data Kader.png"))); // NOI18N

        panelShadow25.setBackground(new java.awt.Color(234, 245, 255));

        jScrollPane25.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane25.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(jScrollPane25)
                .addGap(30, 30, 30))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png"))); // NOI18N
        btnsimpancetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpancetakMousePressed(evt);
            }
        });

        txttotal.setText("Total Kader :");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txt_form)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                        .addComponent(btnsimpancetak))
                    .addComponent(panelShadow25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelShadow25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpancetak)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpancetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseClicked
        convertJTableToPDF(table);
    }//GEN-LAST:event_btnsimpancetakMouseClicked

    private void btnsimpancetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseEntered
    btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak2.png")));
    }//GEN-LAST:event_btnsimpancetakMouseEntered

    private void btnsimpancetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseExited
    btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png")));
    }//GEN-LAST:event_btnsimpancetakMouseExited

    private void btnsimpancetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMousePressed
    btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak3.png")));
    }//GEN-LAST:event_btnsimpancetakMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
        System.out.println(id);
    }//GEN-LAST:event_tableMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        load_tabel(txt_search.getText());
    }//GEN-LAST:event_txt_searchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgsearch;
    private javax.swing.JLabel btnsimpancetak;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane25;
    private view.swing.panelcustom.PanelShadow panelShadow25;
    private view.swing.Table table;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt_form;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
