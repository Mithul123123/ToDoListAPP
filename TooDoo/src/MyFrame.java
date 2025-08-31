import javax.swing.*;

public class MyFrame extends JFrame
{
    static MainPanel panel1;
    public MyFrame()
    {
        panel1=new MainPanel();
        this.add(panel1);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ImageIcon Icon=new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\TooDoo\\out\\production\\TooDoo\\todo.jpg");
        this.setIconImage(Icon.getImage());


    }
    public static MainPanel sending()
    {
        return panel1;
    }

}
