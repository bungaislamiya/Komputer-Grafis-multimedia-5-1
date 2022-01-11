/*
 * Bunga Islamiya Putri - 20191310053
 * Transformasi - Tranlasi
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

public class TranslationEX extends JFrame {
   
    public TranslationEX() {
        
        initUI();
    }
    
    private void initUI() {
        
    add(new Surface());
    
    setTitle("Contoh Transformation - Translation");
    setSize(400, 400); // resolusi layar
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            
            public void run() {
                
            TranslationEX ex = new TranslationEX();
            ex.setVisible(true);
            }
        });
    }
    
    
}
