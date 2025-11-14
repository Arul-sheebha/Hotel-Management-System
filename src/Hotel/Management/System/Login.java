package Hotel.Management.System;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;


class SlidingButton extends JButton {
    private int fillWidth = 0;
    private int maxWidth = 0;
    private final Timer expandTimer, shrinkTimer;
    private final Color fillColor;
    private final float ratio;
    private final int arc = 40; // Controls corner roundness

    public SlidingButton(String text, Color fillColor, float ratio) {
        super(text);
        this.fillColor = fillColor;
        this.ratio = ratio;
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        setForeground(Color.BLACK);

        expandTimer = new Timer(5, e -> {
            if (fillWidth < maxWidth) {
                fillWidth += 10;
                repaint();
            } else ((Timer) e.getSource()).stop();
        });

        shrinkTimer = new Timer(5, e -> {
            if (fillWidth > 0) {
                fillWidth -= 10;
                repaint();
            } else ((Timer) e.getSource()).stop();
        });

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                shrinkTimer.stop();
                expandTimer.start();
            }

            public void mouseExited(MouseEvent e) {
                expandTimer.stop();
                shrinkTimer.start();
            }
        });

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                maxWidth = (int) (getWidth() * ratio);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Smooth graphics
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw button background (rounded)
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);

        // Draw animated fill (rounded on left side)
        g2.setColor(fillColor);
        g2.fillRoundRect(0, 0, fillWidth, getHeight(), arc, arc);

        // Draw text centered
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g2.setColor(getForeground());
        g2.setFont(getFont());
        g2.drawString(getText(), x, y);

        g2.dispose();
    }
}


class RoundedTextField extends JTextField {
    private final int arc = 30; // Corner radius

    public RoundedTextField(int columns) {
        super(columns);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Optional: draw rounded border
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(1));
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
        g2.dispose();
    }
}


class RoundedPasswordField extends JPasswordField {
    private final int arc = 30;

    public RoundedPasswordField(int columns) {
        super(columns);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(1));
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
        g2.dispose();
    }
}



public abstract class Login extends JFrame implements ActionListener, MouseListener
{

    JTextField textField1;
    JPasswordField passwordField1;

    SlidingButton b1, b2;

    Login()
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

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try
            {
                Connect c=new Connect();
                String user=textField1.getText();
                String pass=passwordField1.getText();
                String q="select * from login where username='"+user+"' and password='"+pass+"'";
                ResultSet resultSet= c.statement.executeQuery(q);
                if(resultSet.next())
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
            System.exit(102);
        }
    }

    public static void main(String[] args)
    {
        new Login() {
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

