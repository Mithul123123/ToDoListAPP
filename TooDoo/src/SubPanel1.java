import javax.swing.*;
import java.awt.*;

public class SubPanel1 extends JPanel
{
    Buttons btns;
    JPanel panel1;
    JPanel panel2;
    JLabel topiclabel;
    JLabel description;
    public SubPanel1()
    {
        panel1=new JPanel();
        panel2=new JPanel();
        topiclabel=new JLabel();
        description=new JLabel();
        //panel1
        panel1.setBounds(0,0,500,100);
        panel1.setLayout(null);
        panel1.setBackground(Color.black);
        topiclabel.setText("WELCOME TO MY-DO");
        topiclabel.setForeground(Color.yellow);
        topiclabel.setHorizontalAlignment(JLabel.CENTER);
        topiclabel.setVerticalAlignment(JLabel.CENTER);
        topiclabel.setBounds(0,0,500,100);
        topiclabel.setFont(new Font("Consola",Font.BOLD,32));
        panel1.add(topiclabel);
        panel1.setOpaque(true);
        //panel2
        panel2.setBounds(0,100,500,100);
        panel2.setLayout(null);
        panel2.setBackground(Color.lightGray);
        description.setText("<html>✔️ To-Do Application For The Bussierest Persons<br>Arround The World <br>✔️ You Can Use MY-DO Application" +
                "For Manage Your <br> Day To Day Tasks Without Fogetting Tasks");
        description.setFont(new Font("SansSerif",Font.BOLD,14));
        description.setForeground(Color.darkGray);
        description.setHorizontalAlignment(JLabel.CENTER);
        description.setVerticalAlignment(JLabel.CENTER);
        description.setBounds(0,0,500,100);
        panel2.add(description);
        panel2.setOpaque(true);

        //container
      this.setBounds(0,0,500,500);
      this.setBackground(Color.gray);
      this.add(panel1);
      this.add(panel2);
      this.setLayout(null);


    }

}
