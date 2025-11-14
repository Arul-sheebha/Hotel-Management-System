package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {

    JCheckBox checkBox;
    Choice choice;
    JTable table;
    SlidingButton add,back;
    SearchRoom()
    {
        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);


        JLabel searchForRoom=new JLabel("Search For Room");
        searchForRoom.setBounds(250,11,186,31);
        searchForRoom.setForeground(Color.white);
        searchForRoom.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(searchForRoom);



        JLabel rbt =new JLabel("Room Bed Type:");
        rbt.setBounds(50,73,120,14);
        rbt.setForeground(Color.white);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbt);


        JLabel rn =new JLabel("Room Number");
        rn.setBounds(23,162,150,20);
        rn.setForeground(Color.white);
        rn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rn);



        JLabel available =new JLabel("Availability");
        available.setBounds(175,162,150,20);
        available.setForeground(Color.white);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);



        JLabel price =new JLabel("Price");
        price.setBounds(458,162,150,20);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);



        JLabel BT=new JLabel("Bed Type");
        BT.setBounds(580,162,150,20);
        BT.setForeground(Color.white);
        BT.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(BT);



        JLabel SS=new JLabel("Clean Status");
        SS.setBounds(306,162,150,20);
        SS.setForeground(Color.white);
        SS.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(SS);



        checkBox=new JCheckBox("Only Display Available");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.white);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);



        choice=new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170,70,120,20);
        panel.add(choice);



        table=new JTable();
        table.setBounds(0,187,700,150);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);


        try {
            Connect c=new Connect();
            String q="select * from room";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        add=new SlidingButton("Search",new Color(1, 248, 182),1.0f);
        add.setBounds(200,400,120,35);
        add.setFont(new Font("tahoma",Font.BOLD,15));
        add.setBackground(new Color(3, 3, 248));
        add.setForeground(new Color(1, 248, 182));
        add.setBorder(null);
        add.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add.setBackground(new Color(3, 3, 248));
                add.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                add.setBackground(new Color(3, 3, 248));
                add.setForeground(new Color(1, 248, 182));
            }
        });
        add.addActionListener(this);
        panel.add(add);



        back=new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(380,400,120,35);
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
        back.addActionListener(this);
        panel.add(back);






        setUndecorated(true);
        setLayout(null);
        setLocation(500,200);
        setSize(700,500);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            String Q="select * from Room where bed_type='"+choice.getSelectedItem()+"'";
            String Q1="select * from Room where availability='Available' And bed_type='"+choice.getSelectedItem()+"'";
            try {
                Connect c=new Connect();
                ResultSet resultSet=c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
                if(checkBox.isSelected())
                {
                    ResultSet resultSet1=c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }
            }
            catch (Exception E)
            {
                E.printStackTrace();
            }
        }else
        {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
    new SearchRoom();
    }
}
