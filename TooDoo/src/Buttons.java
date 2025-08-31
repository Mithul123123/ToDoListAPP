import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Arrays;
import java.util.Collections;


public class Buttons extends JButton implements ActionListener
{
    static String passkey;
    static SubPanel1 subPanel1;
    MainPanel mainpanel;
    static SubPanel2 subpanel2;
    static SubPanel3 subpanel3;
    JButton button1;
    JButton button2;
    JButton backbutton;
    JButton Logbutton;
    JButton backbutton2;
    JButton signinbutton;

    Connection con;
    static MyFrame2 frame2;
    static MyFrame frame;
    public Buttons(MainPanel mainpanel,SubPanel1 subPanel1,SubPanel2 subpanel2, SubPanel3 subpanel3)
    {
       //database connection
        try
        {
             con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/todologging","root","Yethmin#123");
            Statement statment=con.createStatement();
            ResultSet set=statment.executeQuery("SELECT * from user");
            while (set.next())
            {
                /*System.out.println(set.getString("id"));
                System.out.println(set.getString("email"));
                System.out.println(set.getString("passwords"));
                System.out.println(set.getString("passkey"));*/
            }
        }catch (Exception ex)
        {
            System.out.println("error is going");
        }
        //****************************************************

        this.subPanel1=subPanel1;
        this.mainpanel=mainpanel;
        this.subpanel2=subpanel2;
        this.subpanel3=subpanel3;
        //button creation
        button1=new JButton("SignIn");
        button2=new JButton("LogIn By PassKey");
        backbutton=new JButton();
        Logbutton=new JButton();
        backbutton2=new JButton();
        signinbutton=new JButton();
        Logbutton.addActionListener(this);//button1
        button1.setBounds(125,250,250,50);
        button1.setFocusable(false);
        button1.setFont(new Font("Arial",Font.BOLD,18));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.CYAN);
        button1.addActionListener(this);
        this.subPanel1.add(button1);
        //button2
        button2.setBounds(125,320,250,50);
        button2.setFocusable(false);
        button2.setBackground(Color.BLACK);
        button2.setFont(new Font("Arial",Font.BOLD,18));
        button2.setForeground(Color.CYAN);
        button2.addActionListener(this);
        this.subPanel1.add(button2);

