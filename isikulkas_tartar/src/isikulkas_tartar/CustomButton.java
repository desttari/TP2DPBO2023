/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isikulkas_tartar;

/**
 *
 * @author Asus
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class CustomButton extends JButton {
    
    //warna original
    private Color originalFillColor;
    private Color originalBorderColor;
    
    //warna saat di-hover
    private Color hoverFillColor;
    private Color hoverBorderColor;
    
    //warna saat diklik
    private Color clickedFillColor;
    private Color clickedBorderColor;
    
    //lebar garis
    private int strokeWidth;
    
    //variabel untuk mengetahui saat button di-hover
    private boolean isHover;
    
    public CustomButton() {
        //set default values
        originalFillColor = new Color(52, 152, 219);
        originalBorderColor = new Color(236, 240, 241);
        hoverFillColor = new Color(41, 128, 185);
        hoverBorderColor = new Color(189, 195, 199);
        clickedFillColor = new Color(211, 84, 0);
        clickedBorderColor = new Color(236, 240, 241);
        strokeWidth = 2;
        isHover = false;
        
        //set button properties
        setOpaque(false);
        setBorder(null);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBackground(originalFillColor);
        setForeground(Color.white);
        
        //add mouse listener to handle button events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                //set button colors to original when not hovered
                setBackground(originalFillColor);
                setForeground(Color.white);
                setBorderPainted(true);
                isHover = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //set button colors to hover when hovered
                setBackground(hoverFillColor);
                setForeground(Color.white);
                setBorderPainted(true);
                isHover = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //set button colors to hover when clicked and hovered
                if (isHover) {
                    setBackground(hoverFillColor);
                    setForeground(Color.white);
                    setBorderPainted(true);
                }
                //set button colors to original when clicked and not hovered
                else {
                    setBackground(originalFillColor);
                    setForeground(Color.white);
                    setBorderPainted(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //set button colors to clicked when clicked
                setBackground(clickedFillColor);
                setForeground(Color.white);
                setBorderPainted(true);
            }
        });
    }
    
    //getter dan setter untuk warna dan lebar garis
    public Color getFillOriginal() {
        return originalFillColor;
    }

    public void setFillOriginal(Color fillOriginal) {
        this.originalFillColor = fillOriginal;
    }

    public Color getFillOver() {
        return hoverFillColor;
    }

    public void setFillOver(Color fillOver) {
        this.hoverFillColor = fillOver;
    }

    public Color getFillClick() {
        return clickedFillColor;
    }

    public void setFillClick(Color fillClick) {
        this.clickedFillColor = fillClick;
    }

    public Color getFillDisabled() {
        return originalFillColor;
    }

    public void setFillDisabled(Color fillDisabled) {
        this.originalFillColor = fillDisabled;
    }

    public Color getLineOriginal() {
        return originalBorderColor;
    }

    public void setLineOriginal(Color lineOriginal) {
        this.originalBorderColor = lineOriginal;
    }

    public Color getLineOver() {
        return hoverBorderColor;
    }

    public void setLineOver(Color lineOver) {
        this.hoverBorderColor = lineOver;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s = strokeWidth;
            int w = getWidth() - (2 * s);
            int h = getHeight() - (2 * s);
            //gambar background
            if (getModel().isPressed()) {
            g2d.setColor(clickedFillColor);
            } else if (getModel().isRollover()) {
            g2d.setColor(hoverFillColor);
            } else {
            g2d.setColor(originalFillColor);
            }
            g2d.fillRoundRect(s, s, w, h, h, h);
            //gambar border
            g2d.setStroke(new BasicStroke(s));
            if (getModel().isPressed()) {
            g2d.setColor(clickedBorderColor);
            } else if (getModel().isRollover()) {
            g2d.setColor(hoverBorderColor);
            } else {
            g2d.setColor(originalBorderColor);
            }
            g2d.drawRoundRect(s, s, w, h, h, h);
            }
            super.paintComponent(g);
        }
    }

    
        

