package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class Employee extends JFrame {
    Employee()
    {

        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);



        JTable table=new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.white);
        table.setBackground(new Color(3,45,48));
        panel.add(table);



        try
        {
            Connect c=new Connect();
            String EmployeeSQL="select * from Employee";
            ResultSet resultSet=c.statement.executeQuery(EmployeeSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        SlidingButton back=new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(430,500,120,35);
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




        JLabel name=new JLabel("Name");
        name.setBounds(41,11,70,19);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);




        JLabel Age=new JLabel("Age");
        Age.setBounds(159,11,70,19);
        Age.setForeground(Color.white);
        Age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Age);



        JLabel gender=new JLabel("Gender");
        gender.setBounds(273,11,70,19);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);



        JLabel job=new JLabel("Job");
        job.setBounds(416,11,70,19);
        job.setForeground(Color.white);
        job.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(job);



        JLabel salary =new JLabel("Salary");
        salary.setBounds(536,11,70,19);
        salary.setForeground(Color.white);
        salary.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(salary);



        JLabel phone =new JLabel("Phone");
        phone.setBounds(656,11,70,19);
        phone.setForeground(Color.white);
        phone.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(phone);



        JLabel gmail =new JLabel("Gmail");
        gmail.setBounds(786,11,70,19);
        gmail.setForeground(Color.white);
        gmail.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gmail);



        JLabel aadhar =new JLabel("Aadhar");
        aadhar.setBounds(896,11,70,19);
        aadhar.setForeground(Color.white);
        aadhar.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(aadhar);



        setUndecorated(true);
        setLayout(null);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Employee();
    }
}
