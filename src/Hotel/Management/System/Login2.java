package Hotel.Management.System;

import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;

public class Login2 extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField1;

    SlidingButton b1, b2;

    Login2()
    {
        JLabel label1=new JLabel("Username:");
        label1.setBounds(280,160,400,100);
        label1.setForeground(Color.white);
        label1.setFont(new Font("tahoma",Font.BOLD,20));
        add(label1);

        JLabel label2=new JLabel("Password:");
        label2.setBounds(280,270,400,100);
        label2.setForeground(Color.white);
        label2.setFont(new Font("tahoma",Font.BOLD,20));
        add(label2);

        textField1 = new RoundedTextField(20);
        textField1.setBounds(470,195,250,35);
        textField1.setFont(new Font("times new roman",Font.PLAIN,17));
        textField1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                textField1.setBackground(Color.white);
                textField1.setForeground(Color.black);
            }
            public void mouseExited(MouseEvent evt)
            {
                textField1.setBackground(Color.black);
                textField1.setForeground(Color.white);
            }
        });
        add(textField1);

        passwordField1 = new RoundedPasswordField(20);
        passwordField1.setBounds(470,303,250,35);
        passwordField1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                passwordField1.setBackground(Color.white);
                passwordField1.setForeground(Color.black);
            }
            public void mouseExited(MouseEvent evt)
            {
                passwordField1.setBackground(Color.black);
                passwordField1.setForeground(Color.white);
            }
        });
        add(passwordField1);

        b1 = new SlidingButton("Login", Color.green, 1.0f); // rounded with full slider
        b1.setBounds(280, 432, 450, 50);
        b1.setFont(new Font("times new roman", Font.BOLD, 20));
        b1.setBackground(Color.WHITE);
        b1.setBorder(null);
        b1.addActionListener(this);
        b1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.white);
            }
            public void mouseExited(MouseEvent evt)
            {
                b1.setBackground(Color.white);
                b1.setForeground(Color.black);
            }
        });
        add(b1);

        b2 = new SlidingButton("Cancel", Color.RED, 1.0f); // rounded with full slider
        b2.setBounds(280, 545, 450, 50); // For example
        b2.setFont(new Font("times new roman", Font.BOLD, 20));
        b2.setBackground(Color.WHITE);
        b2.setBorder(null);
        b2.addActionListener(this);
        b2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                b2.setBackground(Color.BLACK);
                b2.setForeground(Color.white);
            }
            public void mouseExited(MouseEvent evt)
            {
                b2.setBackground(Color.white);
                b2.setForeground(Color.black);
            }
        });
        add(b2);

        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel label3=new JLabel(imageIcon2);
        label3.setBounds(750,195,500,400);
        Image i1=imageIcon2.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        add(label3);

        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(-5,-5,1580,870,50,50));
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setLocation(-10,0);
        setSize(1550,870);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
        {
            try
            {
                Connect c=new Connect();
                String user=textField1.getText();
                String pass=passwordField1.getText();
                String q="select * from login2 where user_name='"+user+"' and password='"+pass+"'";
                ResultSet resultSet= c.statement.executeQuery(q);
                if(resultSet.next())
                {
                    new admin();
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }
            }
            catch (Exception E)
            {
                E.printStackTrace();
            }
        }
        else
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
        new Login2();
    }
}
