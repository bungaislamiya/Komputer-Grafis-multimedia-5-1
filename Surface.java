/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika051;

/**
 *
 * @author lenovo
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surface extends JPanel {
    
    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setPaint(new Color(150, 150, 100));
        
        /* koordinat object - awal0 */
        String s = "Object ke-0";
        g2d.drawString(s, 15, 15);
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(200, 150, 100));
        s = "Tranlasi ke-1";
        g2d.drawString(s, 140, 15);
        g2d.translate(120, 0); // posisi tranlasi
        // koordinat object - target1
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(100, 150, 100));
        s = "Tranlasi ke-2";
        g2d.drawString(s, 160, 15);
        g2d.translate(140, 0); // posisi tranlasi
        // koordinat object - target2
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.dispose();
    }
    
    @Override
    public void paintComponent (Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }
}
