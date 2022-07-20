
package com.hakan.swingornegi;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Pencere {
    
    
    private JFrame frame;
    
    public Pencere() {
        frame = new JFrame();
        
        JButton button = new JButton("Tıkla");
        
        button.setBounds(130,100,100,40);
        
        frame.add(button);
        
        frame.setSize(400,500);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
        
        
    }
    
}
