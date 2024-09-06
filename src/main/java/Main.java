import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class Main implements ActionListener{
  // Creates JFrame
  JFrame frame = new JFrame("Jump Platformer");

  // Create buttons
  JButton startB = new JButton("Start");
  JButton leftB = new JButton("Left");
  JButton rightB = new JButton("Right");

  // Creates ground pixel labels
  JLabel g1 = new JLabel(" ");
  JLabel g2 = new JLabel(" ");
  JLabel g3 = new JLabel(" ");
  JLabel g4 = new JLabel(" ");
  JLabel g5 = new JLabel(" ");
  JLabel g6 = new JLabel(" ");
  JLabel g7 = new JLabel(" ");
  JLabel g8 = new JLabel(" ");
  JLabel g9 = new JLabel(" ");
  JLabel g10 = new JLabel(" ");

  JLabel[] gPix = {g1, g2, g3, g4, g5, g6, g7, g8, g9, g10};
  int c = 0;
  int loc = 5;

  // Creates space pixel labels
  JLabel s1A = new JLabel(" ");
  JLabel s1B = new JLabel(" ");
  JLabel s1C = new JLabel(" ");
  JLabel s1D = new JLabel(" ");
  JLabel s1E = new JLabel(" ");
  JLabel s1F = new JLabel(" ");
  JLabel s1G = new JLabel(" ");
  JLabel s1H = new JLabel(" ");
  JLabel s1I = new JLabel(" ");
  JLabel s1J = new JLabel(" ");
  JLabel s2A = new JLabel(" ");
  JLabel s2B = new JLabel(" ");
  JLabel s2C = new JLabel(" ");
  JLabel s2D = new JLabel(" ");
  JLabel s2E = new JLabel(" ");
  JLabel s2F = new JLabel(" ");
  JLabel s2G = new JLabel(" ");
  JLabel s2H = new JLabel(" ");
  JLabel s2I = new JLabel(" ");
  JLabel s2J = new JLabel(" ");
  JLabel s3A = new JLabel(" ");
  JLabel s3B = new JLabel(" ");
  JLabel s3C = new JLabel(" ");
  JLabel s3D = new JLabel(" ");
  JLabel s3E = new JLabel(" ");
  JLabel s3F = new JLabel(" ");
  JLabel s3G = new JLabel(" ");
  JLabel s3H = new JLabel(" ");
  JLabel s3I = new JLabel(" ");
  JLabel s3J = new JLabel(" ");
  JLabel s4A = new JLabel(" ");
  JLabel s4B = new JLabel(" ");
  JLabel s4C = new JLabel(" ");
  JLabel s4D = new JLabel(" ");
  JLabel s4E = new JLabel(" ");
  JLabel s4F = new JLabel(" ");
  JLabel s4G = new JLabel(" ");
  JLabel s4H = new JLabel(" ");
  JLabel s4I = new JLabel(" ");
  JLabel s4J = new JLabel(" ");
  JLabel s5A = new JLabel(" ");
  JLabel s5B = new JLabel(" ");
  JLabel s5C = new JLabel(" ");
  JLabel s5D = new JLabel(" ");
  JLabel s5E = new JLabel(" ");
  JLabel s5F = new JLabel(" ");
  JLabel s5G = new JLabel(" ");
  JLabel s5H = new JLabel(" ");
  JLabel s5I = new JLabel(" ");
  JLabel s5J = new JLabel(" ");
  JLabel s6A = new JLabel(" ");
  JLabel s6B = new JLabel(" ");
  JLabel s6C = new JLabel(" ");
  JLabel s6D = new JLabel(" ");
  JLabel s6E = new JLabel(" ");
  JLabel s6F = new JLabel(" ");
  JLabel s6G = new JLabel(" ");
  JLabel s6H = new JLabel(" ");
  JLabel s6I = new JLabel(" ");
  JLabel s6J = new JLabel(" ");

  // Arrays

  JLabel[] sr1 = {s1A, s1B, s1C, s1D, s1E, s1F, s1G, s1H, s1I, s1J};
  JLabel[] sr2 = {s2A, s2B, s2C, s2D, s2E, s2F, s2G, s2H, s2I, s2J};
  JLabel[] sr3 = {s3A, s3B, s3C, s3D, s3E, s3F, s3G, s3H, s3I, s3J};
  JLabel[] sr4 = {s4A, s4B, s4C, s4D, s4E, s4F, s4G, s4H, s4I, s4J};
  JLabel[] sr5 = {s5A, s5B, s5C, s5D, s5E, s5F, s5G, s5H, s5I, s5J};
  JLabel[] sr6 = {s6A, s6B, s6C, s6D, s6E, s6F, s6G, s6H, s6I, s6J};

  JLabel[][] sPix = {sr1, sr2, sr3, sr4, sr5, sr6}; // Main 2D Array
  int d = 0;
  
  public static void main(String[] args) {
  Main o = new Main();
  o.gui();
  }

  void gui(){
  frame.setLayout(null);
  frame.setSize(500, 500);
  frame.setVisible(true);

  terrain();
  buttons();
  space();
  }

  void terrain(){

    // Creates ground and sets pixel's properties
    for(int i = 0; i < gPix.length; i++){
      gPix[i].setBounds(c, 300, 50, 50);
      gPix[i].setBackground(Color.GREEN);
      gPix[i].setOpaque(true);
      frame.add(gPix[i]);
      c += 50;
    }
    }

  void space(){
    int x = 0;
    int y = 0;
    for (int i = 0; i < 6; i++){
      for (int j = 0; j < sPix[i].length; j++){
        sPix[i][j].setBounds(x, y, 50, 50);
        sPix[i][j].setBackground(Color.GREEN);
        sPix[i][j].setOpaque(true);
        frame.add(sPix[i][j]);
        x += 50;
      }
      x = 0;
      y+=50;
    }
  }

  void buttons(){
    // Button properties
    startB.setBounds(150, 375, 200, 75);
    startB.addActionListener(this);
    leftB.setBounds(25, 375, 100, 75);
    leftB.addActionListener(this);
    rightB.setBounds(375, 375, 100, 75);
    rightB.addActionListener(this);

    // Add buttons
    frame.add(startB);
    frame.add(leftB);
    frame.add(rightB);
  }

  public void actionPerformed(ActionEvent e){

    // Move left
    if(e.getSource() == leftB){
      if (loc > 0){
        gPix[loc].setBackground(Color.GREEN);
        loc -= 1;
        gPix[loc].setBackground(Color.RED);
      }
    }

    // Move right
    if(e.getSource() == rightB){
      if (loc < 9){
        gPix[loc].setBackground(Color.GREEN);
        loc += 1;
        gPix[loc].setBackground(Color.RED);
      }
    }

    // Start
    if(e.getSource() == startB){
      //gPix[loc].setBackground(Color.GREEN);
      loc = 5;
      gPix[loc].setBackground(Color.RED);
    }

    
  }
  
}
