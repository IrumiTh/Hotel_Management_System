package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem() {
        setSize(1366, 565);
        setLocation(100, 100);
        setLayout(null);

        // Load the image and scale it to fit the JFrame dimensions
        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Hotel1.jpg"));
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(1366, 565, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Add the scaled image to a JLabel
        JLabel imageLabel = new JLabel(scaledIcon);

        
        imageLabel.setSize(1366, 565);
        imageLabel.setBounds(0,0, 1366, 565);
        add(imageLabel);
        
        JLabel text = new JLabel("HOTEL  MANAGEMENT  SYSTEM");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.white);
        text.setFont(new Font("serit", Font.BOLD,50));
        imageLabel.add(text);
        
        JButton next = new JButton("Next");
        next.setBounds(1150, 450, 150, 50);
        next.addActionListener(this);
        imageLabel.add(next);
        
        
        setVisible(true);
        
        
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
        
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}
