import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import com.github.lgooddatepicker.components.TimePicker;

public class EditPanel extends JPanel
{
    JTable tabel;
    DefaultTableModel model;
    JScrollPane pane;
    JTableHeader header;
    JScrollPane pane2;
    JLabel label2;
    JLabel label3;
    JLabel label5;
    JLabel label4;
    JTextField box;
    JTextField box2;
    JDateChooser chooser;
    TimePicker picker;
    JPanel panel;

    public EditPanel()
    {
        label3=new JLabel("Enter The Time : ");
        label4=new JLabel("Enter The Date :");
        label5=new JLabel("Enter The Task : ");
        panel=new JPanel();
        panel.setSize(250,500);
        label2=new JLabel("Enter The Task Number : ");
        box=new JTextField();
        box2=new JTextField();
        chooser=new JDateChooser();
        picker=new TimePicker();

        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);
        label4.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.setAlignmentX(Component.CENTER_ALIGNMENT);
        box2.setAlignmentX(Component.CENTER_ALIGNMENT);
        label5.setAlignmentX(Component.CENTER_ALIGNMENT);
        chooser.setAlignmentX(Component.CENTER_ALIGNMENT);
        picker.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(label2);
        panel.add(Box.createVerticalStrut(10));
        panel.add(box);
        panel.add(Box.createVerticalStrut(10));
        panel.add(label5);
        panel.add(Box.createVerticalStrut(10));
        panel.add(box2);
        panel.add(label4);
        panel.add(Box.createVerticalStrut(10));
        panel.add(chooser);
        panel.add(Box.createVerticalStrut(10));
        panel.add(label3);
        panel.add(Box.createVerticalStrut(10));
        panel.add(picker);
        panel.add(Box.createVerticalStrut(10));
        pane2=new JScrollPane(panel);
        pane2.setBounds(600,280,300,230);
        box.setEnabled(false);
        chooser.setEnabled(false);
        picker.setEnabled(false);
        box2.setEnabled(false);
        this.add(pane2);
        model=new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row,int column)
            {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{"Task Number","Task name","Time","Date"});
        tabel=new JTable(model);
        pane=new JScrollPane(tabel);
        header=tabel.getTableHeader();
        header.setPreferredSize(new Dimension(header.getPreferredSize().width,40));
        tabel.setRowHeight(30);
        this.setBounds(0,100,1000,600);
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        this.setOpaque(true);
        this.setVisible(false);
        pane.setBounds(300,30,600,200);


        this.add(pane);
    }
}
