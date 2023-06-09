package isikulkas_tartar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class tambah extends javax.swing.JFrame {
    private int user_id;
    int xx, xy;
    private ItemRepository itemRepository;
    
    
    /**
     * Creates new form MainPage
     */
    public dbConnection db;
    
    public tambah(int user_id) {
        this.user_id = user_id;
        itemRepository = new ItemRepository();
        initComponents();
        image_label = new JLabel();
        jPanel1.add(image_label);   
        
        // Atur ukuran image_label untuk sama dengan ukuran jPanel1
        image_label.setBounds(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        image_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        customField1 = new isikulkas_tartar.CustomField();
        jLabel4 = new javax.swing.JLabel();
        explabel = new isikulkas_tartar.CustomField();
        imagepathlabel = new isikulkas_tartar.CustomField();
        submit_button = new isikulkas_tartar.CustomButton();
        search_button = new isikulkas_tartar.CustomButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(53, 187, 202));
        mainPanel.setPreferredSize(new java.awt.Dimension(380, 661));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image_label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isikulkas_tartar/icon/cancel (2).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Megrim", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Tambah");

        jLabel1.setFont(new java.awt.Font("Megrim", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Name");

        customField1.setForeground(new java.awt.Color(153, 153, 153));
        customField1.setText("Nama Barang");
        customField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Megrim", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Expire_Date");

        explabel.setForeground(new java.awt.Color(153, 153, 153));
        explabel.setText("YYYY-MM-DD");
        explabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explabelActionPerformed(evt);
            }
        });

        imagepathlabel.setForeground(new java.awt.Color(153, 153, 153));
        imagepathlabel.setText("Image Path");
        imagepathlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagepathlabelActionPerformed(evt);
            }
        });

        submit_button.setBackground(new java.awt.Color(0, 0, 0));
        submit_button.setText("Submit");
        submit_button.setFillClick(new java.awt.Color(0, 102, 51));
        submit_button.setFillOriginal(new java.awt.Color(0, 0, 0));
        submit_button.setFont(new java.awt.Font("Megrim", 1, 12)); // NOI18N
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        search_button.setBackground(new java.awt.Color(0, 0, 0));
        search_button.setText("Search");
        search_button.setFillClick(new java.awt.Color(0, 102, 51));
        search_button.setFillDisabled(new java.awt.Color(102, 153, 255));
        search_button.setFont(new java.awt.Font("Megrim", 1, 12)); // NOI18N
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(customField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(explabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(imagepathlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagepathlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));
        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents








    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void customField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customField1ActionPerformed

    private void explabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explabelActionPerformed

    private void imagepathlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagepathlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagepathlabelActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        String itemName = customField1.getText();
        LocalDate expDate = LocalDate.parse(explabel.getText());
        String imagePath = imagepathlabel.getText();
        
         // Get only the file name and extension
        File imageFile = new File(imagePath);
        String imageName = imageFile.getName();
        
        itemRepository.saveItem(user_id, itemName, expDate, imageName);

        // Redirect to MainPage
        MainPage mainPage = new MainPage(user_id);
        mainPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submit_buttonActionPerformed
    private void setImageToPanel(File file, JPanel panel) {
        try {
            ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            image_label.setIcon(imageIcon);
            panel.revalidate();
            panel.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "jpeg"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagepathlabel.setText(selectedFile.getAbsolutePath());
            setImageToPanel(selectedFile, jPanel1);
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private isikulkas_tartar.CustomField customField1;
    private isikulkas_tartar.CustomField explabel;
    private javax.swing.JLabel image_label;
    private isikulkas_tartar.CustomField imagepathlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private isikulkas_tartar.CustomButton search_button;
    private isikulkas_tartar.CustomButton submit_button;
    // End of variables declaration//GEN-END:variables
}


