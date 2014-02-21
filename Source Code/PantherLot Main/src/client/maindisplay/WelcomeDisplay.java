/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WelcomeDisplay.java
 *
 * Created on Jul 26, 2011, 11:32:00 AM
 */
package client.maindisplay;

import server.storage.ParkedUsers;

/**
 *
 * @author Abraham
 */
public class WelcomeDisplay extends javax.swing.JFrame implements Form {

    private boolean action = false;
    private String userType = "";
    private String userID = "";
    
    /** Creates new form WelcomeDisplay */
    public WelcomeDisplay() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        scanIDButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        handicapButton = new javax.swing.JButton();
        guestButton = new javax.swing.JButton();
        textFieldID = new javax.swing.JTextField();
        enterIDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        scanIDButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scanIDButton.setText("Scan ID");
        scanIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanIDButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(65, 31, 0, 0);
        getContentPane().add(scanIDButton, gridBagConstraints);

        titleLabel.setFont(new java.awt.Font("Tahoma", 3, 20));
        titleLabel.setText("PantherLot Interactive");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 139, 0, 0);
        getContentPane().add(titleLabel, gridBagConstraints);

        handicapButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        handicapButton.setText("Handicap");
        handicapButton.setMaximumSize(new java.awt.Dimension(67, 25));
        handicapButton.setMinimumSize(new java.awt.Dimension(67, 25));
        handicapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handicapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(75, 130, 61, 0);
        getContentPane().add(handicapButton, gridBagConstraints);

        guestButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guestButton.setText("Guest");
        guestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(75, 1, 61, 118);
        getContentPane().add(guestButton, gridBagConstraints);

        textFieldID.setFont(new java.awt.Font("Tahoma", 0, 14));
        textFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(65, 18, 0, 0);
        getContentPane().add(textFieldID, gridBagConstraints);

        enterIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        enterIDLabel.setText("Please Enter ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(65, 90, 0, 0);
        getContentPane().add(enterIDLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textFieldIDActionPerformed

    private void scanIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanIDButtonActionPerformed
        // TODO add your handling code here:
        userID = this.textFieldID.getText();
        userType = "FiuParkingUser";
        action = true;
    }//GEN-LAST:event_scanIDButtonActionPerformed

    private void guestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestButtonActionPerformed
        // TODO add your handling code here:
        userType = "guest";
        action = true;
    }//GEN-LAST:event_guestButtonActionPerformed

    private void handicapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handicapButtonActionPerformed
        // TODO add your handling code here:
        userType = "handicap";
        action = true;
    }//GEN-LAST:event_handicapButtonActionPerformed

    /**
     * accessors
     * @return the user type depending on the button pressed by the user
     */
    public String getType()
    {
        return userType;
    }
    
    /**
     * accessors
     * @return the ID input by the user on the scan id simulation text field
     */
    public String getID()
    {
        return userID;
    }   
    
    @Override
    synchronized public boolean displayNext()
    {
        if(action)
        {
            this.setVisible(false);
        }
        return action;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WelcomeDisplay().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterIDLabel;
    private javax.swing.JButton guestButton;
    private javax.swing.JButton handicapButton;
    private javax.swing.JButton scanIDButton;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
