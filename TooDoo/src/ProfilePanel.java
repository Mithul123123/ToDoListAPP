import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends JPanel
{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    ImageIcon icon;
    public ProfilePanel()
    {
        icon=new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\TooDoo\\out\\Screenshot 2025-07-31 200253.png");
        label1=new JLabel();
        label1.setIcon(icon);
        label2=new JLabel();
        label3=new JLabel();
        label4=new JLabel();
        label5=new JLabel();
        label1.setBounds(440,50,201,200);
        label2.setBounds(350,270,400,50);
        label3.setBounds(350,320,400,50);
        label4.setBounds(350,370,400,50);
        label5.setBounds(350,420,400,50);
        label2.setFont(new Font("consola",Font.BOLD,24));
        label3.setFont(new Font("consola",Font.BOLD,24));
        label4.setFont(new Font("consola",Font.BOLD,24));
        label5.setFont(new Font("consola",Font.BOLD,24));
        label2.setForeground(Color.black);
        label3.setForeground(Color.black);
        label4.setForeground(Color.black);
        label5.setForeground(Color.black);

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);







      this.setBounds(0,100,1000,600);
      this.setLayout(null);
      this.setBackground(Color.lightGray);
      this.setOpaque(true);
      this.setVisible(false);

    }
}
