/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isikulkas_tartar;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author Asus
 */

public class Item {
    private int id;
    private String name;
    private LocalDate expirationDate;
    private ImageIcon image;
    private String imageName;

    public Item(int id, String name, LocalDate expirationDate, ImageIcon image, String imageName) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.image = image;
        this.imageName = imageName;
    }


    public int getId() {
        return id;
    }
    
    public String getImageName() {
        return imageName;
    }


    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public ImageIcon getImage() {
        return image;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
