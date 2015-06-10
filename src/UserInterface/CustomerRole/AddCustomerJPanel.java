/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;
import Business.*;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Ketki
 */
public class AddCustomerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    CustomerDirectory customerDirectory;
    /**
     * Creates new form AddCustomerJPanel
     */
    public AddCustomerJPanel(JPanel userProcessContainer, CustomerDirectory customerDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerDirectory = customerDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namejTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backjButton2.setText("<<BACK");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        add(backjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 146, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("NEW CUSTOMER");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 24, -1, -1));

        addjButton1.setText("ADD CUSTOMER");
        addjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButton1ActionPerformed(evt);
            }
        });
        add(addjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 146, -1, -1));

        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 92, -1, -1));
        add(namejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 89, 143, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton2ActionPerformed

    private void addjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButton1ActionPerformed
        String name = namejTextField1.getText();
        
     //   Customer c = customerDirectory.addCustomer(name);

     //   c.setCustomerName(name);

    //    JOptionPane.showMessageDialog(null, "New Customer Created");
    }//GEN-LAST:event_addjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton1;
    private javax.swing.JButton backjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField namejTextField1;
    // End of variables declaration//GEN-END:variables
}
