
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smarks
 */
public class VolumeDatasetProcessor extends javax.swing.JFrame {

    /**
     * Creates new form VolumeDatasetProcessor
     */
    public VolumeDatasetProcessor() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        menuBarMain = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemOpenFile = new javax.swing.JMenuItem();
        menuItemSaveFile = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemQuit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        javax.swing.JPanel pnlMain = new javax.swing.JPanel();
        javax.swing.JLabel lblFilename = new javax.swing.JLabel();
        txtFilename = new javax.swing.JTextField();
        javax.swing.JButton btnSelectFile = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JLabel lblSizeX = new javax.swing.JLabel();
        txtSizeX = new javax.swing.JTextField();
        javax.swing.JLabel lblSizeY = new javax.swing.JLabel();
        txtSizeY = new javax.swing.JTextField();
        javax.swing.JLabel lblSizeZ = new javax.swing.JLabel();
        txtSizeZ = new javax.swing.JTextField();
        javax.swing.JPanel pnlStatus = new javax.swing.JPanel();
        javax.swing.JSeparator sepStatus = new javax.swing.JSeparator();
        lblStatus = new javax.swing.JLabel();

        menuFile.setText("File");

        menuItemOpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemOpenFile.setMnemonic('o');
        menuItemOpenFile.setText("Load");
        menuItemOpenFile.setActionCommand("loadFile");
        menuItemOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenFileActionPerformed(evt);
            }
        });
        menuFile.add(menuItemOpenFile);

        menuItemSaveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSaveFile.setText("Save");
        menuItemSaveFile.setActionCommand("saveFile");
        menuItemSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveFileActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSaveFile);
        menuFile.add(jSeparator3);

        menuItemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemQuit.setText("Quit");
        menuItemQuit.setActionCommand("saveFile");
        menuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQuitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemQuit);

        menuBarMain.add(menuFile);

        menuEdit.setText("Edit");
        menuBarMain.add(menuEdit);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Volume Dataset Processor");
        getContentPane().setLayout(new java.awt.BorderLayout(0, 5));

        pnlMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        java.awt.GridBagLayout pnlMainLayout = new java.awt.GridBagLayout();
        pnlMainLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
        pnlMainLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        pnlMain.setLayout(pnlMainLayout);

        lblFilename.setLabelFor(txtSizeX);
        lblFilename.setText("Filename:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlMain.add(lblFilename, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        pnlMain.add(txtFilename, gridBagConstraints);

        btnSelectFile.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        pnlMain.add(btnSelectFile, gridBagConstraints);
        btnSelectFile.getAccessibleContext().setAccessibleName("selectFile");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlMain.add(jSeparator1, gridBagConstraints);

        lblSizeX.setLabelFor(txtSizeX);
        lblSizeX.setText("X Size:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlMain.add(lblSizeX, gridBagConstraints);

        txtSizeX.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        pnlMain.add(txtSizeX, gridBagConstraints);

        lblSizeY.setLabelFor(txtSizeY);
        lblSizeY.setText("Y Size:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlMain.add(lblSizeY, gridBagConstraints);

        txtSizeY.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        pnlMain.add(txtSizeY, gridBagConstraints);

        lblSizeZ.setLabelFor(txtSizeZ);
        lblSizeZ.setText("Z Size:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlMain.add(lblSizeZ, gridBagConstraints);

        txtSizeZ.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        pnlMain.add(txtSizeZ, gridBagConstraints);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pnlStatus.setLayout(new java.awt.BorderLayout());
        pnlStatus.add(sepStatus, java.awt.BorderLayout.PAGE_START);

        lblStatus.setText("Status");
        lblStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlStatus.add(lblStatus, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlStatus, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void menuItemOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemOpenFileActionPerformed

    private void menuItemSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSaveFileActionPerformed

    private void menuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQuitActionPerformed
        quit();
    }//GEN-LAST:event_menuItemQuitActionPerformed

    private void quit()
    {
        // Source: https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        // this will make sure WindowListener.windowClosing() et al. will be called.
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);

        // this will hide and dispose the frame, so that the application quits by
        // itself if there is nothing else around. 
        setVisible(false);
        dispose();
        // if you have other similar frames around, you should dispose them, too.

        // finally, call this to really exit. 
        // i/o libraries such as WiiRemoteJ need this. 
        // also, this is what swing does for JFrame.EXIT_ON_CLOSE
        System.exit(0); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
/*
        java.awt.EventQueue.invokeLater(() -> {
            new VolumeDatasetProcessor().setVisible(true);
        });
*/
        try
        {
            VolumeDataReader r = new VolumeDataReader(new File("./mri-david-312x384x208-filtered.draw"), new Vector3i(312, 384, 208));
            r.setProgressListener(new StdOutListener());
            VolumeData v = r.readData();
            VolumeFilter_Crop c = new VolumeFilter_Crop(new Vector3i(), new Vector3i(312, 384*65/100, 208));
            v = c.filter(v);
            VolumeDataWriter w = new VolumeDataWriter(new File("./mri.vox"));
            w.setProgressListener(new StdOutListener());
            w.write(v);
        } 
        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    private static class StdOutListener implements IProgressListener
    {
        @Override
        public void updateProgress(float percent)
        {
            System.out.printf("%.0f\r", percent);
            if (percent >= 100.0f) System.out.println();
            System.out.flush();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemOpenFile;
    private javax.swing.JMenuItem menuItemQuit;
    private javax.swing.JMenuItem menuItemSaveFile;
    private javax.swing.JTextField txtFilename;
    private javax.swing.JTextField txtSizeX;
    private javax.swing.JTextField txtSizeY;
    private javax.swing.JTextField txtSizeZ;
    // End of variables declaration//GEN-END:variables
}
