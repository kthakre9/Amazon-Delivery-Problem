/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManageSuppliers.java
 *
 * Created on Oct 1, 2011, 11:09:26 AM
 */

package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Rushabh
 */
public class ManageSuppliersJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SupplierDirectory supplierDir;
    EcoSystem system;
    
    /** Creates new form ManageSuppliers */
    public ManageSuppliersJPanel(JPanel userProcessContainer, SupplierDirectory supplierDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDir = supplierDir;
        
        refreshjButton1ActionPerformed(null);
        
    }

  

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierjTable1 = new javax.swing.JTable();
        refreshjButton1 = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();
        removejButton1 = new javax.swing.JButton();
        viewjButton2 = new javax.swing.JButton();
        addsupplierjButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name"
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
        supplierjTable1.getColumnModel().getColumn(0).setResizable(false);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 60, 352, 97));

        refreshjButton1.setText("Refresh");
        refreshjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButton1ActionPerformed(evt);
            }
        });
        add(refreshjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 26, -1, -1));

        backjButton2.setText("<<Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        add(backjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 195, -1, -1));

        removejButton1.setText("Remove");
        removejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButton1ActionPerformed(evt);
            }
        });
        add(removejButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 195, -1, -1));

        viewjButton2.setText("View Supplier");
        viewjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButton2ActionPerformed(evt);
            }
        });
        add(viewjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 195, -1, -1));

        addsupplierjButton3.setText("Add Supplier");
        addsupplierjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsupplierjButton3ActionPerformed(evt);
            }
        });
        add(addsupplierjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 195, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButton1ActionPerformed
        // TODO add your handling code here:
        int rowCount = supplierjTable1.getRowCount();
        for(int i = rowCount - 1; i>=0; i--){
            ((DefaultTableModel)supplierjTable1.getModel()).removeRow(i);
        }
        
        ArrayList<Supplier> supplierList = supplierDir.getSupplierList();
        for(Supplier s: supplierList){
            Object row[] = new Object[1];
            row[0] = s;
            
            ((DefaultTableModel)supplierjTable1.getModel()).addRow(row);
        }
        
    }//GEN-LAST:event_refreshjButton1ActionPerformed

    private void addsupplierjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsupplierjButton3ActionPerformed
        
        AddSupplierJPanel asjp = new AddSupplierJPanel(userProcessContainer, supplierDir, system);
        userProcessContainer.add("AddSupplierJPanel", asjp);
        
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addsupplierjButton3ActionPerformed

    private void viewjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButton2ActionPerformed
        
        int selectedRow = supplierjTable1.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        Supplier supplier = (Supplier)supplierjTable1.getValueAt(selectedRow, 0);
        
        AdministrativeViewSupplierDetailsJPanel vjp = new AdministrativeViewSupplierDetailsJPanel(userProcessContainer,supplier);
        userProcessContainer.add("AdministrativeViewSupplierDetailsJPanel",vjp);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewjButton2ActionPerformed

    private void removejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButton1ActionPerformed
        
        if(supplierjTable1.getSelectedRowCount() == 0){
            return;
        }
        int selectedRow = supplierjTable1.getSelectedRow();
        
        Supplier s = (Supplier)supplierjTable1.getValueAt(selectedRow, 0);
        
        supplierDir.removeSupplier(s);
        
        refreshjButton1ActionPerformed(null);
        
    }//GEN-LAST:event_removejButton1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
    }//GEN-LAST:event_backjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsupplierjButton3;
    private javax.swing.JButton backjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshjButton1;
    private javax.swing.JButton removejButton1;
    private javax.swing.JTable supplierjTable1;
    private javax.swing.JButton viewjButton2;
    // End of variables declaration//GEN-END:variables

}