        //backbutton
        backbutton.setText("BACK");
        backbutton.setBounds(10,400,200,50);
        backbutton.setFocusable(false);
        backbutton.setBackground(Color.BLACK);
        backbutton.setFont(new Font("Arial",Font.BOLD,18));
        backbutton.setForeground(Color.CYAN);
        backbutton.addActionListener(this);
        subpanel2.add(backbutton);
        //logbutton
        Logbutton.setText("LOGIN");
        Logbutton.setBounds(275,400,200,50);
        Logbutton.setFocusable(false);
        Logbutton.setBackground(Color.BLACK);
        Logbutton.setFont(new Font("Arial",Font.BOLD,18));
        Logbutton.setForeground(Color.CYAN);
        subpanel2.add(Logbutton);
        //back2
        backbutton2.setText("BACK");
        backbutton2.setBounds(10,400,200,50);
        backbutton2.setFocusable(false);
        backbutton2.setBackground(Color.BLACK);
        backbutton2.setFont(new Font("Arial",Font.BOLD,18));
        backbutton2.setForeground(Color.CYAN);
        backbutton2.addActionListener(this);
        backbutton2.addActionListener(this);
        subpanel3.add(backbutton2);
        //logbutton
        signinbutton.setText("SIGNIN");
        signinbutton.setBounds(275,400,200,50);
        signinbutton.setFocusable(false);
        signinbutton.setBackground(Color.BLACK);
        signinbutton.setFont(new Font("Arial",Font.BOLD,18));
        signinbutton.setForeground(Color.CYAN);
        signinbutton.addActionListener(this);
        subpanel3.add(signinbutton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2)
        {
            subPanel1.setVisible(false);
            mainpanel.add(subpanel2);
           subpanel2.setVisible(true);
            subpanel3.setVisible(false);

        }else if(e.getSource()==backbutton)
        {
            subpanel2.setVisible(false);
            mainpanel.add(subPanel1);
            subPanel1.setVisible(true);
            subpanel3.setVisible(false);

        }else if(e.getSource()==backbutton2)
        {
            subpanel2.setVisible(false);
            mainpanel.add(subPanel1);
            subPanel1.setVisible(true);
            subpanel3.setVisible(false);
        }
        else if(e.getSource()==button1)
        {

            subpanel2.setVisible(false);
            mainpanel.add(subpanel3);
            subpanel3.setVisible(true);
            subPanel1.setVisible(false);


        }
        else if(e.getSource()==button1)
        {
            subpanel2.setVisible(false);
            mainpanel.add(subpanel3);
            subpanel3.setVisible(true);
            subPanel1.setVisible(false);

        }
        else if(e.getSource()==Logbutton)
        {

            boolean isavailable=false;
            String text=subpanel2.textbox.getText();
            try
            {
                Statement statement2=con.createStatement();
                ResultSet set2=statement2.executeQuery("select passkey from user");
                while(set2.next())
                {
                    passkey=set2.getString("passkey");
                    if(passkey.equals(text))
                    {
                        frame2=new MyFrame2();
                        frame=Main.send();
                        frame.dispose();
                        //System.out.println(passkey);

                        isavailable=true;
                    }
                   /* else {

                        break;
                    }*/

                }
                if(!isavailable)
                {
                    JOptionPane.showMessageDialog(null,"INVALID PASSKEY!!!\nPLEASE SIGN IN AND TAKE THE PASSKEY","ERROR",JOptionPane.ERROR_MESSAGE);
                }

            }catch (Exception ex)
            {
                System.out.println("error");
            }



        } else if(e.getSource()==signinbutton)
        {
                 int count=0;
                 boolean isavailable = false;
                

            try {
                Statement statement2=con.createStatement();
                ResultSet set2=statement2.executeQuery("select * from user");

                        while(set2.next())
                        {
                            String email2=set2.getString("email");
                            String password2=set2.getString("passwords");
                            if((subpanel3.textbox.getText().equals(email2)) && (subpanel3.email.getText().equals(password2)))
                            {
                                count++;
                                isavailable=true;
                                JOptionPane.showMessageDialog(null,"You havve already signed in login with passkey ","error",JOptionPane.WARNING_MESSAGE);
                                System.out.println("xx");

                            }

                        }
                        if(!isavailable)
                        {

                            //System.out.println("yy");
                            if((!(subpanel3.textbox.getText().isEmpty()))&& (!(subpanel3.textbox.getText().equals(" "))&&(!(subpanel3.email.getText().isEmpty()))&& (!(subpanel3.email.getText().equals(" ")))&& ((subpanel3.textbox.getText().contains("@gmail.com")))&& ((subpanel3.email.getText().length()>=8))&& (!(subpanel3.textbox.getText().trim().equals("@gmail.com")))&& (!(subpanel3.textbox.getText().substring(0,subpanel3.textbox.getText().length()-10).matches("-?\\d+(\\.\\d+)?"))))) {
                                //genarate password
                                      if((subpanel3.textbox.getText().length()<=13))
                                {
                                    String c=" ";

                                    char[] x= subpanel3.textbox.getText().toUpperCase().toCharArray();

                                    for(int u=x.length-1;u>0;u--)
                                    {
                                        c+=x[u];

                                    }
                                    passkey=subpanel3.textbox.getText().substring(0,4).toUpperCase()+subpanel3.email.getText().substring(0,3)+c;

                                    String information= "Your Passkey is ----> "+passkey +"\n Do Not Forget because you want the Passkey\nfor suture logging";
                                    JOptionPane.showMessageDialog(null,information,"Genarated passkey" , JOptionPane.INFORMATION_MESSAGE);


                                }else
                                {
                                    passkey=subpanel3.textbox.getText().substring(0,subpanel3.textbox.getText().length()-10).toUpperCase()+subpanel3.email.getText().substring(0,4)+ (subpanel3.email.getText().length()+subpanel3.textbox.getText().length());

                                    String information= "Your Passkey is ----> "+passkey +"\n Do Not Forget because you want the Passkey\nfor suture logging";
                                    JOptionPane.showMessageDialog(null,information,"Genarated passkey" , JOptionPane.INFORMATION_MESSAGE);
                                }
                                //*********************************
                                frame2 = new MyFrame2();
                                frame=Main.send();
                                frame.dispose();
                                PreparedStatement statement3 = con.prepareStatement("insert into user(email,passwords,passkey) values (?,?,?)");

                                statement3.setString(1, subpanel3.textbox.getText().trim());
                                statement3.setString(2, subpanel3.email.getText().trim());
                                statement3.setString(3, passkey);
                                statement3.executeUpdate();
                                String qq="create table "+passkey+" (task_no INT AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,task_name VARCHAR(50) NOT NULL,time VARCHAR(20) NOT NULL,date VARCHAR(225) NOT NULL);";
                                PreparedStatement statement4=con.prepareStatement(qq);

                                statement4.executeUpdate();

                            }else {
                                if(count==0) {
                                    JOptionPane.showMessageDialog(null, "Invalid usernme or password", "error", JOptionPane.WARNING_MESSAGE);
                                }
                            }

                        }



            } catch (SQLException ex) {
                System.out.println("ewwww");
            }




        }
    }
public static MyFrame2 send()
{
    return frame2;
}
public static String keysending()
{
    return passkey;
}

}

