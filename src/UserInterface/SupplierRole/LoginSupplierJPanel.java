/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Goku
 */
public class LoginSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginSupplierJPanelJPanel
     */
    
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    
    public LoginSupplierJPanel( JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
        
        //populate the combobox
         supplierComboBox1.removeAllItems();
        
        for(Supplier s: supplierDirectory.getSupplierList()){
            supplierComboBox1.addItem(s);
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

        supplierComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        findButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(supplierComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 30));

        jLabel1.setText("Supplier Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Supplier Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        findButton1.setText("GO>>");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });
        add(findButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
        Supplier selectedSupplier = (Supplier) supplierComboBox1.getSelectedItem();

        SupplierWorkAreaJPanel swajp = new SupplierWorkAreaJPanel(userProcessContainer, selectedSupplier);
        userProcessContainer.add("SupplierWorkAreaJPanel", swajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_findButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox1;
    // End of variables declaration//GEN-END:variables
}