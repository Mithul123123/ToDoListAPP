import javax.swing.*;
import java.awt.*;
import java.util.Date;

import com.toedter.calendar.JDateChooser;
import com.github.lgooddatepicker.components.TimePicker;

public class Frame2Panel2 extends JPanel
{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField box1;
    JComboBox combo1;
    TimePicker picker;
    JTextField box3;
    JDateChooser chooser;
    JCheckBox check1;
    JLabel label;
    ImageIcon icon;
    public Frame2Panel2()
    {
        chooser=new JDateChooser();
        label1=new JLabel();
        label2=new JLabel();
        label3=new JLabel();
        box1=new JTextField();
       picker=new TimePicker();
       check1=new JCheckBox("SET ALARMS");


        this.setBounds(0,100,1000,600);
        this.setLayout(null);
        this.setBackground(Color.lightGray);
        this.setOpaque(true);
        this.setVisible(false);
        label1.setBounds(300,140,300,50);
        label1.setText("ADD A NEW TASK : ");
        label2.setBounds(320,210,300,50);
        label2.setText("ADD THE DATE : ");
        label3.setBounds(320,280,300,50);
        label3.setText("ADD THE TIME : ");
        this.add(label1);
        this.add(label2);
        this.add(label3);
        label1.setFont(new Font("Consola",Font.BOLD,26));
        label2.setFont(new Font("Consola",Font.BOLD,26));
        label3.setFont(new Font("Consola",Font.BOLD,26));
         box1.setBounds(600,140,200,50);
        box1.setFont(new Font("Consola",Font.BOLD,26));
         chooser.setBounds(600,210,200,50);
         picker.setBounds(600,280,200,50);

        picker.setFont(new Font("Consola",Font.BOLD,26));
        check1.setBounds(450,360,180,40);
        check1.setFocusable(false);
        check1.setFont(new Font("Consola",Font.BOLD,19));
        check1.setBackground(Color.BLACK);
        check1.setForeground(Color.yellow);
         this.add(box1);
        this.add(chooser);
        this.add(picker);
        this.add(check1);





    }
}
