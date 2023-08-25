/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_admin;

import mib_admin.AdminAgentInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import mib_verktyg.Validering;

/**
 *
 * @author Pc
 */
public class AdminChefer extends javax.swing.JFrame {

    /**
     * Creates new form AdminChefer
     */
    public AdminChefer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminchefertillbaka = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        omradeidtxt = new javax.swing.JTextField();
        omradebox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        omradebytabtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kontoridtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kontorbytabtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Kontorbox = new javax.swing.JComboBox<>();
        omradetxt = new javax.swing.JLabel();
        kontortxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        raderachefagentid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        raderachefbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminchefertillbaka.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        adminchefertillbaka.setText("Tillbaka");
        adminchefertillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminchefertillbakaActionPerformed(evt);
            }
        });

        jLabel3.setText("Agent ID:");

        omradebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Svealand", "Götaland", "Norrland" }));
        omradebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradeboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Område:");

        omradebytabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        omradebytabtn.setText("Ändra");
        omradebytabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradebytabtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Byt områdeschef:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Byt kontorschef:");

        jLabel5.setText("Agent ID:");

        kontorbytabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kontorbytabtn.setText("Ändra");
        kontorbytabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontorbytabtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Kontorsbeteckning:");

        Kontorbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Örebro kontoret" }));
        Kontorbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KontorboxActionPerformed(evt);
            }
        });

        omradetxt.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N

        kontortxt.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Radera agent från chefsrollen:");

        jLabel8.setText("Agent ID:");

        raderachefbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        raderachefbtn.setText("Radera");
        raderachefbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raderachefbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminchefertillbaka)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kontoridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kontorbox, 0, 1, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(kontorbytabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(kontortxt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(omradeidtxt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(omradetxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(omradebox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(omradebytabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(raderachefagentid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(raderachefbtn)))
                .addGap(25, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminchefertillbaka)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(omradetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omradebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omradeidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omradebytabtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(kontortxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kontorbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kontoridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kontorbytabtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raderachefagentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raderachefbtn))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminchefertillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminchefertillbakaActionPerformed
        AdminAgentInfo meny = new AdminAgentInfo();
        meny.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminchefertillbakaActionPerformed

    private void omradebytabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradebytabtnActionPerformed
        if (Validering.textFaltHarVarde(omradeidtxt) && Validering.isHeltal(omradeidtxt)) {
            try {
                String omradeschef = "INSERT INTO omradeschef (Omrade, Agent_ID) VALUES (?, ?) ON DUPLICATE KEY UPDATE Omrade=?, Agent_ID=?";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                PreparedStatement pst = con.prepareStatement(omradeschef);
                pst.setString(1, omradetxt.getText());
                pst.setString(2, omradeidtxt.getText());
                pst.setString(3, omradetxt.getText());
                pst.setString(4, omradeidtxt.getText());
                pst.executeUpdate();
                String agentomrade = "INSERT INTO kontorschef (Agent_ID) VALUES (?) ON DUPLICATE KEY UPDATE Agent_ID=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                pst = con.prepareStatement(agentomrade);
                pst.setString(1, omradeidtxt.getText());
                pst.setString(2, omradeidtxt.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Uppdaterad omradeschef");
                omradetxt.setText("");
                omradeidtxt.setText("");
                omradebox.setSelectedItem("Välj");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_omradebytabtnActionPerformed

    private void kontorbytabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontorbytabtnActionPerformed
        if (Validering.textFaltHarVarde(kontoridtxt) && Validering.isHeltal(kontoridtxt)) {
            try {
                String kontor = "UPDATE kontorschef SET Agent_ID=? WHERE Kontorsbeteckning='Örebrokontoret'";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                PreparedStatement pst = con.prepareStatement(kontor);
                pst.setString(1, kontoridtxt.getText());
                kontortxt.setText("");
                kontoridtxt.setText("");
                Kontorbox.setSelectedItem("Välj");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Uppdaterad kontorschef");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_kontorbytabtnActionPerformed

    private void omradeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradeboxActionPerformed
        if (omradebox.getSelectedItem().equals("Svealand")) {
            omradetxt.setText("1");
        } else if (omradebox.getSelectedItem().equals("Götaland")) {
            omradetxt.setText("2");
        } else if (omradebox.getSelectedItem().equals("Norrland")) {
            omradetxt.setText("4");
        }
    }//GEN-LAST:event_omradeboxActionPerformed

    private void KontorboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KontorboxActionPerformed
        if (omradebox.getSelectedItem().equals("Örebro kontoret")) {
            omradetxt.setText("Örebrokontoret");
        }
    }//GEN-LAST:event_KontorboxActionPerformed

    private void raderachefbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raderachefbtnActionPerformed
        try {
            String sql = "DELETE FROM omradeschef WHERE Agent_ID=?";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, raderachefagentid.getText());
            pst.executeUpdate();
            String sql2 = "DELETE FROM kontorschef WHERE Agent_ID=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
            pst = con.prepareStatement(sql2);
            pst.setString(1, raderachefagentid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Agent "+raderachefagentid.getText()+" är nu bortagen från en chefsroll");
            raderachefagentid.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_raderachefbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminChefer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminChefer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminChefer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminChefer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminChefer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Kontorbox;
    private javax.swing.JButton adminchefertillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton kontorbytabtn;
    private javax.swing.JTextField kontoridtxt;
    private javax.swing.JLabel kontortxt;
    private javax.swing.JComboBox<String> omradebox;
    private javax.swing.JButton omradebytabtn;
    private javax.swing.JTextField omradeidtxt;
    private javax.swing.JLabel omradetxt;
    private javax.swing.JTextField raderachefagentid;
    private javax.swing.JButton raderachefbtn;
    // End of variables declaration//GEN-END:variables
}
