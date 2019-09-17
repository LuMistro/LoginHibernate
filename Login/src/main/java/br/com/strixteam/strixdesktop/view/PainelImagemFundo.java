/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.strixteam.strixdesktop.view;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Luiza Mistro
 */
public class PainelImagemFundo extends JPanel {

    private ImageIcon img;

    public PainelImagemFundo() {
        img = new ImageIcon();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);

    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public ImageIcon getImg() {
        return this.img;
    }

}
