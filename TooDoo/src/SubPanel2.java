import javax.swing.*;
import java.awt.*;

public class SubPanel2 extends JPanel
{
    JPanel panel1;
    JPanel panel2;

    JLabel topic;
    JLabel sticker;
    JLabel passkey;
    ImageIcon icon;
    JTextField textbox;


    public SubPanel2()
    {
        panel1=new JPanel();
        sticker=new JLabel();
        passkey=new JLabel();
        textbox=new JTextField();
        topic=new JLabel();

        this.setLayout(null);
        this.setBounds(0,0,500,500);
        this.setOpaque(true);
        this.setBackground(Color.white);
        panel1.setBounds(0,0,500,100);
        panel1.setLayout(null);
        panel1.setBackground(Color.black);
        topic.setText("WELCOME TO MY-DO");
        topic.setForeground(Color.yellow);
        topic.setHorizontalAlignment(JLabel.CENTER);
        topic.setVerticalAlignment(JLabel.CENTER);
        topic.setBounds(0,0,500,100);
        topic.setFont(new Font("Consola",Font.BOLD,32));
        panel1.add(topic);
        panel1.setOpaque(true);

        //sticker
        icon=new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\TooDoo\\out\\Screenshot 2025-07-01 211844.png");
        sticker.setBounds(0,75,500,200);
        sticker.setIcon(icon);
        this.add(sticker);
        sticker.setHorizontalAlignment(JLabel.CENTER);
        sticker.setVerticalAlignment(JLabel.CENTER);

        //input
        passkey.setBounds(0,300,200,40);
        passkey.setText("PASS-KEY : ");
        passkey.setVerticalAlignment(JLabel.CENTER);
        passkey.setHorizontalAlignment(JLabel.RIGHT);
        passkey.setFont(new Font("Consola",Font.BOLD,18));
        textbox.setBounds(200,300,200,40);
        textbox.setFont(new Font("Consola",Font.BOLD,18));
        this.add(passkey);
        this.add(textbox);

        this.add(panel1);

    }
}
