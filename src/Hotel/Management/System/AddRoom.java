package Hotel.Management.System;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.Stack;

public class AddRoom extends JFrame implements ActionListener{

    RoundedTextField t2,t4;
    JComboBox t3,t5,t6;
    SlidingButton b1,b2;

    AddRoom()
    {

        JPanel panel=new JPanel();
        panel.setBounds(20,10,1516,842);
        panel.setBackground(new Color(2, 253, 128));
        panel.setLayout(null);
        add(panel);


        JLabel l1=new JLabel("Add Rooms");
        l1.setBounds(350,30,350,35);
        l1.setFont(new Font("tahoma",Font.BOLD,40));
        l1.setForeground(Color.white);
        panel.add(l1);


        JLabel l2=new JLabel("Room Number");
        l2.setBounds(140,135,250,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,30));
        l2.setForeground(Color.white);
        panel.add(l2);


        t2 = new RoundedTextField(20);
        t2.setBounds(590,135,280,40);
        t2.setFont(new Font("times new roman",Font.PLAIN,20));
        t2.setBackground(new Color(38, 2, 72));
        t2.setForeground(new Color(250, 97, 2));
        t2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                t2.setBackground(new Color(2, 253, 128));
                t2.setForeground(new Color(93, 84, 84));

            }
            public void mouseExited(MouseEvent evt)
            {
                t2.setBackground(new Color(38, 2, 72));
                t2.setForeground(new Color(250, 97, 2));
            }
        });
        panel.add(t2);


        JLabel l3=new JLabel("Availability");
        l3.setBounds(140,250,250,35);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.white);
        panel.add(l3);



        t3 = new JComboBox<>(new String[]{"Available", "Occupied"});
        t3.setBounds(590, 250, 280, 40);
        t3.setFont(new Font("times new roman", Font.PLAIN, 20));
        t3.setForeground(new Color(250, 97, 2));
        t3.setBackground(new Color(38, 2, 72));

        // Remove default opacity and border
        t3.setOpaque(false);
        t3.setBorder(new EmptyBorder(5, 10, 5, 10));

        // Custom UI for round shape
        t3.setUI(new BasicComboBoxUI() {
            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Rounded rectangle background
                g2.setColor(t3.getBackground());
                g2.fill(new RoundRectangle2D.Double(bounds.x, bounds.y, bounds.width, bounds.height, 20, 20));

                g2.dispose();
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fill background
                g2.setColor(t3.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 20, 20);

                super.paint(g2, c);

                g2.dispose();
            }
        });

        panel.add(t3);



        JLabel l4=new JLabel("Price");
        l4.setBounds(140,360,280,40);
        l4.setFont(new Font("Tahoma",Font.BOLD,30));
        l4.setForeground(Color.white);
        panel.add(l4);



        t4 = new RoundedTextField(20);
        t4.setBounds(590,360,280,40);
        t4.setFont(new Font("times new roman",Font.PLAIN,20));
        t4.setBackground(new Color(38, 2, 72));
        t4.setForeground(new Color(250, 97, 2));
        t4.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                t4.setBackground(new Color(2, 253, 128));
                t4.setForeground(new Color(93, 84, 84));

            }
            public void mouseExited(MouseEvent evt)
            {
                t4.setBackground(new Color(38, 2, 72));
                t4.setForeground(new Color(250, 97, 2));
            }
        });
        panel.add(t4);



        JLabel l5=new JLabel("Cleaning Status");
        l5.setBounds(140,470,280,40);
        l5.setFont(new Font("Tahoma",Font.BOLD,30));
        l5.setForeground(Color.white);
        panel.add(l5);



        t5 = new JComboBox<>(new String[]{"Cleaned", "Dirty"});
        t5.setBounds(590, 470, 280, 40);
        t5.setFont(new Font("times new roman", Font.PLAIN, 20));
        t5.setForeground(new Color(250, 97, 2));
        t5.setBackground(new Color(38, 2, 72));

        // Remove default opacity and border
        t5.setOpaque(false);
        t5.setBorder(new EmptyBorder(5, 10, 5, 10));

        // Custom UI for round shape
        t5.setUI(new BasicComboBoxUI() {
            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Rounded rectangle background
                g2.setColor(t5.getBackground());
                g2.fill(new RoundRectangle2D.Double(bounds.x, bounds.y, bounds.width, bounds.height, 20, 20));

                g2.dispose();
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fill background
                g2.setColor(t5.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 20, 20);

                super.paint(g2, c);

                g2.dispose();
            }
        });

        panel.add(t5);




        JLabel l6=new JLabel("Bed Type");
        l6.setBounds(140,580,280,40);
        l6.setFont(new Font("Tahoma",Font.BOLD,30));
        l6.setForeground(Color.white);
        panel.add(l6);



        t6 = new JComboBox<>(new String[]{"Single Bed", "Double Bed"});
        t6.setBounds(590, 580, 280, 40);
        t6.setFont(new Font("times new roman", Font.PLAIN, 20));
        t6.setForeground(new Color(250, 97, 2));
        t6.setBackground(new Color(38, 2, 72));

        // Remove default opacity and border
        t6.setOpaque(false);
        t6.setBorder(new EmptyBorder(5, 10, 5, 10));

        // Custom UI for round shape
        t6.setUI(new BasicComboBoxUI() {
            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Rounded rectangle background
                g2.setColor(t6.getBackground());
                g2.fill(new RoundRectangle2D.Double(bounds.x, bounds.y, bounds.width, bounds.height, 20, 20));

                g2.dispose();
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fill background
                g2.setColor(t6.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 20, 20);

                super.paint(g2, c);

                g2.dispose();
            }
        });

        panel.add(t6);




        b1 = new SlidingButton("Add",new Color(38, 2, 72), 1.0f); // rounded with full slider
        b1.setBounds(135,720,280,50);
        b1.setFont(new Font("times new roman", Font.BOLD, 30));
        b1.setBackground(new Color(253, 2, 10));
        b1.setForeground(new Color(38, 2, 72));
        b1.setBorder(null);
        b1.addActionListener(this);
        b1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                b1.setForeground(new Color(245, 250, 250));
                b1.setBackground(new Color(248, 24, 4));
            }
            public void mouseExited(MouseEvent evt)
            {
                b1.setBackground(new Color(253, 2, 10));
                b1.setForeground(new Color(38, 2, 72));
            }
        });
        panel.add(b1);




        b2 = new SlidingButton("Back",new Color(38, 2, 72), 1.0f); // rounded with full slider
        b2.setBounds(590, 720, 280, 50);
        b2.setFont(new Font("times new roman", Font.BOLD, 30));
        b2.setBackground(new Color(253, 2, 10));
        b2.setForeground(new Color(38, 2, 72));
        b2.setBorder(null);
        b2.addActionListener(this);
        b2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                b2.setForeground(new Color(245, 250, 250));
                b2.setBackground(new Color(248, 24, 4));
            }
            public void mouseExited(MouseEvent evt)
            {
                b2.setBackground(new Color(253, 2, 10));
                b2.setForeground(new Color(38, 2, 72));
            }
        });
        panel.add(b2);




        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(1050,260,300,300);
        panel.add(label);




        getContentPane().setBackground(new Color(245, 250, 250));
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(-5,-5,1580,870,50,50));
        setSize(1550,870);
        setLocation(-10,0);
        setLayout(null);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
        {
            try {
                Connect c=new Connect();
                String room=t2.getText();
                String ava=(String) t3.getSelectedItem();
                String status= (String)t5.getSelectedItem();
                String price=t4.getText();
                String type=(String) t6.getSelectedItem();


                String q="insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                setVisible(false);

            }
            catch (Exception E)
            {
                E.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
