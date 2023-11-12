/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import main.main;
import main.mainlogin;
import service.Auth;
import view.dialog.Validasikeluar;
import view.dialog.validasiberhasil;
import view.dialog.validasigagal;

public class login extends javax.swing.JPanel {
private static boolean isHidden = true;
   
    public login() {
        initComponents();
        Font font = new Font("Quicksand", Font.PLAIN, 15);
        setHintText(inputpassword, "Input Password");
        inputusername.setFont(font);
        inputpassword.setFont(font);
        inputusername.setForeground(Color.GRAY);
        
    }
    
    public static void setHintText(JPasswordField passwordField, String hintText) {
        passwordField.setText(hintText);
        passwordField.setEchoChar((char) 0);
        passwordField.setForeground(Color.GRAY);// Set echo character to '*'
        
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals(hintText)) {
                    passwordField.setEchoChar('*'); // Show '*' for hint text
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("")) {
                    passwordField.setEchoChar((char) 0); // Show actual characters for input
                    passwordField.setText(hintText);
                    passwordField.setForeground(Color.GRAY);
                    
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputusername = new javax.swing.JTextField();
        inputpassword = new javax.swing.JPasswordField();
        eye = new javax.swing.JLabel();
        silang = new javax.swing.JLabel();
        btnlogin = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setLayout(null);

        inputusername.setBackground(new Color(0,0,0,0));
        inputusername.setText("Input Username");
        inputusername.setBorder(null);
        inputusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputusernameFocusLost(evt);
            }
        });
        inputusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputusernameMouseClicked(evt);
            }
        });
        inputusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputusernameActionPerformed(evt);
            }
        });
        add(inputusername);
        inputusername.setBounds(650, 260, 300, 36);

        inputpassword.setBackground(new Color(0,0,0,0)
        );
        inputpassword.setText("Input Password");
        inputpassword.setBorder(null);
        inputpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputpasswordActionPerformed(evt);
            }
        });
        add(inputpassword);
        inputpassword.setBounds(650, 317, 300, 40);

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/eye1.png"))); // NOI18N
        eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeMouseClicked(evt);
            }
        });
        add(eye);
        eye.setBounds(955, 323, 30, 30);

        silang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/silang1.png"))); // NOI18N
        silang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                silangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                silangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                silangMousePressed(evt);
            }
        });
        add(silang);
        silang.setBounds(1010, 10, 19, 20);

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin1.png"))); // NOI18N
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
        });
        add(btnlogin);
        btnlogin.setBounds(600, 390, 400, 63);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg login.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1044, 587);

        jTextField1.setText("jTextField1");
        add(jTextField1);
        jTextField1.setBounds(630, 210, 71, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void inputusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputusernameFocusGained
        if (inputusername.getText().equals("Input Username")) {
            inputusername.setText("");
            inputusername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_inputusernameFocusGained

    private void inputusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputusernameFocusLost
        if (inputusername.getText().isEmpty()) {
            inputusername.setText("Input Username");
            inputusername.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_inputusernameFocusLost

    private void inputusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputusernameMouseClicked

    }//GEN-LAST:event_inputusernameMouseClicked

    private void inputusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputusernameActionPerformed

    }//GEN-LAST:event_inputusernameActionPerformed

    private void inputpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputpasswordActionPerformed

    }//GEN-LAST:event_inputpasswordActionPerformed

    private void eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseClicked
        if (isHidden) {
            inputpassword.setEchoChar((char) 0);
            //            toggleButton.setText("Hide Password");
            eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/eye2.png")));
            isHidden = false;
        } else {
            inputpassword.setEchoChar('*');
            eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/eye1.png")));
            //            toggleButton.setText("Show Password");
            isHidden = true;
        }
    }//GEN-LAST:event_eyeMouseClicked

    private void silangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silangMouseClicked
    mainlogin main = (mainlogin)SwingUtilities.getWindowAncestor(this);
    Validasikeluar apa = new Validasikeluar(main);
    apa.showPopUp();
    }//GEN-LAST:event_silangMouseClicked

    private void silangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silangMouseEntered
    silang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/silang2.png")));
    }//GEN-LAST:event_silangMouseEntered

    private void silangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silangMouseExited
    silang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/silang1.png")));
    }//GEN-LAST:event_silangMouseExited

    private void silangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silangMousePressed
    silang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/silang3.png")));
    }//GEN-LAST:event_silangMousePressed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
    String user = inputusername.getText();
    String pass = inputpassword.getText();
        Auth ap = new Auth();
        System.out.println(pass);
        System.out.println(user);
    if(ap.login(user, pass)){
        
        mainlogin main = (mainlogin)SwingUtilities.getWindowAncestor(this);
//        main main1 = (main)SwingUtilities.getWindowAncestor(this);
        main.dispose();
//    this.setVisible(false);
        new main().setVisible(true);
//            validasiberhasil aa = new validasiberhasil(main1,"Anda Berhasil Login");
//            aa.showPopUp();
        
                     
        
        
    }else if (user.equals("Input Username")){
        mainlogin wow = (mainlogin)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Usename tidak boleh kosong");
            aa.showPopUp(); 
        
    }else if (pass.equals("Input Password")){
        mainlogin wow = (mainlogin)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Password tidak boleh kosong");
            aa.showPopUp(); 
        
    }else{
        mainlogin wow = (mainlogin)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Usename atau password salah");
            aa.showPopUp(); 
        
    }
    }//GEN-LAST:event_btnloginMouseClicked

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin2.png")));
    }//GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin1.png")));
    }//GEN-LAST:event_btnloginMouseExited

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed
    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnlogin3.png")));
    }//GEN-LAST:event_btnloginMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel eye;
    private javax.swing.JPasswordField inputpassword;
    private javax.swing.JTextField inputusername;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel silang;
    // End of variables declaration//GEN-END:variables
}
