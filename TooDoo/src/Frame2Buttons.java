import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Frame2Buttons extends JButton implements ActionListener {
    NavBar bar;
    welcomePanel wc;
    JButton mainbotton;
    ImageIcon icon1;
    JButton addtask;
    static MyFrame2 frame2;
    int count1 = 0;
    int count2 = 0;
    int count3=0;
    int count4=0;
    int count5=0;
    static Frame2Panel1 xx;
    static MyFrame frame1;
    JButton profile;
    JButton homebutton;
    JButton shedule;
    JButton logout;
    JButton edit;
    JButton submit;
    JButton ClearAll;
    JButton DeleteOne;
    JButton Update;
    JButton update2;

    Frame2Panel2 panel2;
    static Thread th;
    Connection con;
    static String passkey;

    static MainPanel pan;
    //mytaskpanel


    public Frame2Buttons(welcomePanel wc) {


        //****************
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/todologging", "root", "Yethmin#123");
        } catch (Exception e) {
            //System.out.println("mmm");
        }
        frame1=Main.send();

         passkey=Buttons.keysending();
        panel2 = new Frame2Panel2();
        frame2 = Buttons.send();
        System.out.println("lakni");
        bar = new NavBar();
        this.wc = wc;
        mainbotton = new JButton();
        icon1 = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\TooDoo\\out\\Screenshot 2025-07-20 210921.png");
        mainbotton.setIcon(icon1);
        mainbotton.setBounds(0, 23, 80, 55);
        wc.add(mainbotton);
        mainbotton.setFocusable(false);
        mainbotton.setBorder(BorderFactory.createLineBorder(Color.gray));
        mainbotton.addActionListener(this);
        //adding button 2
        addtask = new JButton("ADD TASKS");
        addtask.setBounds(375, 350, 250, 85);
        addtask.setFocusable(true);
        addtask.setFont(new Font("Consola", Font.BOLD, 30));
        addtask.setBackground(Color.black);
        addtask.setForeground(Color.yellow);
        addtask.setFocusable(false);
        addtask.addActionListener(this);
        xx = MyFrame2.edit();
        xx.add(addtask);
        bar.setLayout(null);
        //profile button

        profile = new JButton();
        profile.setBounds(35, 40, 115, 60);
        profile.setText("PROFILE");
        profile.setFont(new Font("Consola", Font.BOLD, 17));
        profile.setBackground(Color.black);
        profile.setForeground(Color.cyan);
        profile.setFocusable(false);
        bar.add(profile);
        profile.addActionListener(this);
//**************************************
        //home button

        homebutton = new JButton();
        homebutton.setBounds(35, 120, 115, 60);
        homebutton.setText("HOME");
        homebutton.setFont(new Font("Consola", Font.BOLD, 17));
        homebutton.setBackground(Color.black);
        homebutton.setForeground(Color.cyan);
        homebutton.setFocusable(false);
        bar.add(homebutton);
        homebutton.addActionListener(this);
//***********************
        //scedule button

        shedule = new JButton();
        shedule.setBounds(35, 200, 115, 60);
        shedule.setText("MYTASKS");
        shedule.setFont(new Font("Consola", Font.BOLD, 17));
        shedule.setBackground(Color.black);
        shedule.setForeground(Color.cyan);
        shedule.setFocusable(false);
        bar.add(shedule);
        shedule.addActionListener(this);
//***********************
        //logout button

        logout = new JButton();
        logout.setBounds(35, 280, 115, 60);
        logout.setText("LOG OUT");
        logout.setFont(new Font("Consola", Font.BOLD, 17));
        logout.setBackground(Color.black);
        logout.setForeground(Color.cyan);
        logout.setFocusable(false);
        logout.addActionListener(this);
        bar.add(logout);
//***********************
//edit button
        edit = new JButton();
        edit.setBounds(35, 360, 115, 60);
        edit.setText("EDIT");
        edit.setFont(new Font("Consola", Font.BOLD, 17));
        edit.setBackground(Color.black);
        edit.setForeground(Color.cyan);
        edit.setFocusable(false);
        edit.addActionListener(this);
        bar.add(edit);
        //***************************
        // submit utton
        submit = new JButton();
        submit.setBounds(450, 420, 180, 60);
        submit.setText("SUBMIT");
        submit.setFont(new Font("Consola", Font.BOLD, 22));
        submit.setBackground(Color.black);
        submit.setForeground(Color.cyan);
        submit.setFocusable(false);
        submit.addActionListener(this);
        MyFrame2.edit2().add(submit);
        // clearall utton
        ClearAll = new JButton("CLEAR TAbEL");
        ClearAll.setBounds(300, 290, 250, 60);
        ClearAll.setFocusable(true);
        ClearAll.setFont(new Font("Consola", Font.BOLD, 30));
        ClearAll.setBackground(Color.black);
        ClearAll.setForeground(Color.yellow);
        ClearAll.setFocusable(false);
        ClearAll.addActionListener(this);
        frame2.panel4.add(ClearAll);
        // delete one utton
        DeleteOne = new JButton("DELETE LAST");
        DeleteOne.setBounds(300, 370, 250, 60);
        DeleteOne.setFocusable(true);
        DeleteOne.setFont(new Font("Consola", Font.BOLD, 30));
        DeleteOne.setBackground(Color.black);
        DeleteOne.setForeground(Color.yellow);
        DeleteOne.setFocusable(false);
        DeleteOne.addActionListener(this);
        frame2.panel4.add(DeleteOne);
        // update utton
        Update = new JButton("UPDATE");
        Update.setBounds(300, 450, 250, 60);
        Update.setFocusable(true);
        Update.setFont(new Font("Consola", Font.BOLD, 30));
        Update.setBackground(Color.black);
        Update.setForeground(Color.yellow);
        Update.setFocusable(false);
        Update.addActionListener(this);
        frame2.panel4.add(Update);
        //update2
        update2 = new JButton("CHANGE");
        update2.setBounds(300, 450, 250, 40);
        update2.setFocusable(true);
        update2.setFont(new Font("Consola", Font.BOLD, 30));
        update2.setBackground(Color.lightGray);
        update2.setForeground(Color.black);
        update2.setFocusable(false);
        update2.addActionListener(this);
        update2.setAlignmentX(update2.CENTER_ALIGNMENT);
        frame2.panel4.panel.add(update2);
        update2.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame2 = Buttons.send();

        if (e.getSource() == mainbotton)
        {

            //*************************************************************************************
            if (frame2.panel1.isVisible()) {


                if (count1 == 0) {


                    frame2.panel1.add(bar);
                    frame2.panel1.setVisible(true);
                    frame2.panel1.revalidate();
                    frame2.panel1.repaint();
                    bar.setVisible(true);

                }
                count1++;
                if (count1 % 2 == 1) {
                    frame2.panel1.add(bar);

                    bar.setVisible(true);

                } else {

                    bar.setVisible(false);
                }
                //*************************************************************************************
            }
            if (frame2.panel2.isVisible()) {


                if (count2 == 0) {


                    frame2.panel2.add(bar);
                    frame2.panel2.setVisible(true);
                    frame2.panel2.revalidate();
                    frame2.panel2.repaint();
                    bar.setVisible(true);

                }
                count2++;
                if (count2 % 2 == 1) {
                    frame2.panel2.add(bar);

                    bar.setVisible(true);

                } else {

                    bar.setVisible(false);
                }
            }
            //*******************************************************************************
            if (frame2.panel3.isVisible()) {


                if (count3 == 0) {


                    frame2.panel3.add(bar);
                    frame2.panel3.setVisible(true);
                    frame2.panel3.revalidate();
                    frame2.panel3.repaint();
                    bar.setVisible(true);

                }
                count3++;
                if (count3 % 2 == 1) {
                    frame2.panel3.add(bar);

                    bar.setVisible(true);

                } else {

                    bar.setVisible(false);
                }

                //*************************************************************************************
                //
            }
            //*******************************************************************************
            if (frame2.panel4.isVisible())
            {


                if (count4 == 0) {


                    frame2.panel4.add(bar);
                    frame2.panel4.setVisible(true);
                    frame2.panel4.revalidate();
                    frame2.panel4.repaint();
                    bar.setVisible(true);

                }
                count4++;
                if (count4 % 2 == 1) {
                    frame2.panel4.add(bar);

                    bar.setVisible(true);

                } else {

                    bar.setVisible(false);
                }

                //*************************************************************************************
                //
            }
            //*******************************************************************************
            if (frame2.panel5.isVisible())
            {


                if (count5 == 0) {


                    frame2.panel5.add(bar);
                    frame2.panel5.setVisible(true);
                    frame2.panel5.revalidate();
                    frame2.panel5.repaint();
                    bar.setVisible(true);

                }
                count5++;
                if (count5 % 2 == 1) {
                    frame2.panel5.add(bar);

                    bar.setVisible(true);

                } else {

                    bar.setVisible(false);
                }

                //*************************************************************************************
                //
            }



        } else if (e.getSource() == addtask) {
                count2 = 0;
                count1 = 0;
                count3=0;
                count4=0;
                count5=0;
                frame2.panel1.setVisible(false);//and set another panel true
                frame2.panel2.setVisible(true);
            frame2.panel3.setVisible(false);
            frame2.panel4.setVisible(false);
            frame2.panel5.setVisible(false);
                bar.setVisible(false);
            } else if (e.getSource() == homebutton) {
            count2 = 0;
            count1 = 0;
            count3=0;
            count4=0;
            count5=0;
                frame2.panel1.setVisible(true);//and set another panel true
                frame2.panel2.setVisible(false);
             frame2.panel3.setVisible(false);
            frame2.panel4.setVisible(false);
            frame2.panel5.setVisible(false);
                bar.setVisible(false);

            } else if ((e.getSource() == submit)) {
                if ((!(frame2.panel2.box1.getText().trim() == "")) && (!(frame2.panel2.chooser.getDate() == null)) && (!(frame2.panel2.picker.getText() == ""))) {
                    String passkey = Buttons.keysending();
                    //System.out.println(passkey);
                    String qq = "INSERT INTO " + passkey + " (task_name,time,date) values (?,?,?)";
                    try {
                        PreparedStatement statement = con.prepareStatement(qq);
                        statement.setString(1, frame2.panel2.box1.getText());
                        statement.setString(2, frame2.panel2.picker.getText().toString());
                        statement.setString(3, frame2.panel2.chooser.getDate().toString());
                        statement.executeUpdate();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                    frame2.panel2.box1.setText("");
                    frame2.panel2.chooser.setDate(null);
                    frame2.panel2.picker.clear();
                    frame2.panel2.check1.setSelected(false);

                } else {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE \n CORRECT INFORMATIONS!!!!", "ERROR😒!!", JOptionPane.ERROR_MESSAGE);
                }
            } else if (e.getSource() == shedule) {
                 frame2.panel3.model.setRowCount(0);
            count2 = 0;
            count1 = 0;
            count3=0;
            count4=0;
            count5=0;
                frame2.panel3.setVisible(true);
                frame2.panel1.setVisible(false);//and set another panel true
                frame2.panel2.setVisible(false);
                frame2.panel4.setVisible(false);
            frame2.panel5.setVisible(false);
                bar.setVisible(false);
                //database table
             try {
                 Statement statement4 = con.createStatement();
                String qq="select * from "+passkey+";";
                ResultSet dataset=statement4.executeQuery(qq);
                while(dataset.next())
                {
                    frame2.panel3.model.addRow(new Object[]{dataset.getString("task_name"),dataset.getString("time"),dataset.getString("date")});
                }
             }catch (Exception ex)
             {
                System.out.println(ex);
             }

              } else if (e.getSource()==logout)
             {
             int responce=JOptionPane.showConfirmDialog(null,"Are You Sure,\n Do You Want To LogOut??\n🙄","LOG OUT",JOptionPane.YES_NO_OPTION);
             if(responce==JOptionPane.YES_OPTION)
             {
                try {
                    /*String deleteq="drop Table "+passkey;
                    PreparedStatement statement6 = con.prepareStatement(deleteq);
                    statement6.executeUpdate();*/
                    String deleterow="delete from user where passkey='"+passkey+"'";
                    PreparedStatement statement8=con.prepareStatement(deleterow);
                    statement8.executeUpdate();
                    frame2.dispose();

                   frame1.show();

                }catch (Exception ex)
                {
                    System.out.println(ex);
                }

            }else
            {

            }
            } else if (e.getSource()==edit)
               {
                frame2.panel4.model.setRowCount(0);
                   count2 = 0;
                   count1 = 0;
                   count3=0;
                   count4=0;
                   count5=0;
                frame2.panel1.setVisible(false);//and set another panel true
                frame2.panel2.setVisible(false);
                frame2.panel3.setVisible(false);
                frame2.panel4.setVisible(true);
                   frame2.panel5.setVisible(false);
                bar.setVisible(false);
                try {
                    Statement statement4 = con.createStatement();
                    String qq="select * from "+passkey+";";
                    ResultSet dataset=statement4.executeQuery(qq);
                    while(dataset.next())
                    {
                        frame2.panel4.model.addRow(new Object[]{dataset.getString("task_no"),dataset.getString("task_name"),dataset.getString("time"),dataset.getString("date")});
                    }
                }catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }else if(e.getSource()==ClearAll)
        {
            frame2.panel4.box.setEnabled(false);
            frame2.panel4.chooser.setEnabled(false);
            frame2.panel4.picker.setEnabled(false);
            frame2.panel4.box2.setEnabled(false);
            update2.setEnabled(false);
            String QUERY="delete from "+passkey;
            try
            {
                PreparedStatement statement=con.prepareStatement(QUERY);
                statement.executeUpdate();
                frame2.panel4.model.setRowCount(0);
            }catch (Exception ex)
            {
                System.out.println(ex);
            }



        }else if(e.getSource()==DeleteOne)
          {
            if(!( frame2.panel4.model.getRowCount()==0))
            {
                if(( frame2.panel4.model.getRowCount()-1==0))
                {
                    frame2.panel4.box.setEnabled(false);
                    frame2.panel4.chooser.setEnabled(false);
                    frame2.panel4.picker.setEnabled(false);
                    frame2.panel4.box2.setEnabled(false);
                    update2.setEnabled(false);
                }
                String number = "";
                String query1 = "select * from " + passkey;
                try {
                    Statement statement = con.createStatement();
                    ResultSet set = statement.executeQuery(query1);
                    while (set.next()) {
                        number = set.getString("task_no");
                    }
                    String query2 = "delete from " + passkey + " where task_no = " + number;
                    PreparedStatement statement1 = con.prepareStatement(query2);
                    statement1.executeUpdate();
                    frame2.panel4.model.removeRow(frame2.panel4.model.getRowCount()-1);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        } else if (e.getSource()==Update)
        {
        if(! ( frame2.panel4.model.getRowCount()==0))
        {
            frame2.panel4.box.setEnabled(true);
            frame2.panel4.chooser.setEnabled(true);
            frame2.panel4.picker.setEnabled(true);
            frame2.panel4.box2.setEnabled(true);
            update2.setEnabled(true);
        }
        }else if(e.getSource()==update2)
        {
            String mainq="";
            if((frame2.panel4.box.getText().trim().matches("\\d+"))&&((!(frame2.panel4.picker.getText().trim().equals("")))||(!(frame2.panel4.chooser.getDate()==null))||(!(frame2.panel4.box2.getText().equals("")))))
            {
                String task=frame2.panel4.box2.getText();
                String time=frame2.panel4.picker.getText().trim();

                String number=frame2.panel4.box.getText();
                if((!(frame2.panel4.box2.getText().trim()==null)) && (!(frame2.panel4.chooser.getDate()==null)) && (!(frame2.panel4.picker.getText().trim().equals(""))))
                {
                    String date=frame2.panel4.chooser.getDate().toString();
                    mainq ="update "+passkey+" set task_name="+"'"+task+"' ,"+"time="+"'"+time+"' ,"+"date="+"'"+date+"' "+"where task_no="+number;
                }else if((!(frame2.panel4.box2.getText().trim()==null)) && (!(frame2.panel4.chooser.getDate()==null)))
                {
                    String date=frame2.panel4.chooser.getDate().toString();
                    mainq="update "+passkey+" set task_name="+"'"+task+"' ,"+"date="+"'"+date+"' "+"where task_no="+number;
                } else if ((!(frame2.panel4.chooser.getDate()==null)) && (!(frame2.panel4.picker.getText().trim().equals(""))))
                {
                    String date=frame2.panel4.chooser.getDate().toString();
                   mainq="update "+passkey+" set time="+"'"+time+"' ,"+"date="+"'"+date+"' "+"where task_no="+number;
                }
                else if((!(frame2.panel4.box2.getText().trim()==null)) &&  (!(frame2.panel4.picker.getText().trim().equals(""))))
                {
                    mainq="update "+passkey+" set task_name="+"'"+task+"' ,"+"time="+"'"+time+"' "+"where task_no="+number;
                }
                else if((!(frame2.panel4.box2.getText().trim()==null)))
                {
                    mainq="update "+passkey+" set task_name="+"'"+task+"' "+"where task_no="+number;
                } else if ((!(frame2.panel4.picker.getText().trim().equals(""))))
                {
                   mainq="update "+passkey+" set time="+"'"+time+"' "+"where task_no="+number;
                }else if((!(frame2.panel4.chooser.getDate()==null)) )
                {
                    String date=frame2.panel4.chooser.getDate().toString();
                    mainq="update "+passkey+" set date="+"'"+date+"' "+"where task_no="+number;
                }


                frame2.panel4.box.setEnabled(false);
                frame2.panel4.chooser.setEnabled(false);
                frame2.panel4.picker.setEnabled(false);
                frame2.panel4.box2.setEnabled(false);
                update2.setEnabled(false);
                frame2.panel4.box.setText(null);
                frame2.panel4.chooser.setDate(null);
                frame2.panel4.picker.setText(null);
                frame2.panel4.box2.setText(null);






                try
                {
                    frame2.panel4.model.setRowCount(0);
                    PreparedStatement statement=con.prepareStatement(mainq);
                    statement.executeUpdate();

                    Statement statement4 = con.createStatement();
                        String qq="select * from "+passkey+";";
                        ResultSet dataset=statement4.executeQuery(qq);
                        while(dataset.next())
                        {
                            frame2.panel4.model.addRow(new Object[]{dataset.getString("task_no"),dataset.getString("task_name"),dataset.getString("time"),dataset.getString("date")});
                        }

                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }


            }
            else
            {
                JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID DETAILS!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource()==profile)
        {

            count2 = 0;
            count1 = 0;
            count3=0;
            count4=0;
            count5=0;
            frame2.panel1.setVisible(false);//and set another panel true
            frame2.panel2.setVisible(false);
            frame2.panel3.setVisible(false);
            frame2.panel4.setVisible(false);
            String mm="";
            frame2.panel5.setVisible(true);
            try
            {
                String qq="select email from user where passkey=\'"+passkey+"\';";
                Statement statement=con.createStatement();
                ResultSet set=statement.executeQuery(qq);
                while (set.next()) {
                     mm = set.getString("email");
                }
                LocalDate date=LocalDate.now();
                LocalTime time=LocalTime.now();
                String Date=date.toString();
                String Time=time.toString();
                 String label2text="E-MAIL  : "+mm;
                String label3text="PASS_KEY : "+passkey;
                String label4text="ACESS TIME : "+Time;
                String label5text="ACESS DATE :"+Date;
                frame2.panel5.label2.setText(label2text);
                frame2.panel5.label3.setText(label3text);
                frame2.panel5.label4.setText(label4text);
                frame2.panel5.label5.setText(label5text);

            }catch (Exception ex)
            {
                System.out.println(ex);
            }




        }

    }
    }



