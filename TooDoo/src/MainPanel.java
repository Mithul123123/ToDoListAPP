import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel
{
    Buttons btns;
    SubPanel1 ss;
    SubPanel2 ss2;
    SubPanel3 signinpanel;
    public MainPanel()
    {
        signinpanel=new SubPanel3();
        ss=new SubPanel1();
      ss2=new SubPanel2();
        this.setBounds(0,0,500,500);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
        this.setOpaque(true);
           this.add(ss);

        btns=new Buttons(this,ss,ss2,signinpanel);


    }
}
