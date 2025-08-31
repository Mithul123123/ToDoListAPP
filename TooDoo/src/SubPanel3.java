import javax.swing.*;
import java.awt.*;

public class SubPanel3 extends JPanel
{
    JLabel topiclabel;
   JPanel panel1;
    JLabel sticker;
    JLabel passkey;
    ImageIcon icon;
    JTextField textbox;
    JTextField email;
    JLabel emaillabel;
    public SubPanel3()
    {
        email=new JTextField();
        emaillabel=new JLabel();
        sticker=new JLabel();
        passkey=new JLabel();
        textbox=new JTextField();
     topiclabel=new JLabel();
     panel1=new JPanel();
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

        //sticker
        icon=new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\TooDoo\\out\\Screenshot 2025-07-01 211844.png");
        sticker.setBounds(0,75,500,200);
        sticker.setIcon(icon);
        this.add(sticker);
        sticker.setHorizontalAlignment(JLabel.CENTER);
        sticker.setVerticalAlignment(JLabel.CENTER);

        //input
        passkey.setBounds(0,270,200,40);
        passkey.setText("E-MAIL: ");
        passkey.setVerticalAlignment(JLabel.CENTER);
        passkey.setHorizontalAlignment(JLabel.RIGHT);
        passkey.setFont(new Font("Consola",Font.BOLD,18));
        textbox.setBounds(200,270,200,40);
        textbox.setFont(new Font("Consola",Font.BOLD,18));
        //input2
        emaillabel.setBounds(0,320,200,40);
        emaillabel.setText("PASSWORD : ");
        emaillabel.setVerticalAlignment(JLabel.CENTER);
        emaillabel.setHorizontalAlignment(JLabel.RIGHT);
        emaillabel.setFont(new Font("Consola",Font.BOLD,18));
        email.setBounds(200,320,200,40);
        email.setFont(new Font("Consola",Font.BOLD,18));

        this.add(passkey);
        this.add(textbox);
        this.add(emaillabel);
        this.add(email);
        this.setBounds(0,0,500,500);
        this.setBackground(Color.white);
        this.add(panel1);

        this.setLayout(null);

    }

    public static class mytaskpanel {
    }
}
