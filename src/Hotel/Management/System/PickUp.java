package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class PickUp extends JFrame {
    PickUp()
    {

        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,790,590);
        panel.setLayout(null);
        add(panel);


        JLabel pus =new JLabel("Pick Up Service");
        pus.setBounds(90,11,160,25);
        pus.setForeground(Color.white);
        pus.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(pus);



        JLabel TOC =new JLabel("Type of Car");
        TOC.setBounds(32,97,89,14);
        TOC.setForeground(Color.white);
        TOC.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(TOC);



        Choice c=new Choice();
        c.setBounds(123,94,150,25);
        panel.add(c);

        try {
            Connect C=new Connect();
            ResultSet resultSet=C.statement.executeQuery("select * from driver");
            while (resultSet.next())
            {
                c.add(resultSet.getString("carname"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        JTable table=new JTable();
        table.setBounds(10,233,800,250);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);


        try
        {
            Connect C=new Connect();
            String q="select * from driver";
            ResultSet resultSet=C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        JLabel name=new JLabel("Name");
        name.setBounds(24,208,46,14);
        name.setForeground(Color.white);
        panel.add(name);



        JLabel age =new JLabel("Age");
        age.setBounds(165,208,46,14);
        age.setForeground(Color.white);
        panel.add(age);


        JLabel gender =new JLabel("Gender");
        gender.setBounds(264,208,46,14);
        gender.setForeground(Color.white);
        panel.add(gender);


        JLabel company =new JLabel("Company");
        company.setBounds(366,208,100,14);
        company.setForeground(Color.white);
        panel.add(company);


        JLabel Carname =new JLabel("Car Name");
        Carname.setBounds(486,208,100,14);
        Carname.setForeground(Color.white);
        panel.add(Carname);


        JLabel available =new JLabel("Available");
        available.setBounds(600,208,100,14);
        available.setForeground(Color.white);
        panel.add(available);


        JLabel location =new JLabel("Location");
        location.setBounds(700,208,100,14);
        location.setForeground(Color.white);
        panel.add(location);


        SlidingButton display=new SlidingButton("Display",new Color(1, 248, 182),1.0f);
        display.setBounds(200,500,120,35);
        display.setFont(new Font("tahoma",Font.BOLD,15));
        display.setBackground(new Color(3, 3, 248));
        display.setForeground(new Color(1, 248, 182));
        display.setBorder(null);
        display.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                display.setBackground(new Color(3, 3, 248));
                display.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                display.setBackground(new Color(3, 3, 248));
                display.setForeground(new Color(1, 248, 182));
            }
        });
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q="select * from driver where carname='"+c.getSelectedItem()+"'";
                try {
                    Connect c=new Connect();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        panel.add(display);


        SlidingButton Back =new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        Back.setBounds(420,500,120,35);
        Back.setFont(new Font("tahoma",Font.BOLD,15));
        Back.setBackground(new Color(3, 3, 248));
        Back.setForeground(new Color(1, 248, 182));
        Back.setBorder(null);
        Back.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                Back.setBackground(new Color(3, 3, 248));
                Back.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                Back.setBackground(new Color(3, 3, 248));
                Back.setForeground(new Color(1, 248, 182));
            }
        });
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(Back);

        setUndecorated(true);
        setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PickUp();
    }
}
