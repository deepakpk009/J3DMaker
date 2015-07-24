/*
J3DMaker v0.1
---------------------
This software is used to convert a 2D image
to 3D image. The quality of the 3D image produced may vary.

-------------------------------------------
Developed By: Deepak pk
Email: deepakpk009@yahoo.in
-------------------------------------------
This Project is licensed under GNU LGPL.(http://www.gnu.org/licenses/lgpl.txt)
-------------------------------------------

 */
/*
 * MainWindow.java
 *
 * this class is the starting point for the project. all gui is defined in here
 *
 */

/*
 * MainWindow.java
 *
 * Created on May 3, 2012, 4:42:34 PM
 */
package com.deepak.j3dmaker.gui;

import com.deepak.j3dmaker.core.ImageMerger;
import com.deepak.j3dmaker.core.ImageResize;
import com.deepak.j3dmaker.core.MaskFilter;
import com.deepak.j3dmaker.core.PerspectiveFilter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author deepak
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();

        // set native look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FilePathTextField = new javax.swing.JTextField();
        BrowseButton = new javax.swing.JButton();
        ConvertTo3DButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        originalImagePanel = new javax.swing.JPanel();
        RFilterPanel = new javax.swing.JPanel();
        BGFilterPanel = new javax.swing.JPanel();
        RTransPanel = new javax.swing.JPanel();
        BGTransPanel = new javax.swing.JPanel();
        ThreeDPanel = new javax.swing.JPanel();
        SaveAllImagesButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("J3DMaker v0.1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowClosingEvent(evt);
            }
        });

        jLabel1.setText("Image File");

        BrowseButton.setText("Browse");
        BrowseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                browseMP(evt);
            }
        });

        ConvertTo3DButton.setText("Convert To 3D");
        ConvertTo3DButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                convertTo3dButtonMP(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Processing Images"));

        originalImagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Original Image"));

        javax.swing.GroupLayout originalImagePanelLayout = new javax.swing.GroupLayout(originalImagePanel);
        originalImagePanel.setLayout(originalImagePanelLayout);
        originalImagePanelLayout.setHorizontalGroup(
            originalImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        originalImagePanelLayout.setVerticalGroup(
            originalImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        RFilterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("R Filtered"));

        javax.swing.GroupLayout RFilterPanelLayout = new javax.swing.GroupLayout(RFilterPanel);
        RFilterPanel.setLayout(RFilterPanelLayout);
        RFilterPanelLayout.setHorizontalGroup(
            RFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        RFilterPanelLayout.setVerticalGroup(
            RFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BGFilterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("B+G Filtered"));

        javax.swing.GroupLayout BGFilterPanelLayout = new javax.swing.GroupLayout(BGFilterPanel);
        BGFilterPanel.setLayout(BGFilterPanelLayout);
        BGFilterPanelLayout.setHorizontalGroup(
            BGFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BGFilterPanelLayout.setVerticalGroup(
            BGFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        RTransPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("R Trans"));

        javax.swing.GroupLayout RTransPanelLayout = new javax.swing.GroupLayout(RTransPanel);
        RTransPanel.setLayout(RTransPanelLayout);
        RTransPanelLayout.setHorizontalGroup(
            RTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        RTransPanelLayout.setVerticalGroup(
            RTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BGTransPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("B+G Trans"));

        javax.swing.GroupLayout BGTransPanelLayout = new javax.swing.GroupLayout(BGTransPanel);
        BGTransPanel.setLayout(BGTransPanelLayout);
        BGTransPanelLayout.setHorizontalGroup(
            BGTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BGTransPanelLayout.setVerticalGroup(
            BGTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        ThreeDPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("3D Image"));

        javax.swing.GroupLayout ThreeDPanelLayout = new javax.swing.GroupLayout(ThreeDPanel);
        ThreeDPanel.setLayout(ThreeDPanelLayout);
        ThreeDPanelLayout.setHorizontalGroup(
            ThreeDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ThreeDPanelLayout.setVerticalGroup(
            ThreeDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(originalImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BGFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RTransPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BGTransPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ThreeDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originalImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BGFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RTransPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BGTransPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThreeDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SaveAllImagesButton.setText("Save All Images");
        SaveAllImagesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveAllImagesMP(evt);
            }
        });

        AboutButton.setText("About");
        AboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutButtonMP(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilePathTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BrowseButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConvertTo3DButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AboutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(SaveAllImagesButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BrowseButton, ConvertTo3DButton, SaveAllImagesButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConvertTo3DButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveAllImagesButton)
                    .addComponent(AboutButton))
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-428)/2, (screenSize.height-479)/2, 428, 479);
    }// </editor-fold>//GEN-END:initComponents
    // file object for the original image
    File f = null;

    /*
     * MyFileFilter is a file transform which filtes out all files other
     * than image files
     */
    private class MyFileFilter extends FileFilter {

        @Override
        public boolean accept(File f) {
            String name = f.getAbsolutePath();
            // only accept files with the given file extensions
            return name.endsWith(".bmp")
                    || name.endsWith(".png")
                    || name.endsWith(".jpg")
                    || name.endsWith(".jpeg")
                    || name.endsWith(".gif")
                    // shows directories also
                    || f.isDirectory();
        }

        @Override
        public String getDescription() {
            // file type name to be displayed on file chooser
            return "Image Files";
        }
    }
    BufferedImage originalImage; // the original image
    BufferedImage RFiltered; // the red colour filtered image
    BufferedImage BGFiltered; // the blue and green (cyan) colour filtered image
    BufferedImage RTrans; // the transformed (perspective transformation) red filtered image
    BufferedImage BGTrans;// the transformed (perspective transformation) cyan filtered image
    BufferedImage ThreeD; // the final 3d image

    private void browseMP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMP
        // TODO add your handling code here:
        // creating a new JFileChooser object
        JFileChooser jfc = new JFileChooser();
        // set the file transform
        jfc.setFileFilter(new MyFileFilter());
        // show the file chooser window
        int r = jfc.showOpenDialog(jLabel1);

        // on selection
        if (r == JFileChooser.APPROVE_OPTION) {
            // get the selected file
            f = jfc.getSelectedFile();
            try {
                // reaad the original image from file
                originalImage = ImageIO.read(f);
                // draw on to the panel after resizing
                originalImagePanel.getGraphics().drawImage(
                        ImageResize.resizeTrick(
                        originalImage,
                        originalImagePanel.getWidth(),
                        originalImagePanel.getHeight()), 0, 0, rootPane);
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // if no files are selected then set file as null
            f = null;
        }
        save3DImage = false;
    }//GEN-LAST:event_browseMP

    private void windowClosingEvent(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosingEvent
        // TODO add your handling code here:
        // if the images are not yet saved then ask the user to save
        if (save3DImage) {
            int r = JOptionPane.showConfirmDialog(rootPane, "3D Image Not Saved. Save?");
            // if save selected
            if (r == JOptionPane.YES_OPTION) {
                saveAllImages();
            }
        }
    }//GEN-LAST:event_windowClosingEvent
    private boolean save3DImage = false;

    private void convertTo3dButtonMP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertTo3dButtonMP
        // TODO add your handling code here:
        if (f != null) {
            // Color Mask Filtering
            // Filtering RED color component
            RFiltered = MaskFilter.filter(originalImage, 0x00ff0000);
            // printing the filtered image onto panel after resizing
            RFilterPanel.getGraphics().drawImage(
                    ImageResize.resizeTrick(
                    RFiltered,
                    RFilterPanel.getWidth(),
                    RFilterPanel.getHeight()), 0, 0, rootPane);
            // Filtering BLUE and GREEN color component
            BGFiltered = MaskFilter.filter(originalImage, 0x0000ffff);
            // printing the filtered image onto panel after resizing
            BGFilterPanel.getGraphics().drawImage(
                    ImageResize.resizeTrick(
                    BGFiltered,
                    BGFilterPanel.getWidth(),
                    BGFilterPanel.getHeight()), 0, 0, rootPane);

            // Perspective Filtering
            // applying perspective transform onto RED filtered image
            RTrans = PerspectiveFilter.transform(RFiltered, PerspectiveFilter.SHIFT_LEFT, 5);
            // printing the transformed image onto panel after resizing
            RTransPanel.getGraphics().drawImage(
                    ImageResize.resizeTrick(
                    RTrans,
                    RTransPanel.getWidth(),
                    RTransPanel.getHeight()), 0, 0, rootPane);
            // applying perspective transform onto BLUE-GREEN filtered image
            BGTrans = PerspectiveFilter.transform(BGFiltered, PerspectiveFilter.SHIFT_RIGHT, 10);
            // printing the transformed image onto panel after resizing
            BGTransPanel.getGraphics().drawImage(
                    ImageResize.resizeTrick(
                    BGTrans,
                    BGTransPanel.getWidth(),
                    BGTransPanel.getHeight()), 0, 0, rootPane);

            // Merging the two Images
            ThreeD = ImageMerger.merge(RTrans, BGTrans);
            // printing the 3d image onto the panel after resizing
            ThreeDPanel.getGraphics().drawImage(
                    ImageResize.resizeTrick(
                    ThreeD,
                    ThreeDPanel.getWidth(),
                    ThreeDPanel.getHeight()), 0, 0, rootPane);
            // setting the save3DImage flag to true
            save3DImage = true;
        } else {// if file is null then show the error message
            JOptionPane.showMessageDialog(null, "Please Select a File First !!!");
        }
    }//GEN-LAST:event_convertTo3dButtonMP

    private void saveAllImages() {
        JFileChooser jfc = new JFileChooser("Select an Empty or New Folder");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int r = jfc.showOpenDialog(jLabel1);

        if (r == JFileChooser.APPROVE_OPTION) {
            f = jfc.getSelectedFile();
            try {
                ImageIO.write(originalImage, "png", new File(f.getAbsoluteFile() + "//originalImage.png"));
                ImageIO.write(RFiltered, "png", new File(f.getAbsoluteFile() + "//RFiltered.png"));
                ImageIO.write(BGFiltered, "png", new File(f.getAbsoluteFile() + "//BGFiltered.png"));
                ImageIO.write(RTrans, "png", new File(f.getAbsoluteFile() + "//RTrans.png"));
                ImageIO.write(BGTrans, "png", new File(f.getAbsoluteFile() + "//BGTrans.png"));
                ImageIO.write(ThreeD, "png", new File(f.getAbsoluteFile() + "//ThreeD.png"));
                // resetting the save3DImage flag
                save3DImage = false;
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void saveAllImagesMP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveAllImagesMP
        // TODO add your handling code here:
        // if 3d image is created then save else print error .
        if (save3DImage) {
            saveAllImages();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No 3D Images to Save !!!");
        }
    }//GEN-LAST:event_saveAllImagesMP

    private void aboutButtonMP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMP
        // TODO add your handling code here:
        new About();
    }//GEN-LAST:event_aboutButtonMP

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JPanel BGFilterPanel;
    private javax.swing.JPanel BGTransPanel;
    private javax.swing.JButton BrowseButton;
    private javax.swing.JButton ConvertTo3DButton;
    private javax.swing.JTextField FilePathTextField;
    private javax.swing.JPanel RFilterPanel;
    private javax.swing.JPanel RTransPanel;
    private javax.swing.JButton SaveAllImagesButton;
    private javax.swing.JPanel ThreeDPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel originalImagePanel;
    // End of variables declaration//GEN-END:variables
}
