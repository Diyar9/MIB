/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_alien;

import mib_alien.AlienHuvudMeny;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import mib_verktyg.Validering;

/**
 *
 * @author Pc
 */
public class AlienVemOmradeschef extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement awp = null;
    ResultSet rs = null;

    /**
     * Creates new form AlienVemOmradeschef
     */
    public AlienVemOmradeschef() {
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

        omradescheftillbaka = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        infoomradetxt = new javax.swing.JTextField();
        hamtaomradedata = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alienomradeinfotable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        omchefalientxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        omradescheftillbaka.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        omradescheftillbaka.setText("Tillbaka");
        omradescheftillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradescheftillbakaActionPerformed(evt);
            }
        });

        jLabel36.setText("Alien ID");

        infoomradetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoomradetxtActionPerformed(evt);
            }
        });

        hamtaomradedata.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hamtaomradedata.setText("Hämta data");
        hamtaomradedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamtaomradedataActionPerformed(evt);
            }
        });

        alienomradeinfotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Namn", "Telefon", "Område"
            }
        ));
        jScrollPane1.setViewportView(alienomradeinfotable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Agent kontaktuppgifter");

        jLabel43.setText("områdeschef:");

        omchefalientxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(omradescheftillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(infoomradetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(hamtaomradedata, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(omchefalientxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(omradescheftillbaka)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoomradetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hamtaomradedata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(omchefalientxt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void omradescheftillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradescheftillbakaActionPerformed
        AlienHuvudMeny meny = new AlienHuvudMeny();
        meny.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_omradescheftillbakaActionPerformed

    private void hamtaomradedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamtaomradedataActionPerformed
        alienomradeinfotable.setModel(new DefaultTableModel(null, new String[]{"Namn", "Telefon", "Omrade"}));
        omchefalientxt.setText("");
        if (Validering.textFaltHarVarde(infoomradetxt) && Validering.isHeltal(infoomradetxt)) {
            try {
                String sql = "SELECT agent.Namn, agent.Telefon, omrade.Benamning FROM agent JOIN omrade ON agent.Omrade = omrade.Omrades_ID JOIN alien ON agent.Agent_ID = alien.Ansvarig_Agent WHERE Alien_ID=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                pst = con.prepareStatement(sql);
                pst.setString(1, infoomradetxt.getText());
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String namn = rs.getString("Namn");
                    String tele = rs.getString("Telefon");
                    String omrade = rs.getString("Benamning");

                    String tbData[] = {namn, tele, omrade};
                    DefaultTableModel tblModel = (DefaultTableModel) alienomradeinfotable.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                /*String sql = "SELECT agent.Namn FROM agent JOIN omradeschef ON agent.Agent_ID = omradeschef.Agent_ID JOIN alien ON agent.Agent_ID = alien.Ansvarig_Agent JOIN omrade ON agent.Omrade = omrade.Omrades_ID WHERE alien.Alien_ID=? AND omrade.Omrades_ID = omradeschef.Omrade";*/
                String sql = "SELECT agent.Namn FROM agent JOIN omradeschef ON agent.Agent_ID = omradeschef.Agent_ID JOIN omrade ON agent.Omrade = omrade.Omrades_ID JOIN plats ON omrade.Omrades_ID = plats.Finns_I JOIN alien ON plats.Plats_ID = alien.Plats WHERE Alien_ID=? AND alien.Plats = plats.Finns_I AND agent.Agent_ID = omradeschef.Omrade";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                pst = con.prepareStatement(sql);
                pst.setString(1, infoomradetxt.getText());
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    omchefalientxt.setText(rs.getString(1));
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_hamtaomradedataActionPerformed

    private void infoomradetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoomradetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoomradetxtActionPerformed

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
            java.util.logging.Logger.getLogger(AlienVemOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienVemOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienVemOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienVemOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienVemOmradeschef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alienomradeinfotable;
    private javax.swing.JButton hamtaomradedata;
    private javax.swing.JTextField infoomradetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel omchefalientxt;
    private javax.swing.JButton omradescheftillbaka;
    // End of variables declaration//GEN-END:variables
}
