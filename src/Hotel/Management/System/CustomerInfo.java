package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        JTable table=new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);


        try
        {
            Connect c=new Connect();
            String q="select * from Customer";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        JLabel id=new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setForeground(Color.white);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);


        JLabel number=new JLabel("Number");
        number.setBounds(150,11,100,14);
        number.setForeground(Color.white);
        number.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(number);



        JLabel name =new JLabel("Name");
        name.setBounds(270,11,100,14);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);



        JLabel gender =new JLabel("Gender");
        gender.setBounds(360,11,100,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);



        JLabel country =new JLabel("Country");
        country.setBounds(480,11,100,14);
        country.setForeground(Color.white);
        country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(country);



        JLabel room =new JLabel("Room");
        room.setBounds(600,11,100,14);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(room);



        JLabel Time =new JLabel("CI Time");
        Time.setBounds(680,11,100,14);
        Time.setForeground(Color.white);
        Time.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Time);



        JLabel Deposit =new JLabel("Deposit");
        Deposit.setBounds(800,11,100,14);
        Deposit.setForeground(Color.white);
        Deposit.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Deposit);


        SlidingButton back=new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(400,510,120,35);
        back.setFont(new Font("tahoma",Font.BOLD,15));
        back.setBackground(new Color(3, 3, 248));
        back.setForeground(new Color(1, 248, 182));
        back.setBorder(null);
        panel.add(back);
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
                try {
                    setVisible(false);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });





        setUndecorated(true);
        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerInfo();
    }
}
