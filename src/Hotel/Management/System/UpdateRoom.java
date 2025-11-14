package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame {
    UpdateRoom()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);


        JLabel label1=new JLabel("Update Room Status");
        label1.setBounds(90,11,222,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 =new JLabel("ID:");
        label2.setBounds(25,88,46,14);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        label2.setForeground(Color.white);
        panel.add(label2);


        Choice choice=new Choice();
        choice.setBounds(248,85,140,20);
        panel.add(choice);

        try {
            Connect C=new Connect();
            ResultSet resultSet=C.statement.executeQuery("select * from customer");
            while (resultSet.next())
            {
                choice.add(resultSet.getString("number"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        JLabel label3 =new JLabel("Room Number:");
        label3.setBounds(25,129,107,14);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        label3.setForeground(Color.white);
        panel.add(label3);


        JTextField textField3=new JTextField();
        textField3.setBounds(248,129,140,20);
        panel.add(textField3);


        JLabel label4 =new JLabel("Availability:");
        label4.setBounds(25,174,97,14);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        label4.setForeground(Color.white);
        panel.add(label4);


        JTextField textField4=new JTextField();
        textField4.setBounds(248,174,140,20);
        panel.add(textField4);


        JLabel label5 =new JLabel("Clean Status:");
        label5.setBounds(25,216,97,14);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        label5.setForeground(Color.white);
        panel.add(label5);


        JTextField textField5 =new JTextField();
        textField5.setBounds(248,216,140,20);
        panel.add(textField5);



        SlidingButton update =new SlidingButton("Update",new Color(1, 248, 182),1.0f);
        update.setBounds(120,315,89,35);
        update.setFont(new Font("tahoma",Font.BOLD,15));
        update.setBackground(new Color(3, 3, 248));
        update.setForeground(new Color(1, 248, 182));
        update.setBorder(null);
        update.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                update.setBackground(new Color(3, 3, 248));
                update.setForeground(new Color(107, 103, 199));
            }
            public void mouseExited(MouseEvent evt)
            {
                update.setBackground(new Color(3, 3, 248));
                update.setForeground(new Color(1, 248, 182));
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connect c=new Connect();
                    String status=textField5.getText();
                    c.statement.executeUpdate("update room set cleaning_status='"+status+"' where roomnumber="+textField3.getText());

                    JOptionPane.showMessageDialog(null,"Updated Successfully");
                    setVisible(false);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        panel.add(update);


        SlidingButton back =new SlidingButton("Back",new Color(1, 248, 182),1.0f);
        back.setBounds(180,355,89,35);
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



        SlidingButton check =new SlidingButton("Check",new Color(1, 248, 182),1.0f);
        check.setBounds(60,355,89,35);
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
                String id=choice.getSelectedItem();
                String q="select * from customer where number='"+id+"'";
                try {
                    Connect C=new Connect();
                    ResultSet resultSet=C.statement.executeQuery(q);
                    while (resultSet.next())
                    {
                        textField3.setText(resultSet.getString("room"));

                    }
                    ResultSet resultSet1=C.statement.executeQuery("select * from room where roomnumber='"+textField3.getText()+"'");
                    while (resultSet1.next())
                    {
                        textField4.setText(resultSet1.getString("availability"));
                        textField5.setText(resultSet1.getString("cleaning_status"));
                    }
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        panel.add(check);


        setUndecorated(true);
        setLayout(null);
        setSize(950,500);
        setLocation(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateRoom();
    }
}
