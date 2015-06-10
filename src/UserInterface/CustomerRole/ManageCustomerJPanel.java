/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ketki
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    CustomerDirectory customerdir;
    
    /**
     * Creates new form ManageCustomerJPanel
     */
    public ManageCustomerJPanel(JPanel userProcessContainer, CustomerDirectory customerDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.customerdir = customerDirectory;
        
        refreshjButton1ActionPerformed(null);
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
        supplierjTable1 = new javax.swing.JTable();
        addCustomerjButton = new javax.swing.JButton();
        viewjButton2 = new javax.swing.JButton();
        removejButton1 = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();
        refreshjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierjTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 75, 352, 97));

        addCustomerjButton.setText("Add Customer");
        addCustomerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerjButtonActionPerformed(evt);
            }
        });
        add(addCustomerjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 210, -1, -1));

        viewjButton2.setText("View Customer");
        viewjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButton2ActionPerformed(evt);
            }
        });
        add(viewjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 210, -1, -1));

        removejButton1.setText("Remove");
        removejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButton1ActionPerformed(evt);
            }
        });
        add(removejButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 210, -1, -1));

        backjButton2.setText("<<Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        add(backjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 210, -1, -1));

        refreshjButton1.setText("Refresh");
        refreshjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButton1ActionPerformed(evt);
            }
        });
        add(refreshjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 41, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Customers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 234, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerjButtonActionPerformed

        AddCustomerJPanel acjp = new AddCustomerJPanel(userProcessContainer, customerdir);
        userProcessContainer.add("AddCustomerJPanel", acjp);

        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addCustomerjButtonActionPerformed

    private void viewjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButton2ActionPerformed

        int selectedRow = supplierjTable1.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        Customer cus = (Customer)supplierjTable1.getValueAt(selectedRow, 0);

        ViewCustomerDetailsJPanel vcjp = new ViewCustomerDetailsJPanel(userProcessContainer, cus);
        userProcessContainer.add("AdministrativeViewSupplierDetailsJPanel",vcjp);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewjButton2ActionPerformed

    private void removejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButton1ActionPerformed

        if(supplierjTable1.getSelectedRowCount() == 0){
            return;
        }
        int selectedRow = supplierjTable1.getSelectedRow();

        Customer c = (Customer)supplierjTable1.getValueAt(selectedRow, 0);

     //   customerdir.removeCustomer(c);

        refreshjButton1ActionPerformed(null);

    }//GEN-LAST:event_removejButton1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backjButton2ActionPerformed

    private void refreshjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButton1ActionPerformed
        // TODO add your handling code here:
        int rowCount = supplierjTable1.getRowCount();
        for(int i = rowCount - 1; i>=0; i--){
            ((DefaultTableModel)supplierjTable1.getModel()).removeRow(i);
        }

        ArrayList<Customer> customerList = customerdir.getCustomerList();
        for(Customer c: customerList){
            Object row[] = new Object[1];
            row[0] = c;

            ((DefaultTableModel)supplierjTable1.getModel()).addRow(row);
        }

    }//GEN-LAST:event_refreshjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerjButton;
    private javax.swing.JButton backjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshjButton1;
    private javax.swing.JButton removejButton1;
    private javax.swing.JTable supplierjTable1;
    private javax.swing.JButton viewjButton2;
    // End of variables declaration//GEN-END:variables
}
