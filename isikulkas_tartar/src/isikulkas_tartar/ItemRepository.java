/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isikulkas_tartar;

/**
 *
 * @author Asus
 */
import java.io.File;
import java.net.MalformedURLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class ItemRepository {
    private dbConnection dbConn;

    public ItemRepository() {
        dbConn = new dbConnection();
    }

    public List<Item> getAllItems(int user_id) throws MalformedURLException {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT * FROM items WHERE user_id=" + user_id;
        ResultSet rs = dbConn.selectQuery(sql);

        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                LocalDate expirationDate = rs.getDate("expire_date").toLocalDate();
                String imageName = rs.getString("image_path");
                File file = new File("src/gambar/" + imageName);
                ImageIcon image = new ImageIcon(file.toURI().toURL());


                Item item = new Item(id, name, expirationDate, image, imageName);
                items.add(item);
                System.out.println("Item: " + name);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return items;
    }

    public void addItem(Item item) {
        String sql = "INSERT INTO items (name, expire_date, image_path) VALUES ('"
            + item.getName() + "', '"
            + item.getExpirationDate() + "', '"
            
            + item.getImageName() + "')";
        dbConn.updateQuery(sql);
    }

    public void updateItem(Item item) {
        String sql = "UPDATE items SET name = '"
            + item.getName() + "', expire_date = '"
            + item.getExpirationDate() + "', image_path = '"
            
            + item.getImageName() + "' WHERE id = " + item.getId();
        dbConn.updateQuery(sql);
    }

    public void deleteItem(int itemId) {
        String sql = "DELETE FROM items WHERE id = " + itemId;
        dbConn.updateQuery(sql);
    }

    public Item getItemById(int itemId) throws MalformedURLException {
        String sql = "SELECT * FROM items WHERE id=" + itemId;
        ResultSet rs = dbConn.selectQuery(sql);

    try {
        if (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            LocalDate expirationDate = rs.getDate("expire_date").toLocalDate();
            String imageName = rs.getString("image_path");
            File file = new File("src/gambar/" + imageName);
            ImageIcon image = new ImageIcon(file.toURI().toURL());


            return new Item(id, name, expirationDate, image, imageName);
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }

        return null;
    }
    
    public void saveItem(int user_id, String itemName, LocalDate expDate, String imagePath) {
    String sql = "INSERT INTO items (user_id, name, expire_date, image_path) VALUES ("
            + user_id + ", '"
            + itemName + "', '"
            + expDate + "', '"
            + imagePath + "')";
    dbConn.updateQuery(sql);
}


//    public Item getItem(int itemId) {
//        String sql = "SELECT * FROM items WHERE id=" + itemId;
//        ResultSet rs = dbConn.selectQuery(sql);
//
//        try {
//            if (rs.next()) {
//                // ... (the same as before)
//                String imageName = rs.getString("image_path");
//                ImageIcon image = new ImageIcon("isikulkas_tartar/scr/gambar/" + imageName);
//
//                return new Item(id, name, expirationDate, image);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return null;
//    }

}

