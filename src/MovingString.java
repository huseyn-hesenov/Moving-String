import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class MovingString extends JPanel {

int x=0,y=100;
public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2=(Graphics2D)g;
    Font font=new Font("ALI",Font.BOLD+Font.PLAIN,100);
    g2.setFont(font);
    g2.setColor(Color.red);
    g2.drawString("ali",x,y);
   try{Thread.sleep(100);}catch (Exception ex){}
   x+=100;
   if (x>this.getWidth()){
       x=0;
   }
   repaint();
}

    public static void main(String[] args) {
JFrame jFrame=new JFrame("MovingString");
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jFrame.setSize(700,200);
jFrame.add(new MovingString());
jFrame.setVisible(true);



    }
}
