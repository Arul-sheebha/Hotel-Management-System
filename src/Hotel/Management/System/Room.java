package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public class Room extends JFrame {

    JTable table;

    SlidingButton back;

    Room()
    {

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomm3.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);



        table=new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);


        try
        {
            Connect c=new Connect();
            String RoomInfo="select * from room";
            ResultSet resultSet=c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }




        back=new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(200,500,120,35);
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
                try {
                    setVisible(false);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        panel.add(back);




        JLabel room =new JLabel("Room No.");
        room.setBounds(12,15,80,19);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(room);




        JLabel availablity=new JLabel("Availability");
        availablity.setBounds(119,15,80,19);
        availablity.setForeground(Color.white);
        availablity.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availablity);



        JLabel Clean =new JLabel("Clean Status");
        Clean.setBounds(216,15,150,19);
        Clean.setForeground(Color.white);
        Clean.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Clean);



        JLabel Price =new JLabel("Price");
        Price.setBounds(330,15,80,19);
        Price.setForeground(Color.white);
        Price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Price);



        JLabel Bed =new JLabel("Bed Type");
        Bed.setBounds(417,15,80,19);
        Bed.setForeground(Color.white);
        Bed.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Bed);



        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Room();
    }
}
