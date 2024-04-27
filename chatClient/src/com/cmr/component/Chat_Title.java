
package com.cmr.component;

import java.awt.Color;

/**
 *
 * @author Deepak
 */
public class Chat_Title extends javax.swing.JPanel {

    /**
     * Creates new form Chat_Title
     */
    public Chat_Title() {
        initComponents();
    }
    public void setUserName(String userName) {
        lbName.setText(userName);
    }

    public void statusActive() {
        lbStatus.setText("Active now");
        lbStatus.setForeground(new java.awt.Color(51, 204, 0));
    }

    public void setStatusText(String text) {
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        lbName.setForeground(new java.awt.Color(67, 67, 67));
        lbName.setText("Name");
        layer.add(lbName);

        lbStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(51, 204, 0));
        lbStatus.setText("Active Now");
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}