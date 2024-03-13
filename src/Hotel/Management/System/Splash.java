package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,640,352);
        add(label);

        setLayout(null);
        setLocation(300,150);
        setSize(640,352);
        setVisible(true);

        try {
            Thread.sleep(4000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Splash();
    }
}
