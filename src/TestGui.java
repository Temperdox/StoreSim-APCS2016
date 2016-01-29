import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TestGui {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;
   private JLabel label;

   public TestGui(){
      prepareGUI();
   }

   public static void main(String[] args){
      TestGui  swingContainerDemo = new TestGui();  
      swingContainerDemo.showJFrameDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Test Frame");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      msglabel = new JLabel("Pause Menu", JLabel.CENTER);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   
   public void ImageInFrame() throws IOException{
	   String path = "src/Menu.png";
       File file = new File(path);
       BufferedImage image = ImageIO.read(file);
       JLabel label = new JLabel(new ImageIcon(image));
   }

   private void showJFrameDemo(){
      headerLabel.setText("Game Screen");   

      final JFrame frame = new JFrame();
      frame.setSize(900, 900);
      frame.setLayout(new FlowLayout());       
      frame.add(msglabel);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
         }        
      });    
      JButton okButton = new JButton("Pause");
      MouseListener label = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
	};
      statusLabel.setText("Click to pause.");
      controlPanel.add(okButton);
      mainFrame.setVisible(true);  
   }
}
