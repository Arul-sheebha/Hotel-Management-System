package Hotel.Management.System;

import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;



public abstract class Dashboard extends JFrame implements ActionListener, MouseListener
{
    JButton add,rec;

    Dashboard()
    {
        rec = new SlidingButton("RECEPTION",  new Color(99,3, 136), 1.0f);
        rec.setBounds(470,530,150,35);
        rec.setBorder(null);
        rec.setFont(new Font("tahoma",Font.BOLD,15));
        rec.addActionListener(this);
        rec.setBackground(Color.pink);
        rec.setForeground(Color.black);
        rec.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                rec.setBackground(Color.pink);
                rec.setForeground(Color.white);
            }
            public void mouseExited(MouseEvent evt)
            {
                rec.setBackground(Color.pink);
                rec.setForeground(Color.black);
            }
        });
        add(rec);

        add = new SlidingButton("ADMIN", new Color(99,3, 136), 1.0f);
        add.setBorder(null);
        add.setBounds(950,530,159,35);
        add.setFont(new Font("tahoma",Font.BOLD,15));
        add.addActionListener(this);
        add.setBackground(Color.pink);
        add.setForeground(Color.black);
        add.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add.setBackground(Color.pink);
                add.setForeground(Color.white);
            }
            public void mouseExited(MouseEvent evt)
            {
                add.setBackground(Color.pink);
                add.setForeground(Color.black);
            }
        });
        add(add);

        ImageIcon imageIcon11=new ImageIcon(ClassLoader.getSystemResource("icon/boss1.png"));
        Image i11=imageIcon11.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111=new ImageIcon(i11);
        JLabel label1=new JLabel(imageIcon111);
        label1.setBounds(775,150,500,500);
        add(label1);

        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/Reception8.png"));
        Image i12=imageIcon2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12=new ImageIcon(i12);
        JLabel label2=new JLabel(imageIcon12);
        label2.setBounds(295,150,500,500);
        add(label2);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(1550,870,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(0,0,1550,870);
        add(label);

        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(-5,-5,1580,870,50,50));
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setLocation(-10,0);
        setSize(1550,870);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==rec)
        {
            new Reception();
            setVisible(false);
        }
        else
        {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[]args)
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
    }
}
