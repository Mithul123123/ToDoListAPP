import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class MyTaskPanel extends JPanel
{
    JTable table;
    DefaultTableModel model;
    JScrollPane scrollPane;
    JTableHeader header;
    public MyTaskPanel()
    {

        model=new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row,int column)
            {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{"TASK","TIME","DATE"});
        table=new JTable(model);
        header=table.getTableHeader();
        header.setPreferredSize(new Dimension(header.getPreferredSize().width,40));
        table.setRowHeight(30);
        scrollPane = new JScrollPane(table);
        this.setBackground(Color.lightGray);
        this.setBounds(0,100,1000,600);
        this.setLayout(null);
        this.setOpaque(true);
        scrollPane.setBounds(300,100,600,400);
        this.add(scrollPane);

        this.setVisible(false);

    }


}
