package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    CheckOut()
    {

        JPanel panel=new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label=new JLabel("Check-Out");
        label.setBounds(100,20,150,30);
        label.setFont(new Font("Tahoma",Font.PLAIN,20));
        label.setForeground(Color.white);
        panel.add(label);


        JLabel UserId =new JLabel("Customer Id");
        UserId.setBounds(30,80,150,30);
        UserId.setFont(new Font("Tahoma",Font.BOLD,14));
        UserId.setForeground(Color.white);
        panel.add(UserId);


        Choice Customer=new Choice();
        Customer.setBounds(200,80,150,25);
        panel.add(Customer);



        JLabel roomNum =new JLabel("Room Number");
        roomNum.setBounds(30,130,150,30);
        roomNum.setFont(new Font("Tahoma",Font.BOLD,14));
        roomNum.setForeground(Color.white);
        panel.add(roomNum);


        JLabel labelRoomnumber =new JLabel();
        labelRoomnumber.setBounds(200,130,150,30);
        labelRoomnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        labelRoomnumber.setForeground(Color.white);
        panel.add(labelRoomnumber);


        JLabel checkintime =new JLabel("Check-In Time");
        checkintime.setBounds(30,180,150,30);
        checkintime.setFont(new Font("Tahoma",Font.BOLD,14));
        checkintime.setForeground(Color.white);
        panel.add(checkintime);



        JLabel labelcheckintime =new JLabel();
        labelcheckintime.setBounds(200,180,200,30);
        labelcheckintime.setFont(new Font("Tahoma",Font.BOLD,14));
        labelcheckintime.setForeground(Color.white);
        panel.add(labelcheckintime);


        JLabel checkouttime =new JLabel("Check-Out Time");
        checkouttime.setBounds(30,230,150,30);
        checkouttime.setFont(new Font("Tahoma",Font.BOLD,14));
        checkouttime.setForeground(Color.white);
        panel.add(checkouttime);


        Date date=new Date();


        JLabel labelcheckouttime =new JLabel(""+date);
        labelcheckouttime.setBounds(200,230,200,30);
        labelcheckouttime.setFont(new Font("Tahoma",Font.BOLD,14));
        labelcheckouttime.setForeground(Color.white);
        panel.add(labelcheckouttime);


        try {
            Connect c=new Connect();
            ResultSet resultSet=c.statement.executeQuery("select * from customer");
            while (resultSet.next())
            {
                Customer.add(resultSet.getString("number"));
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }



        SlidingButton checkOut =new SlidingButton("Check-Out",new Color(1, 248, 182),1.0f);
        checkOut.setBounds(30,300,120,35);
        checkOut.setFont(new Font("tahoma",Font.BOLD,15));
        checkOut.setBackground(new Color(3, 3, 248));
        checkOut.setForeground(new Color(1, 248, 182));
        checkOut.setBorder(null);
        checkOut.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                checkOut.setBackground(new Color(3, 3, 248));
                checkOut.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                checkOut.setBackground(new Color(3, 3, 248));
                checkOut.setForeground(new Color(1, 248, 182));
            }
        });
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Connect cv=new Connect();
                    cv.statement.executeUpdate("delete from customer where number='"+Customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability='Available' where roomnumber='"+labelRoomnumber.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        panel.add(checkOut);



        SlidingButton check =new SlidingButton("Check",new Color(1, 248, 182),1.0f);
        check.setBounds(305,300,120,35);
        check.setFont(new Font("tahoma",Font.BOLD,15));
        check.setBackground(new Color(3, 3, 248));
        check.setForeground(new Color(1, 248, 182));
        check.setBorder(null);
        check.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                check.setBackground(new Color(3, 3, 248));
                check.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                check.setBackground(new Color(3, 3, 248));
                check.setForeground(new Color(1, 248, 182));
            }
        });
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connect c=new Connect();
                try {
                    ResultSet resultSet=c.statement.executeQuery("select * from customer where number='"+Customer.getSelectedItem()+"'");
                    while (resultSet.next())
                    {
                        labelRoomnumber.setText(resultSet.getString("room"));
                        labelcheckintime.setText(resultSet.getString("checkintime"));
                    }
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        panel.add(check);



        SlidingButton back =new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(170,300,120,35);
        back.setFont(new Font("tahoma",Font.BOLD,15));
        back.setBackground(new Color(3, 3, 248));
        back.setForeground(new Color(1, 248, 182));
        back.setBorder(null);
        back.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                back.setBackground(new Color(3, 3, 248));
                back.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                back.setBackground(new Color(3, 3, 248));
                back.setForeground(new Color(1, 248, 182));
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);





        setUndecorated(true);
        setLayout(null);
        setSize(800,400);
        setLocation(500,210);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckOut();
    }
}
