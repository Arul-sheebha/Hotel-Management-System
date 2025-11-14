package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class Department extends JFrame  {

    Department()
    {

        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);




        JTable table=new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(4,45,48));
        table.setForeground(Color.white);
        panel.add(table);



        try
        {
            Connect c=new Connect();
            String departmentInfo="select * from department";
            ResultSet resultSet=c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }




        SlidingButton back=new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(300,410,120,35);
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




        JLabel label1=new JLabel("Department");
        label1.setBounds(145,11,105,20);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);



        JLabel label2 =new JLabel("Budget");
        label2.setBounds(431,11,105,20);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);



        setUndecorated(true);
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Department();
    }
}
