package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class admin extends JFrame implements ActionListener {

    SlidingButton add_Employee,add_Room,add_Drivers,logout,back;

    admin()
    {

        add_Employee=new SlidingButton("ADD EMPLOYEE",new Color(94, 11, 3),1.0f);
        add_Employee.setBounds(450,50,300,45 );
        add_Employee.setFont(new Font("tahoma",Font.BOLD,20));
        add_Employee.setBackground(new Color(194, 1, 248));
        add_Employee.setForeground(new Color(250, 1, 22));
        add_Employee.setBorder(null);
        add(add_Employee);
        add_Employee.addActionListener(this);
        add_Employee.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add_Employee.setBackground(new Color(5, 117, 82));
                add_Employee.setForeground(new Color(3, 248, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                add_Employee.setBackground(new Color(194, 1, 248));
                add_Employee.setForeground(new Color(250, 1, 22));
            }
        });



        add_Room=new SlidingButton("ADD ROOM",new Color(94, 11, 3),1.0f);
        add_Room.setBounds(450,250,300,45 );
        add_Room.setFont(new Font("tahoma",Font.BOLD,20));
        add_Room.setBackground(new Color(194, 1, 248));
        add_Room.setForeground(new Color(250, 1, 22));
        add_Room.setBorder(null);
        add(add_Room);
        add_Room.addActionListener(this);
        add_Room.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add_Room.setBackground(new Color(5, 117, 82));
                add_Room.setForeground(new Color(3, 248, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                add_Room.setBackground(new Color(194, 1, 248));
                add_Room.setForeground(new Color(250, 1, 22));
            }
        });



        add_Drivers=new SlidingButton("ADD DRIVERS",new Color(94, 11, 3),1.0f);
        add_Drivers.setBounds(450,450,300,45 );
        add_Drivers.setFont(new Font("tahoma",Font.BOLD,20));
        add_Drivers.setBackground(new Color(194, 1, 248));
        add_Drivers.setForeground(new Color(250, 1, 22));
        add_Drivers.setBorder(null);
        add(add_Drivers);
        add_Drivers.addActionListener(this);
        add_Drivers.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add_Drivers.setBackground(new Color(5, 117, 82));
                add_Drivers.setForeground(new Color(3, 248, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                add_Drivers.setBackground(new Color(194, 1, 248));
                add_Drivers.setForeground(new Color(250, 1, 22));
            }
        });


        logout=new SlidingButton("Logout",new Color(94, 11, 3),1.0f);
        logout.setBounds(100,650,650,60 );
        logout.setFont(new Font("tahoma",Font.BOLD,20));
        logout.setBackground(new Color(194, 1, 248));
        logout.setForeground(new Color(250, 1, 22));
        logout.setBorder(null);
        add(logout);
        logout.addActionListener(this);
        logout.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                logout.setBackground(new Color(5, 117, 82));
                logout.setForeground(new Color(3, 248, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                logout.setBackground(new Color(194, 1, 248));
                logout.setForeground(new Color(250, 1, 22));
            }
        });




        back=new SlidingButton("Back",new Color(94, 11, 3),1.0f);
        back.setBounds(100,750,650,60 );
        back.setFont(new Font("tahoma",Font.BOLD,20));
        back.setBackground(new Color(194, 1, 248));
        back.setForeground(new Color(250, 1, 22));
        back.setBorder(null);
        add(back);
        back.addActionListener(this);
        back.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                back.setBackground(new Color(5, 117, 82));
                back.setForeground(new Color(3, 248, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                back.setBackground(new Color(194, 1, 248));
                back.setForeground(new Color(250, 1, 22));
            }
        });



        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11=l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(l11);
        JLabel label=new JLabel(imageIcon);
        label.setBounds(150,15,120,120);
        add(label);



        ImageIcon imageIcon1=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image=imageIcon1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11=new ImageIcon(image);
        JLabel label1=new JLabel(imageIcon11);
        label1.setBounds(150,210,120,120);
        add(label1);



        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1=imageIcon2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12=new ImageIcon(image1);
        JLabel label2=new JLabel(imageIcon12);
        label2.setBounds(150,400,120,120);
        add(label2);



        ImageIcon imageIcon3=new ImageIcon(ClassLoader.getSystemResource("icon/red.gif"));
        Image image2=imageIcon3.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon13=new ImageIcon(image2);
        JLabel label3=new JLabel(imageIcon13);
        label3.setBounds(1000,220,400,400);
        add(label3);



        getContentPane().setBackground(new Color(39, 112, 2));
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(-5,-5,1580,870,50,50));
        setSize(1550,870);
        setLocation(-10,0);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add_Employee)
        {
            new AddEmployee();
        }
        else if(e.getSource()==add_Room)
        {
            new AddRoom();
        }
        else if(e.getSource()==add_Drivers)
        {
            new addDriver();
        }
        else if(e.getSource()==logout) {
            System.exit(102);
        }
        else if(e.getSource()==back)
        {
            new Dashboard() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            };
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new admin();
    }
}
