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

public class AddEmployee extends JFrame implements ActionListener {

    RoundedTextField nameText,ageText,salaryText,phoneText,aadharText,emailText;

    JRadioButton radioButtonM,radioButtonF;

    JComboBox comboBox;

    SlidingButton add,back;

    AddEmployee(){


        JPanel panel=new JPanel();
        panel.setBounds(20,10,1516,842);
        panel.setBackground(new Color(1, 240, 248));
        panel.setLayout(null);
        add(panel);



        JLabel name=new JLabel("NAME");
        name.setBounds(100,2,600,100);
        name.setFont(new Font("serif",Font.BOLD,30));
        name.setForeground(Color.white);
        panel.add(name);



        nameText = new RoundedTextField(20);
        nameText.setBounds(400,35,280,40);
        nameText.setFont(new Font("Tahoma",Font.BOLD,20));
        nameText.setBackground(new Color(3, 3, 248));
        nameText.setForeground(new Color(98, 10, 2));
        nameText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                nameText.setBackground(new Color(1, 240, 248));
                nameText.setForeground(new Color(250, 139, 1));

            }
            public void mouseExited(MouseEvent evt)
            {
                nameText.setBackground(new Color(3, 3, 248));
                nameText.setForeground(new Color(98, 10, 2));
            }
        });
        panel.add(nameText);




        JLabel Age=new JLabel("AGE");
        Age.setBounds(100,85,600,100);
        Age.setFont(new Font("serif",Font.BOLD,30));
        Age.setForeground(Color.white);
        panel.add(Age);



        ageText = new RoundedTextField(20);
        ageText.setBounds(400,115,280,40);
        ageText.setFont(new Font("Tahoma",Font.BOLD,20));
        ageText.setBackground(new Color(3, 3, 248));
        ageText.setForeground(new Color(98, 10, 2));
        ageText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                ageText.setBackground(new Color(1, 240, 248));
                ageText.setForeground(new Color(250, 139, 1));

            }
            public void mouseExited(MouseEvent evt)
            {
                ageText.setBackground(new Color(3, 3, 248));
                ageText.setForeground(new Color(98, 10, 2));
            }
        });
        panel.add(ageText);



        JLabel gender=new JLabel("GENDER");
        gender.setBounds(100,172,600,100);
        gender.setFont(new Font("serif",Font.BOLD,30));
        gender.setForeground(Color.white);
        panel.add(gender);



        radioButtonM=new JRadioButton("    MALE");
        radioButtonM.setBounds(400,200,150,40);
        radioButtonM.setBackground(new Color(1, 240, 248));
        radioButtonM.setFont(new Font("Tahoma",Font.BOLD,20));
        radioButtonM.setForeground(new Color(3, 3, 248));
        panel.add(radioButtonM);



        radioButtonF=new JRadioButton("    FEMALE");
        radioButtonF.setBounds(552,200,280,40);
        radioButtonF.setBackground(new Color(1, 240, 248));
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,20));
        radioButtonF.setForeground(new Color(3, 3, 248));
        panel.add(radioButtonF);



        JLabel job=new JLabel("JOB");
        job.setBounds(100,253,600,100);
        job.setFont(new Font("serif",Font.BOLD,30));
        job.setForeground(Color.white);
        panel.add(job);



        comboBox = new JComboBox<>(new String[]{"Front Desk", "HouseKeeping","Kitchen Staff","Room Service","Manager","Accountant","Chef"});
        comboBox.setBounds(400,280,280,40);
        comboBox.setFont(new Font("times new roman", Font.PLAIN, 20));
        comboBox.setForeground(new Color(98, 10, 2));
        comboBox.setBackground(new Color(3, 3, 248));

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




        JLabel salary=new JLabel("SALARY");
        salary.setBounds(100,330,600,100);
        salary.setFont(new Font("serif",Font.BOLD,30));
        salary.setForeground(Color.white);
        panel.add(salary);



        salaryText = new RoundedTextField(20);
        salaryText.setBounds(400,362,280,40);
        salaryText.setFont(new Font("Tahoma",Font.BOLD,20));
        salaryText.setBackground(new Color(3, 3, 248));
        salaryText.setForeground(new Color(98, 10, 2));
        salaryText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                salaryText.setBackground(new Color(1, 240, 248));
                salaryText.setForeground(new Color(250, 139, 1));

            }
            public void mouseExited(MouseEvent evt)
            {
                salaryText.setBackground(new Color(3, 3, 248));
                salaryText.setForeground(new Color(98, 10, 2));
            }
        });
        panel.add(salaryText);




        JLabel phone=new JLabel("PHONE");
        phone.setBounds(100,415,600,100);
        phone.setFont(new Font("serif",Font.BOLD,30));
        phone.setForeground(Color.white);
        panel.add(phone);



        phoneText = new RoundedTextField(20);
        phoneText.setBounds(400,443,280,40);
        phoneText.setFont(new Font("Tahoma",Font.BOLD,20));
        phoneText.setBackground(new Color(3, 3, 248));
        phoneText.setForeground(new Color(98, 10, 2));
        phoneText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                phoneText.setBackground(new Color(1, 240, 248));
                phoneText.setForeground(new Color(250, 139, 1));

            }
            public void mouseExited(MouseEvent evt)
            {
                phoneText.setBackground(new Color(3, 3, 248));
                phoneText.setForeground(new Color(98, 10, 2));
            }
        });
        panel.add(phoneText);




        JLabel aadhar=new JLabel("AADHAR");
        aadhar.setBounds(100,500,600,100);
        aadhar.setFont(new Font("serif",Font.BOLD,30));
        aadhar.setForeground(Color.white);
        panel.add(aadhar);



        aadharText = new RoundedTextField(20);
        aadharText.setBounds(400,530,280,40);
        aadharText.setFont(new Font("Tahoma",Font.BOLD,20));
        aadharText.setBackground(new Color(3, 3, 248));
        aadharText.setForeground(new Color(98, 10, 2));
        aadharText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                aadharText.setBackground(new Color(1, 240, 248));
                aadharText.setForeground(new Color(250, 139, 1));

            }
            public void mouseExited(MouseEvent evt)
            {
                aadharText.setBackground(new Color(3, 3, 248));
                aadharText.setForeground(new Color(98, 10, 2));
            }
        });
        panel.add(aadharText);




        JLabel email=new JLabel("EMAIL");
        email.setBounds(100,588,600,100);
        email.setFont(new Font("serif",Font.BOLD,30));
        email.setForeground(Color.white);
        panel.add(email);



        emailText = new RoundedTextField(20);
        emailText.setBounds(400,618,280,40);
        emailText.setFont(new Font("Tahoma",Font.BOLD,20));
        emailText.setBackground(new Color(3, 3, 248));
        emailText.setForeground(new Color(98, 10, 2));
        emailText.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                emailText.setBackground(new Color(1, 240, 248));
                emailText.setForeground(new Color(250, 139, 1));

            }
            public void mouseExited(MouseEvent evt)
            {
                emailText.setBackground(new Color(3, 3, 248));
                emailText.setForeground(new Color(98, 10, 2));
            }
        });
        panel.add(emailText);




        JLabel AED=new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(860,2,600,100);
        AED.setFont(new Font("Tahoma",Font.BOLD,40));
        AED.setForeground(Color.white);
        panel.add(AED);





        add = new SlidingButton("ADD",new Color(3, 3, 248), 1.0f); // rounded with full slider
        add.setBounds(50,750,280,50);
        add.setFont(new Font("times new roman", Font.BOLD, 30));
        add.setBackground(new Color(98, 10, 2));
        add.setForeground(new Color(3, 3, 248));
        add.setBorder(null);
        add.addActionListener(this);
        add.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                add.setForeground(new Color(98, 10, 2));
                add.setBackground(new Color(1, 240, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                add.setBackground(new Color(98, 10, 2));
                add.setForeground(new Color(3, 3, 248));
            }
        });
        panel.add(add);




        back = new SlidingButton("BACK",new Color(3, 3, 248), 1.0f); // rounded with full slider
        back.setBounds(400,750,280,50);
        back.setFont(new Font("times new roman", Font.BOLD, 30));
        back.setBackground(new Color(98, 10, 2));
        back.setForeground(new Color(3, 3, 248));
        back.setBorder(null);
        back.addActionListener(this);
        back.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                back.setForeground(new Color(98, 10, 2));
                back.setBackground(new Color(1, 240, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                back.setBackground(new Color(98, 10, 2));
                back.setForeground(new Color(3, 3, 248));
            }
        });
        panel.add(back);




        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(950,300,300,300);
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
        if(e.getSource()==add)
        {
            String name=nameText.getText();
            String age=ageText.getText();
            String salary=salaryText.getText();
            String phone=phoneText.getText();
            String email=emailText.getText();
            String aadhar=aadharText.getText();
            String job=(String)comboBox.getSelectedItem();
            String gender=null;
            if(radioButtonM.isSelected())
            {
                gender="Male";

            }
            else if(radioButtonF.isSelected())
            {
                gender=" Female";
            }
            try {
                Connect c=new Connect();
                String q="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Added");
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
        new AddEmployee();
    }
}
