import javax.swing.*;

public class Main
{
    static MyFrame myFrame;
    public static void main(String[] args)
    {
        myFrame = new MyFrame();

    }

    public static MyFrame send()
    {
         return Main.myFrame;
    }
}

