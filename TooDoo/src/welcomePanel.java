import javax.swing.*;
import java.awt.*;

public class welcomePanel extends JPanel
{
    JLabel label;
    public welcomePanel()
    {
        label=new JLabel("▶️ MY TODO ✔️");
        this.setBounds(0,0,1000,100);
        this.setBackground(Color.BLACK);
        this.add(label);
        label.setBounds(350,0,400,100);
        label.setForeground(Color.CYAN);
        label.setFont(new Font("Consola",Font.BOLD,40));
        this.setLayout(null);



    }
}
