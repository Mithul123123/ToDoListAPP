import javax.swing.*;

public class MyFrame2 extends JFrame
{
    JPanel panelx;
    ImageIcon icon ;
    welcomePanel welcome;
    static Frame2Panel1 panel1;
    static Frame2Panel2 panel2;
    static MyTaskPanel panel3;
    static EditPanel panel4;
    ProfilePanel panel5;
    public MyFrame2()
    {
        panel5=new ProfilePanel();
        panel2=new Frame2Panel2();
        panel1=new Frame2Panel1();
        panel3=new MyTaskPanel();
        panel4=new EditPanel();
        panelx=new JPanel();
        panelx.setBounds(0,0,1000,700);
        this.add(panelx);
        panelx.setLayout(null);
        welcome=new welcomePanel();
        icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\TooDoo\\out\\production\\TooDoo\\Screenshot 2025-07-01 211844.jpg");
        this.setSize(1000,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        panelx.add(welcome);
        new Frame2Buttons(welcome);
        panelx.add(panel1);
        panelx.add(panel2);
        panelx.add(panel3);
        panelx.add(panel4);
        panelx.add(panel5);



    }
    public static  Frame2Panel1 edit()
    {
        return panel1;
    }
    public static  Frame2Panel2 edit2()
    {
        return panel2;
    }

}
