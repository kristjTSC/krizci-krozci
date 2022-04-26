/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kristjan
 */
public class ZacetnoOkno extends javax.swing.JFrame {

    public static String vpisanUser;
    public static String vpisanoGeslo;
    public int poi = 0;
    public int izbir;

    /**
     * Creates new form ZacetnoOkno
     */
    public ZacetnoOkno() {
        initComponents();

        if (cau.adios) {
            napis1.setText("Gumba še vedno ni, ter ga tudi ne bo (nekako)...");
            napis.setVisible(false);
            jButton1.setVisible(false);
        }

        jButton4.setVisible(false);
        jButton5.setVisible(false);
        File prev = new File("registracija.txt");
        if (!prev.exists()) {
            try {
                prev.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ZacetnoOkno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logUpIme = new javax.swing.JTextField();
        logGeslo = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        napis1 = new javax.swing.JLabel();
        napis = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prijava");
        setMaximumSize(new java.awt.Dimension(580, 300));
        setMinimumSize(new java.awt.Dimension(580, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Prijava");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 220, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dobrodošel v igri križci-krožci");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 390, 60);

        logUpIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUpImeActionPerformed(evt);
            }
        });
        getContentPane().add(logUpIme);
        logUpIme.setBounds(320, 80, 120, 30);
        getContentPane().add(logGeslo);
        logGeslo.setBounds(320, 130, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Geslo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 130, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Uporabniško ime:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 80, 170, 30);

        jButton2.setText("Izhod");
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 220, 110, 30);

        jButton3.setText("Registracija");
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 220, 110, 30);

        napis1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(napis1);
        napis1.setBounds(140, 254, 310, 30);

        napis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(napis);
        napis.setBounds(140, 254, 310, 30);

        jButton4.setText("Ne");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(480, 260, 73, 30);

        jButton5.setText("Da");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 260, 73, 30);

        jButton6.setText("Pozabljeno geslo?");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(310, 170, 140, 30);

        jButton7.setText("Zamenjaj temo");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(470, 0, 110, 20);

        jButton8.setText("Vizitka");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 0, 70, 20);

        setSize(new java.awt.Dimension(596, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        int x = (int) (Math.random() * 400 + 50);
        int y = (int) (Math.random() * 200 + 50);
        jButton1.setBounds(x, y, 110, 30);
        poi++;
        if (poi == 6) {
            napis.setText("Se še kar trudiš?");
        } else if (poi == 12) {
            napis.setText("Kaj pa če tisti gumb sploh nima pomena?");
        } else if (poi == 20) {
            napis.setText("A potrebuješ pomoč?");
            jButton4.setVisible(true);
            jButton5.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseMoved

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        vpisanUser = logUpIme.getText();
        vpisanoGeslo = logGeslo.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("registracija.txt"));
            String vrstica;
            String ime = "";
            boolean prijavljen = false;
            while (br.ready()) {
                vrstica = br.readLine();
                String[] tab = vrstica.split("¸");
                String user = tab[0];
                ime = tab[1];
                String gesl = tab[2];
                prijavljen = vpisanUser.equalsIgnoreCase(user) && vpisanoGeslo.equals(gesl);
                if (prijavljen) {
                    break;
                }
            }
            if (prijavljen) {
                JOptionPane.showMessageDialog(rootPane, "Žvijo, " + ime + "!");
                new Nadzorna().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nepoznan uporabnik!");
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZacetnoOkno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ZacetnoOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void logUpImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUpImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logUpImeActionPerformed

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Registracija().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        napis.setText("Klikni na naslov");
        jButton4.setVisible(false);
        jButton5.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        napis.setText("Dobro. Pa nič.");
        jButton4.setVisible(false);
        jButton5.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new PozabljenoGeslo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        napis.setText("Glej, zaradi tebe gumba ni več...");
        jButton1.setVisible(false);
        cau.adios = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        if (cau.belaTema) {
            FlatLightLaf.install();
            SwingUtilities.updateComponentTreeUI(this);
            cau.belaTema = false;
        } else {
            FlatDarkLaf.install();
            SwingUtilities.updateComponentTreeUI(this);
            cau.belaTema = true;
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new Vizitka().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.install();// Uporaba FlatLightLaf teme
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ZacetnoOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZacetnoOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZacetnoOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZacetnoOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZacetnoOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField logGeslo;
    private javax.swing.JTextField logUpIme;
    private javax.swing.JLabel napis;
    private javax.swing.JLabel napis1;
    // End of variables declaration//GEN-END:variables
}