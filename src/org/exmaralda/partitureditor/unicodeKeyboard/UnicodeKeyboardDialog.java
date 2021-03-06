/*
 * UnicodeKeyboardDialog.java
 *
 * Created on 6. Februar 2002, 14:19
 */

package org.exmaralda.partitureditor.unicodeKeyboard;

/**
 *
 * @author  Thomas
 */
public class UnicodeKeyboardDialog extends javax.swing.JDialog {

    UnicodeKeyboardPanel kbPanel;
    
    /** Creates new form UnicodeKeyboardDialog */
    public UnicodeKeyboardDialog(java.awt.Frame parent, boolean modal, String[] externalCharsets, String defaultFontName) {
        super(parent, modal);
        initComponents();
        kbPanel = new UnicodeKeyboardPanel(externalCharsets, defaultFontName);
        this.getContentPane().add(kbPanel,javax.swing.SwingUtilities.CENTER); 
        pack();        
        org.exmaralda.common.helpers.Internationalizer.internationalizeDialogToolTips(this);
    }
    
    public UnicodeKeyboardPanel getKeyboardPanel(){
        return kbPanel;
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents

        setTitle("Keyboard");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        pack();
    }//GEN-END:initComponents

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    public void show(){
        super.show();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = this.getPreferredSize();
        this.setLocation(0, screenSize.height - dialogSize.height - 30);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
