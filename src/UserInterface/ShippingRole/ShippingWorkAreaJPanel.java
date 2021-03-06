/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ShippingRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShippingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ketki
 */
public class ShippingWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise business;
    private UserAccount userAccount;
    /**
     * Creates new form ShippingWorkAreaJPanel
     */
    public ShippingWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount userAcccount, Enterprise business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAcccount;
        this.business = business;
        this.organization = organization;
        
        populateTable();
    }

    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel)labAssistantjTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new Object[5];
            row[0] = workRequest;
            row[1] = workRequest.getSender().getEmployee().getName();
          
            UserAccount receiver = workRequest.getReceiver();
            row[2]= receiver == null ? "" :receiver.getEmployee().getName();
            
         //   row[2] = workRequest.getReciever().getEmployee().getName();
            row[3] = workRequest.getStatus();
            row[4] = ((ShippingWorkRequest)workRequest).getNewmessage();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        labAssistantjTable = new javax.swing.JTable();
        assigntoMejButton = new javax.swing.JButton();
        processRequestjButton = new javax.swing.JButton();
        backjButton5 = new javax.swing.JButton();

        labAssistantjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Reciever", "Status", "Test Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(labAssistantjTable);

        assigntoMejButton.setText("Assign to Me");
        assigntoMejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigntoMejButtonActionPerformed(evt);
            }
        });

        processRequestjButton.setText("Process Request");
        processRequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestjButtonActionPerformed(evt);
            }
        });

        backjButton5.setText("<< Back");
        backjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 69, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(assigntoMejButton)
                            .addGap(87, 87, 87)
                            .addComponent(processRequestjButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(backjButton5)))
                    .addGap(0, 69, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 79, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(assigntoMejButton)
                        .addComponent(processRequestjButton))
                    .addGap(47, 47, 47)
                    .addComponent(backjButton5)
                    .addGap(0, 80, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assigntoMejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigntoMejButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = labAssistantjTable.getSelectedRow();
        if(selectedRow < 0)
        {
            return;
        }

        WorkRequest workRequest = (WorkRequest) labAssistantjTable.getValueAt(selectedRow, 0);
        workRequest.setReceiver(userAccount);
        workRequest.setStatus("Pending");

        populateTable();
    }//GEN-LAST:event_assigntoMejButtonActionPerformed

    private void processRequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = labAssistantjTable.getSelectedRow();
        if(selectedRow < 0)
        {
            return;
        }

        WorkRequest workRequest = (WorkRequest) labAssistantjTable.getValueAt(selectedRow, 0);
        workRequest.setStatus("Processing");

        ShippingProcessRequestJPanel prjp = new ShippingProcessRequestJPanel(workRequest, userProcessContainer);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("ProcessRequestJPanel", prjp);
        cardLayout.next(userProcessContainer);

        populateTable();
    }//GEN-LAST:event_processRequestjButtonActionPerformed

    private void backjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton5ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assigntoMejButton;
    private javax.swing.JButton backjButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labAssistantjTable;
    private javax.swing.JButton processRequestjButton;
    // End of variables declaration//GEN-END:variables
}
