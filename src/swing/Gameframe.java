package swing;

import javax.swing.*;

public class Gameframe extends JFrame {
    Gameframe()
    {
        Gamepanel panel=new Gamepanel();
        this.add(panel);
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
