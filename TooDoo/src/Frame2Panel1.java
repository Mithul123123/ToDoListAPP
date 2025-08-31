import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Frame2Panel1 extends JPanel
{
    int x=0;
    JLabel labeltime;
    JLabel labeldate;
    static MyFrame2 frame2;
    public Frame2Panel1()
    {
        frame2=Buttons.send();
        LocalDate date=LocalDate.now();

        String Date=date.toString();
        labeltime=new JLabel();
            LocalTime time = LocalTime.now();


            DateTimeFormatter fmatter=DateTimeFormatter.ofPattern("HH:mm:ss");
           labeltime.setText(time.format(fmatter));
        labeltime.setHorizontalAlignment(JLabel.CENTER);
        labeltime.setVerticalAlignment(JLabel.CENTER);
            labeldate=new JLabel(Date);
        labeldate.setHorizontalAlignment(JLabel.CENTER);
        labeldate.setVerticalAlignment(JLabel.CENTER);

        labeltime.setFont(new Font("Consola",Font.BOLD,32));
        labeldate.setFont(new Font("Consola",Font.BOLD,32));
        labeltime.setBounds(350,150,300,70);
        labeldate.setBounds(350,250,300,70);
        labeltime.setBackground(Color.WHITE);
        labeldate.setBackground(Color.WHITE);
        labeldate.setOpaque(true);
        labeltime.setOpaque(true);
        this.setBounds(0,100,1000,600);
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setLayout(null);
        this.add(labeldate);
        this.add(labeltime);
       



    }
}
