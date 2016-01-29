import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Gui {
	Game1.f.setSize(1000, 750);
    Game1.f.setResizable(false);
    Game1.f.setVisible(true);
    Game1.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Game1.f.setTitle("Online First Person Shooter");

    ImageIcon image = new ImageIcon("C:\\Users\\Meneer\\Pictures\\image.png");
    JLabel imageLabel = new JLabel(image); 
    add(imageLabel);
    class Display extends JFrame
}
