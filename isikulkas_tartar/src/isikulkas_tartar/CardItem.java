/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isikulkas_tartar;

/**
 *
 * @author Asus
 */
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardItem extends JPanel {
    private Item item;
    private final int user_id;
    private MainPage mainPage = null;

    public CardItem(Item item, int user_id, MainPage mainPage) {
        this.item = item;
        this.user_id = user_id;
        this.mainPage = mainPage;
        setPreferredSize(new Dimension(350, 80));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Panel untuk gambar
        JPanel imagePanel = new JPanel();
        imagePanel.setPreferredSize(new Dimension(80, 80));
        JLabel imageLabel = new JLabel();
        ImageIcon scaledImage = new ImageIcon(item.getImage().getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        imageLabel.setIcon(scaledImage);
        imagePanel.add(imageLabel);

        // Panel untuk nama dan tanggal kadaluwarsa
        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        JLabel nameLabel = new JLabel(item.getName());
        JLabel dateLabel = new JLabel(item.getExpirationDate().toString());
        infoPanel.add(nameLabel);
        infoPanel.add(dateLabel);

        // Panel untuk tombol
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
        JButton editButton = new JButton("Edit");
        editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                editpage EditPage = null;
                try {
                    EditPage = new editpage(user_id, item.getId());
                } catch (MalformedURLException ex) {
                    Logger.getLogger(CardItem.class.getName()).log(Level.SEVERE, null, ex);
                }
                EditPage.setVisible(true);
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    deleteItem(item, user_id);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(CardItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        // Gabungkan semua panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(infoPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.EAST);
        add(imagePanel, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);

    }

    private void deleteItem(Item item, int user_id) throws MalformedURLException {
        ItemRepository itemRepository = new ItemRepository();
        itemRepository.deleteItem(item.getId());
        mainPage.refreshItems();
    }
}

