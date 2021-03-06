/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Product.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Goku
 */
public class ManageProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductJPanel
     */
    
    JPanel userProcessContainer;
    Product product;
    public ManageProductJPanel(JPanel upc, Product p) {
        initComponents();
        this.userProcessContainer = upc;
        this.product = p;
        
        productNamejTextField.setText(p.getName());
        productIDjTextField.setText(String.valueOf(p.getProductId()));
        actualpricejTextField.setText(String.valueOf(p.getActualPrice()));
        availabilityjTextField.setText(String.valueOf(p.getAvailability()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveButton1 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        productNamejTextField = new javax.swing.JTextField();
        availabilityjTextField = new javax.swing.JTextField();
        productIDjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        actualpricejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveButton1.setText("SAVE");
        saveButton1.setEnabled(false);
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        add(saveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        updateButton.setText("Update Product");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel7.setText("Availability:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));
        add(productNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 160, -1));
        add(availabilityjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 160, -1));
        add(productIDjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));

        jLabel4.setText("Product Actual Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));
        add(actualpricejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 160, -1));

        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed

        product.setName(productNamejTextField.getText());
        product.setProductId(Integer.parseInt(productIDjTextField.getText()));
        product.setActualPrice(Integer.parseInt(actualpricejTextField.getText()));
        product.setAvailability(Integer.parseInt(availabilityjTextField.getText()));
        
        productNamejTextField.setEditable(false);
        productIDjTextField.setEditable(false);
        actualpricejTextField.setEditable(false);
        availabilityjTextField.setEditable(false);

        saveButton1.setEnabled(false);

    }//GEN-LAST:event_saveButton1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        productNamejTextField.setEditable(true);
        productIDjTextField.setEditable(true);
        actualpricejTextField.setEditable(true);
        availabilityjTextField.setEditable(true);
        
        saveButton1.setEnabled(true);

    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualpricejTextField;
    private javax.swing.JTextField availabilityjTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField productIDjTextField;
    private javax.swing.JTextField productNamejTextField;
    private javax.swing.JButton saveButton1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
