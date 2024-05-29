
package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{
    Dashboard(){
        setBounds(0,0, 1550, 1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Hotel2.jpg"));
        Image i2= i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("THE PARADISE GROUP WELCOMES YOU");
        text.setBounds(400, 45, 1000, 50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 46));
        text.setForeground(Color.white);
        image.add(text);
        
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.gray);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.black);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        admin.add(addemployee);
        
        JMenuItem addroom = new JMenuItem("ADD ROOM");
        admin.add(addroom);
        
        JMenuItem adddrivers = new JMenuItem("ADD DRIVERS");
        admin.add(adddrivers);
        
        setVisible(true);
    }
    public static void main(String[] args){
        new Dashboard();
    }
}
