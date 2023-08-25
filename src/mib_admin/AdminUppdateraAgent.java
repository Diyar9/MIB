/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mib_verktyg.Validering;
import mib_verktyg.Agent;

/**
 *
 * @author Pc
 */
public class AdminUppdateraAgent extends javax.swing.JFrame {

    /**
     * Creates new form AdminUppdateraAgent
     */
    public AdminUppdateraAgent() {
        initComponents();
        this.setLocationRelativeTo(null);
        visa_agent();
        adminupdidtxt.setEnabled(false);
    }

    public ArrayList<Agent> agentList() {
        ArrayList<Agent> agentsList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM agent";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            Agent agent;
            while (rs.next()) {
                agent = new Agent(rs.getInt("Agent_ID"), rs.getInt("Omrade"), rs.getString("Namn"), rs.getString("Telefon"), rs.getString("Anstallningsdatum"), rs.getString("Administrator"), rs.getString("Losenord"));
                agentsList.add(agent);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return agentsList;
    }

    public void visa_agent() {
        ArrayList<Agent> list = agentList();
        DefaultTableModel model = (DefaultTableModel) visaValdRadTabellAgentAdmin.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getagentid();
            row[1] = list.get(i).getnamn();
            row[2] = list.get(i).gettelefon();
            row[3] = list.get(i).getanstallningsdatum();
            row[4] = list.get(i).getadministrator();
            row[5] = list.get(i).getlosenord();
            row[6] = list.get(i).getomrade();
            model.addRow(row);
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

        adminuppdateratillbakatbtn1 = new javax.swing.JButton();
        adminupdidtxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        adminupdagentlosentxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        adminupdagentomradetxt = new javax.swing.JTextField();
        adminupdteletxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        adminupdansdatumtxt = new javax.swing.JTextField();
        txt = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        janejbox = new javax.swing.JComboBox<>();
        adminupdnamntxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        updbytebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        janejtxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visaValdRadTabellAgentAdmin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminuppdateratillbakatbtn1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        adminuppdateratillbakatbtn1.setText("Tillbaka");
        adminuppdateratillbakatbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminuppdateratillbakatbtn1ActionPerformed(evt);
            }
        });

        adminupdidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminupdidtxtActionPerformed(evt);
            }
        });

        jLabel19.setText("Agent ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Uppdatera agent");

        jLabel23.setText("Lösenord:");

        jLabel22.setText("Administrator:");

        txt.setText("Telefon:");

        jLabel21.setText("Anställningsdatum:");

        janejbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Ja", "Nej" }));
        janejbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janejboxActionPerformed(evt);
            }
        });

        adminupdnamntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminupdnamntxtActionPerformed(evt);
            }
        });

        jLabel20.setText("Namn:");

        updbytebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updbytebtn.setText("Uppdatera");
        updbytebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updbytebtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Områdes ID:");

        janejtxt.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N

        visaValdRadTabellAgentAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Agent ID", "Namn", "Telefon", "Datum", "Administator", "Lösenord", "Områdes ID"
            }
        ));
        visaValdRadTabellAgentAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visaValdRadTabellAgentAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(visaValdRadTabellAgentAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(txt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(janejbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(adminupdansdatumtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(adminupdteletxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminupdnamntxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminupdidtxt, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(adminuppdateratillbakatbtn1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(janejtxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminupdagentomradetxt)
                            .addComponent(adminupdagentlosentxt))
                        .addGap(605, 605, 605))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(updbytebtn))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminuppdateratillbakatbtn1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(janejtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminupdidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminupdnamntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminupdteletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminupdansdatumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addGap(8, 8, 8)
                                .addComponent(janejbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel23))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminupdagentlosentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminupdagentomradetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(updbytebtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminuppdateratillbakatbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminuppdateratillbakatbtn1ActionPerformed
        AdminAgentInfo meny = new AdminAgentInfo();
        meny.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminuppdateratillbakatbtn1ActionPerformed

    private void janejboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janejboxActionPerformed
        if (janejbox.getSelectedItem().equals("Ja")) {
            janejtxt.setText("J");
        } else if (janejbox.getSelectedItem().equals("Nej")) {
            janejtxt.setText("N");
        }
    }//GEN-LAST:event_janejboxActionPerformed

    private void adminupdnamntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminupdnamntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminupdnamntxtActionPerformed

    private void updbytebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updbytebtnActionPerformed
        if (Validering.textFaltHarVarde(adminupdnamntxt) && Validering.textFaltHarVarde(adminupdteletxt) && Validering.textFaltHarVarde(adminupdansdatumtxt) && Validering.giltigtDatum(adminupdansdatumtxt) && Validering.textFaltHarVarde(adminupdagentlosentxt) && Validering.textFaltHarVarde(adminupdagentomradetxt) && Validering.isHeltal(adminupdagentomradetxt) && Validering.textFaltHarVarde(adminupdidtxt) && Validering.isHeltal(adminupdidtxt)) {
            try {
                String sql = "UPDATE agent SET Namn=?, Telefon=?, Anstallningsdatum=?, Administrator=?, losenord=?, Omrade=? WHERE Agent_ID=?";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, adminupdnamntxt.getText());
                pst.setString(2, adminupdteletxt.getText());
                pst.setString(3, adminupdansdatumtxt.getText());
                pst.setString(4, janejtxt.getText());
                pst.setString(5, adminupdagentlosentxt.getText());
                pst.setString(6, adminupdagentomradetxt.getText());
                pst.setString(7, adminupdidtxt.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Uppdaterad agent");
                AdminAgentInfo meny = new AdminAgentInfo();
                meny.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vald agent/kolumn existerar ej!");
            }
        }
    }//GEN-LAST:event_updbytebtnActionPerformed

    private void visaValdRadTabellAgentAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visaValdRadTabellAgentAdminMouseClicked
        int i = visaValdRadTabellAgentAdmin.getSelectedRow();
        TableModel model = visaValdRadTabellAgentAdmin.getModel();
        adminupdidtxt.setText(model.getValueAt(i, 0).toString());
        adminupdnamntxt.setText(model.getValueAt(i, 1).toString());
        adminupdteletxt.setText(model.getValueAt(i, 2).toString());
        adminupdansdatumtxt.setText(model.getValueAt(i, 3).toString());
        String janej = model.getValueAt(i, 4).toString();
        switch (janej) {
            case "J":
                janejbox.setSelectedIndex(1);
                break;
            case "N":
                janejbox.setSelectedIndex(2);
                break;
        }
        adminupdagentlosentxt.setText(model.getValueAt(i, 5).toString());
        adminupdagentomradetxt.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_visaValdRadTabellAgentAdminMouseClicked

    private void adminupdidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminupdidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminupdidtxtActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUppdateraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUppdateraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUppdateraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUppdateraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUppdateraAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminupdagentlosentxt;
    private javax.swing.JTextField adminupdagentomradetxt;
    private javax.swing.JTextField adminupdansdatumtxt;
    private javax.swing.JTextField adminupdidtxt;
    private javax.swing.JTextField adminupdnamntxt;
    private javax.swing.JTextField adminupdteletxt;
    private javax.swing.JButton adminuppdateratillbakatbtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> janejbox;
    private javax.swing.JLabel janejtxt;
    private javax.swing.JLabel txt;
    private javax.swing.JButton updbytebtn;
    private javax.swing.JTable visaValdRadTabellAgentAdmin;
    // End of variables declaration//GEN-END:variables
}
