/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_admin;

import mib_admin.AdminAlienInfo;
import mib_alien.AlienHuvudMeny;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import mib_verktyg.Validering;

/**
 *
 * @author Pc
 */
public class AdminNyregistreraAlien extends javax.swing.JFrame {

    /**
     * Creates new form AdminNyregistreraAlien
     */
    public AdminNyregistreraAlien() {
        initComponents();
        this.setLocationRelativeTo(null);
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        adminalienlosentxt = new javax.swing.JTextField();
        adminaliennamntxt = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        adminalienidtxt = new javax.swing.JTextField();
        admintelealientxt = new javax.swing.JTextField();
        adminnyregistreraalienbtn = new javax.swing.JButton();
        adminalienregdatumtxt = new javax.swing.JTextField();
        adminplatsalientxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        adminansagenttxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        adminregtillbakabtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rasbox1 = new javax.swing.JComboBox<>();
        rastext1 = new javax.swing.JLabel();
        antaltxt1 = new javax.swing.JTextField();

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setText("Ansvarig agent-ID*");

        jLabel15.setText("Namn");

        adminalienlosentxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminalienlosentxtActionPerformed(evt);
            }
        });

        jLabel44.setText("Alien ID");

        jLabel16.setText("Telefonnummer");

        adminnyregistreraalienbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminnyregistreraalienbtn.setText("Registrera");
        adminnyregistreraalienbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminnyregistreraalienbtnActionPerformed(evt);
            }
        });

        adminalienregdatumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminalienregdatumtxtActionPerformed(evt);
            }
        });

        jLabel17.setText("Datum tillagd");

        jLabel12.setText("Plats ID*");

        adminansagenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminansagenttxtActionPerformed(evt);
            }
        });

        jLabel14.setText("Lösenord*");

        adminregtillbakabtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        adminregtillbakabtn.setText("Tillbaka");
        adminregtillbakabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminregtillbakabtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Registrera ny alien");

        rasbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ras", "Boglodite", "Squid", "Worm" }));
        rasbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasbox1ActionPerformed(evt);
            }
        });

        antaltxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antaltxt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(187, Short.MAX_VALUE)
                        .addComponent(adminregtillbakabtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminaliennamntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminansagenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(admintelealientxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminalienregdatumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel12)
                                    .addComponent(adminplatsalientxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(adminalienlosentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(adminnyregistreraalienbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminalienidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rasbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(antaltxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(rastext1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminregtillbakabtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminalienidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminaliennamntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminalienlosentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminplatsalientxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminansagenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminalienregdatumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admintelealientxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rastext1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antaltxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rasbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminnyregistreraalienbtn)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminalienlosentxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminalienlosentxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminalienlosentxtActionPerformed

    private void adminnyregistreraalienbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminnyregistreraalienbtnActionPerformed
        if (Validering.textFaltHarVarde(adminalienidtxt) && Validering.isHeltal(adminalienidtxt) && Validering.textFaltHarVarde(adminalienregdatumtxt) && Validering.giltigtDatum(adminalienregdatumtxt) && Validering.textFaltHarVarde(adminalienlosentxt) && Validering.textFaltHarVarde(adminaliennamntxt) && Validering.textFaltHarVarde(admintelealientxt) && Validering.textFaltHarVarde(adminplatsalientxt) && Validering.isHeltal(adminplatsalientxt) && Validering.textFaltHarVarde(adminansagenttxt) && Validering.isHeltal(adminansagenttxt)) {
            try {
                String sql = "INSERT INTO alien"
                        + "(Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent)"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, adminalienidtxt.getText());
                pst.setString(2, adminalienregdatumtxt.getText());
                pst.setString(3, adminalienlosentxt.getText());
                pst.setString(4, adminaliennamntxt.getText());
                pst.setString(5, admintelealientxt.getText());
                pst.setString(6, adminplatsalientxt.getText());
                pst.setString(7, adminansagenttxt.getText());
                pst.executeUpdate();
                if (rasbox1.getSelectedItem().equals("Boglodite")) { //Om rutan från combo boxen väljs så kommer följande att synas
                    String boglodite = "INSERT INTO boglodite (Alien_ID, Antal_Boogies) VALUES (?, ?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                    pst = con.prepareStatement(boglodite);
                    pst.setString(1, adminalienidtxt.getText());
                    pst.setString(2, antaltxt1.getText());
                } else if (rasbox1.getSelectedItem().equals("Squid")) {
                    String squid = "INSERT INTO squid (Alien_ID, Antal_Armar) VALUES (?, ?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                    pst = con.prepareStatement(squid);
                    pst.setString(1, adminalienidtxt.getText());
                    pst.setString(2, antaltxt1.getText());
                } else if (rasbox1.getSelectedItem().equals("Worm")) {
                    String worm = "INSERT INTO Worm (Alien_ID) VALUES (?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                    pst = con.prepareStatement(worm);
                    pst.setString(1, adminalienidtxt.getText());
                }
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Ny alien har registrerats!");
                adminalienidtxt.setText("");
                adminalienregdatumtxt.setText("");
                adminalienlosentxt.setText("");
                adminaliennamntxt.setText("");
                admintelealientxt.setText("");
                adminplatsalientxt.setText("");
                adminansagenttxt.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_adminnyregistreraalienbtnActionPerformed

    private void adminalienregdatumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminalienregdatumtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminalienregdatumtxtActionPerformed

    private void adminansagenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminansagenttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminansagenttxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlienHuvudMeny meny = new AlienHuvudMeny();
        meny.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adminregtillbakabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminregtillbakabtnActionPerformed
        AdminAlienInfo meny = new AdminAlienInfo();
        meny.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminregtillbakabtnActionPerformed

    private void rasbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasbox1ActionPerformed
        if (rasbox1.getSelectedItem().equals("Boglodite")) {
            antaltxt1.setText("");
            antaltxt1.setEnabled(true);
            rastext1.setText("Antal boogies:");
        } else if (rasbox1.getSelectedItem().equals("Squid")) {
            antaltxt1.setText("");
            antaltxt1.setEnabled(true);
            rastext1.setText("Antal armar:");
        } else if (rasbox1.getSelectedItem().equals("Worm")) {
            antaltxt1.setEnabled(false);
            rastext1.setText("Vald ras:");
            antaltxt1.setText("Worm");
        }
        //Här görs en if else if sats, om vald ruta väljs i combo boxen så kommer villkoren för den valda att synas.
    }//GEN-LAST:event_rasbox1ActionPerformed

    private void antaltxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antaltxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antaltxt1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminNyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminNyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminNyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminNyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminNyregistreraAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminalienidtxt;
    private javax.swing.JTextField adminalienlosentxt;
    private javax.swing.JTextField adminaliennamntxt;
    private javax.swing.JTextField adminalienregdatumtxt;
    private javax.swing.JTextField adminansagenttxt;
    private javax.swing.JButton adminnyregistreraalienbtn;
    private javax.swing.JTextField adminplatsalientxt;
    private javax.swing.JButton adminregtillbakabtn;
    private javax.swing.JTextField admintelealientxt;
    private javax.swing.JTextField antaltxt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JComboBox<String> rasbox1;
    private javax.swing.JLabel rastext1;
    // End of variables declaration//GEN-END:variables
}
