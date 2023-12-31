/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_start;

import mib_alien.AlienHuvudMeny;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(omradescheftillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(infoomradetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(hamtaomradedata, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(omradescheftillbaka)
                .addGap(20, 20, 20)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoomradetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hamtaomradedata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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
        try {
            String sql = "SELECT agent.Namn, agent.Telefon, Benamning FROM agent JOIN omrade ON agent.Omrade = omrade.Omrades_ID JOIN alien ON agent.Agent_ID = alien.Ansvarig_Agent WHERE Alien_ID=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb","mibdba","mibkey");
            pst = con.prepareStatement(sql);
            pst.setString(1, infoomradetxt.getText());
            ResultSet rs=pst.executeQuery();

            while (rs.next()) {
                String namn = rs.getString("Namn");
                String tele = rs.getString("Telefon");
                String omrade = rs.getString("Benamning");

                String tbData[] = {namn, tele, omrade};
                DefaultTableModel tblModel = (DefaultTableModel)alienomradeinfotable.getModel();

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton omradescheftillbaka;
    // End of variables declaration//GEN-END:variables
}
