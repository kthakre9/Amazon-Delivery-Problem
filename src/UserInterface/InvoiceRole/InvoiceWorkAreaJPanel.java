/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InvoiceRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PackagingManagementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PackagingWorkRequest;
import Business.WorkQueue.PaymentWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.PackagingRole.PackagingProcessRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ketki
 */
public class InvoiceWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise system;
    private UserAccount userAccount;
    /**
     * Creates new form InvoiceWorkAreaJPanel
     */
    public InvoiceWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount userAcccount, Enterprise system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAcccount;
        this.system = system;
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
            row[4] = ((PaymentWorkRequest)workRequest).getAmountPaid();
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
        messagejTextField = new javax.swing.JTextField();
        proceedPackagingjButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 55, -1, 102));

        assigntoMejButton.setText("Assign to Me");
        assigntoMejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigntoMejButtonActionPerformed(evt);
            }
        });
        add(assigntoMejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        processRequestjButton.setText("Process Request");
        processRequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestjButtonActionPerformed(evt);
            }
        });
        add(processRequestjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        backjButton5.setText("<< Back");
        backjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton5ActionPerformed(evt);
            }
        });
        add(backjButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(messagejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 170, -1));

        proceedPackagingjButton.setText("Proceed to Packaging");
        proceedPackagingjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedPackagingjButtonActionPerformed(evt);
            }
        });
        add(proceedPackagingjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 150, -1));
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

        PackagingProcessRequestJPanel prjp = new PackagingProcessRequestJPanel(workRequest, userProcessContainer);
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

    private void proceedPackagingjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedPackagingjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = labAssistantjTable.getSelectedRow();
        if(selectedRow < 0)
        {
            return;
        }

        WorkRequest workRequest = (WorkRequest) labAssistantjTable.getValueAt(selectedRow, 0); 
        
        
      PackagingWorkRequest packagingWorkRequest = new PackagingWorkRequest();
        packagingWorkRequest.setSender(userAccount);
        packagingWorkRequest.setMessage(messagejTextField.getText());
        packagingWorkRequest.setStatus("Sent");

        Organization packagingOrganization = null;
        for(Organization o : system.getOrganizationDirectory().getOrganizationList())
        {
            if(o instanceof PackagingManagementOrganization)
            {
                packagingOrganization = o;
            }
        }
        packagingOrganization.getWorkQueue().getWorkRequestList().add(packagingWorkRequest);
        userAccount.getWorkQueue().getWorkRequestList().add(packagingWorkRequest);
        populateTable(); 
        
        
    }//GEN-LAST:event_proceedPackagingjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assigntoMejButton;
    private javax.swing.JButton backjButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labAssistantjTable;
    private javax.swing.JTextField messagejTextField;
    private javax.swing.JButton proceedPackagingjButton;
    private javax.swing.JButton processRequestjButton;
    // End of variables declaration//GEN-END:variables
}
