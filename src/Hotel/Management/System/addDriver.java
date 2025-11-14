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

public class addDriver extends JFrame implements ActionListener {

    RoundedTextField nameText,ageText,carCText,carNText,locText;

    JComboBox comboBox,comboBox1;

    SlidingButton add,back;

    addDriver()
    {

        JPanel panel=new JPanel();
        panel.setBounds(20,10,1516,842);
        panel.setBackground(new Color(252, 3, 252));
        panel.setLayout(null);
        add(panel);



        JLabel label=new JLabel("ADD DRIVERS");
        label.setBounds(320,5,300,40);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma",Font.BOLD,40));
        panel.add(label);



        JLabel name=new JLabel("NAME");
        name.setBounds(100,80,600,100);
        name.setFont(new Font("Tahoma",Font.BOLD,35));
        name.setForeground(Color.white);
        panel.add(name);



        nameText = new RoundedTextField(20);
        nameText.setBounds(500,110,300,45);
        nameText.setFont(new Font("Tahoma",Font.BOLD,20));
        nameText.setBackground(new Color(1, 240, 248));
        nameText.setForeground(new Color(250, 139, 1));
        nameText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                nameText.setForeground(new Color(1, 240, 248));
                nameText.setBackground(new Color(252, 3, 252));

            }
            public void mouseExited(MouseEvent evt)
            {
                nameText.setBackground(new Color(1, 240, 248));
                nameText.setForeground(new Color(250, 139, 1));
            }
        });
        panel.add(nameText);



        JLabel age=new JLabel("AGE");
        age.setBounds(100,170,600,100);
        age.setFont(new Font("Tahoma",Font.BOLD,35));
        age.setForeground(Color.white);
        panel.add(age);



        ageText = new RoundedTextField(20);
        ageText.setBounds(500,195,300,45);
        ageText.setFont(new Font("Tahoma",Font.BOLD,20));
        ageText.setBackground(new Color(1, 240, 248));
        ageText.setForeground(new Color(250, 139, 1));
        ageText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                ageText.setForeground(new Color(1, 240, 248));
                ageText.setBackground(new Color(252, 3, 252));

            }
            public void mouseExited(MouseEvent evt)
            {
                ageText.setBackground(new Color(1, 240, 248));
                ageText.setForeground(new Color(250, 139, 1));
            }
        });
        panel.add(ageText);



        JLabel gender =new JLabel("GENDER");
        gender.setBounds(100,255,600,100);
        gender.setFont(new Font("Tahoma",Font.BOLD,35));
        gender.setForeground(Color.white);
        panel.add(gender);



        comboBox = new JComboBox<>(new String[]{"Male", "Female"});
        comboBox.setBounds(500,275,300,45);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox.setBackground(new Color(1, 240, 248));
        comboBox.setForeground(new Color(250, 139, 1));

        // Remove default opacity and border
        comboBox.setOpaque(false);
        comboBox.setBorder(new EmptyBorder(5, 10, 5, 10));

        // Custom UI for round shape
        comboBox.setUI(new BasicComboBoxUI() {
            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Rounded rectangle background
                g2.setColor(comboBox.getBackground());
                g2.fill(new RoundRectangle2D.Double(bounds.x, bounds.y, bounds.width, bounds.height, 20, 20));

                g2.dispose();
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fill background
                g2.setColor(comboBox.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 20, 20);

                super.paint(g2, c);

                g2.dispose();
            }
        });

        panel.add(comboBox);




        JLabel carC =new JLabel("CAR COMPANY");
        carC.setBounds(100,340,600,100);
        carC.setFont(new Font("Tahoma",Font.BOLD,35));
        carC.setForeground(Color.white);
        panel.add(carC);



        carCText = new RoundedTextField(20);
        carCText.setBounds(500,365,300,45);
        carCText.setFont(new Font("Tahoma",Font.BOLD,20));
        carCText.setBackground(new Color(1, 240, 248));
        carCText.setForeground(new Color(250, 139, 1));
        carCText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                carCText.setForeground(new Color(1, 240, 248));
                carCText.setBackground(new Color(252, 3, 252));

            }
            public void mouseExited(MouseEvent evt)
            {
                carCText.setBackground(new Color(1, 240, 248));
                carCText.setForeground(new Color(250, 139, 1));
            }
        });
        panel.add(carCText);




        JLabel carN =new JLabel("CAR NAME");
        carN.setBounds(100,430,600,100);
        carN.setFont(new Font("Tahoma",Font.BOLD,35));
        carN.setForeground(Color.white);
        panel.add(carN);



        carNText = new RoundedTextField(20);
        carNText.setBounds(500,450,300,45);
        carNText.setFont(new Font("Tahoma",Font.BOLD,20));
        carNText.setBackground(new Color(1, 240, 248));
        carNText.setForeground(new Color(250, 139, 1));
        carNText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                carNText.setForeground(new Color(1, 240, 248));
                carNText.setBackground(new Color(252, 3, 252));

            }
            public void mouseExited(MouseEvent evt)
            {
                carNText.setBackground(new Color(1, 240, 248));
                carNText.setForeground(new Color(250, 139, 1));
            }
        });
        panel.add(carNText);




        JLabel available =new JLabel("AVAILABLE");
        available.setBounds(100,520,600,100);
        available.setFont(new Font("Tahoma",Font.BOLD,35));
        available.setForeground(Color.white);
        panel.add(available);



        comboBox1 = new JComboBox<>(new String[]{"YES", "NO"});
        comboBox1.setBounds(500,545,300,45);
        comboBox1.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox1.setBackground(new Color(1, 240, 248));
        comboBox1.setForeground(new Color(250, 139, 1));

        // Remove default opacity and border
        comboBox1.setOpaque(false);
        comboBox1.setBorder(new EmptyBorder(5, 10, 5, 10));

        // Custom UI for round shape
        comboBox1.setUI(new BasicComboBoxUI() {
            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Rounded rectangle background
                g2.setColor(comboBox1.getBackground());
                g2.fill(new RoundRectangle2D.Double(bounds.x, bounds.y, bounds.width, bounds.height, 20, 20));

                g2.dispose();
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fill background
                g2.setColor(comboBox1.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 20, 20);

                super.paint(g2, c);

                g2.dispose();
            }
        });

        panel.add(comboBox1);




        JLabel loc =new JLabel("LOCATION");
        loc.setBounds(100,610,600,100);
        loc.setFont(new Font("Tahoma",Font.BOLD,35));
        loc.setForeground(Color.white);
        panel.add(loc);



        locText = new RoundedTextField(20);
        locText.setBounds(500,640,300,45);
        locText.setFont(new Font("Tahoma",Font.BOLD,20));
        locText.setBackground(new Color(1, 240, 248));
        locText.setForeground(new Color(250, 139, 1));
        locText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                locText.setForeground(new Color(1, 240, 248));
                locText.setBackground(new Color(252, 3, 252));

            }
            public void mouseExited(MouseEvent evt)
            {
                locText.setBackground(new Color(1, 240, 248));
                locText.setForeground(new Color(250, 139, 1));
            }
        });
        panel.add(locText);




        add = new SlidingButton("ADD",(new Color(1, 240, 248)), 1.0f); // rounded with full slider
        add.setBounds(100,750,300,55);
        add.setFont(new Font("times new roman", Font.BOLD, 30));
        add.setBackground(new Color(250, 139, 1));
        add.setForeground(new Color(1, 240, 248));
        add.setBorder(null);
        add.addActionListener(this);
        add.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add.setForeground(new Color(250, 139, 1));
                add.setBackground(new Color(250, 139, 1));
            }
            public void mouseExited(MouseEvent evt)
            {
                add.setBackground(new Color(250, 139, 1));
                add.setForeground(new Color(1, 240, 248));
            }
        });
        panel.add(add);




        back = new SlidingButton("BACK",new Color(1, 240, 248), 1.0f); // rounded with full slider
        back.setBounds(500,750,300,55);
        back.setFont(new Font("times new roman", Font.BOLD, 30));
        back.setForeground(new Color(1, 240, 248));
        back.setBackground(new Color(250, 139, 1));
        back.setBorder(null);
        back.addActionListener(this);
        back.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                back.setForeground(new Color(250, 139, 1));
                back.setBackground(new Color(250, 139, 1));
            }
            public void mouseExited(MouseEvent evt)
            {
                back.setForeground(new Color(1, 240, 248));
                back.setBackground(new Color(250, 139, 1));
            }
        });
        panel.add(back);




        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label1 =new JLabel(imageIcon1);
        label1.setBounds(1020,260,300,300);
        panel.add(label1);





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

        if(e.getSource()==add)
        {
            String name=nameText.getText();
            String age=ageText.getText();
            String gender=(String)comboBox.getSelectedItem();
            String company=carCText.getText();
            String carname=carNText.getText();
            String available=(String)comboBox1.getSelectedItem();
            String location=locText.getText();

            try
            {
                Connect c=new Connect();
                String q="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+carname+"','"+available+"','"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Added");
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
        new addDriver();
    }
}
