package Hotel.Management.System;

import jdk.jfr.FlightRecorderListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class Reception extends JFrame {
    Reception()
    {
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(340,7,1200,850);
        add(panel);

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(3,45,48));
        panel1.setBounds(16,7,320,850);
        add(panel1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/hotel6.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(350,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(-35,555,400,300);
        panel1.add(label);

        ImageIcon imageIcon11=new ImageIcon(ClassLoader.getSystemResource("icon/load1.gif"));
        Image i11=imageIcon11.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111=new ImageIcon(i11);
        JLabel label1=new JLabel(imageIcon111);
        label1.setBounds(15,7,1200,850);
        panel.add(label1);

        SlidingButton btnNCF=new SlidingButton("New Customer Form",new Color(4, 233, 250),1.0f);
        btnNCF.setBounds(35,10,250,35);
        btnNCF.setFont(new Font("tahoma",Font.BOLD,15));
        btnNCF.setBackground(new Color(1, 248, 182));
        btnNCF.setForeground(new Color(107, 103, 199));
        btnNCF.setBorder(null);
        panel1.add(btnNCF);
        btnNCF.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnNCF.setBackground(new Color(168, 171, 170));
                btnNCF.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnNCF.setBackground(new Color(1, 248, 182));
                btnNCF.setForeground(new Color(107, 103, 199));
            }
        });
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomer();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnRoom=new SlidingButton("Room",new Color(4, 233, 250),1.0f);
        btnRoom.setBorder(null);
        btnRoom.setBounds(35,55,250,35);
        btnRoom.setFont(new Font("tahoma",Font.BOLD,15));
        btnRoom.setBackground(new Color(1, 248, 182));
        btnRoom.setForeground(new Color(107, 103, 199));
        panel1.add(btnRoom);
        btnRoom.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnRoom.setBackground(new Color(168, 171, 170));
                btnRoom.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnRoom.setBackground(new Color(1, 248, 182));
                btnRoom.setForeground(new Color(107, 103, 199));
            }
        });
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnDepartment=new SlidingButton("Department",new Color(4, 233, 250),1.0f);
        btnDepartment.setBorder(null);
        btnDepartment.setBounds(35,100,250,35);
        btnDepartment.setFont(new Font("tahoma",Font.BOLD,15));
        btnDepartment.setBackground(new Color(1, 248, 182));
        btnDepartment.setForeground(new Color(107, 103, 199));
        panel1.add(btnDepartment);
        btnDepartment.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnDepartment.setBackground(new Color(168, 171, 170));
                btnDepartment.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnDepartment.setBackground(new Color(1, 248, 182));
                btnDepartment.setForeground(new Color(107, 103, 199));
            }
        });
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnAEI=new SlidingButton("All Employee Info",new Color(4, 233, 250),1.0f);
        btnAEI.setBorder(null);
        btnAEI.setBounds(35,145,250,35);
        btnAEI.setFont(new Font("tahoma",Font.BOLD,15));
        btnAEI.setBackground(new Color(1, 248, 182));
        btnAEI.setForeground(new Color(107, 103, 199));
        panel1.add(btnAEI);
        btnAEI.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnAEI.setBackground(new Color(168, 171, 170));
                btnAEI.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnAEI.setBackground(new Color(1, 248, 182));
                btnAEI.setForeground(new Color(107, 103, 199));
            }
        });
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnCI=new SlidingButton("Customer Info",new Color(4, 233, 250),1.0f);
        btnCI.setBorder(null);
        btnCI.setBounds(35,190,250,35);
        btnCI.setFont(new Font("tahoma",Font.BOLD,15));
        btnCI.setBackground(new Color(1, 248, 182));
        btnCI.setForeground(new Color(107, 103, 199));
        panel1.add(btnCI);
        btnCI.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnCI.setBackground(new Color(168, 171, 170));
                btnCI.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnCI.setBackground(new Color(1, 248, 182));
                btnCI.setForeground(new Color(107, 103, 199));
            }
        });
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnMI=new SlidingButton("Manager Info",new Color(4, 233, 250),1.0f);
        btnMI.setBorder(null);
        btnMI.setBounds(35,235,250,35);
        btnMI.setFont(new Font("tahoma",Font.BOLD,15));
        btnMI.setBackground(new Color(1, 248, 182));
        btnMI.setForeground(new Color(107, 103, 199));
        panel1.add(btnMI);
        btnMI.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnMI.setBackground(new Color(168, 171, 170));
                btnMI.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnMI.setBackground(new Color(1, 248, 182));
                btnMI.setForeground(new Color(107, 103, 199));
            }
        });
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnCO=new SlidingButton("Check-Out",new Color(4, 233, 250),1.0f);
        btnCO.setBorder(null);
        btnCO.setBounds(35,280,250,35);
        btnCO.setFont(new Font("tahoma",Font.BOLD,15));
        btnCO.setBackground(new Color(1, 248, 182));
        btnCO.setForeground(new Color(107, 103, 199));
        panel1.add(btnCO);
        btnCO.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnCO.setBackground(new Color(168, 171, 170));
                btnCO.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnCO.setBackground(new Color(1, 248, 182));
                btnCO.setForeground(new Color(107, 103, 199));
            }
        });
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });



        SlidingButton btnUCD=new SlidingButton("Update Check-In Details",new Color(4, 233, 250),1.0f);
        btnUCD.setBorder(null);
        btnUCD.setBounds(35,325,250,35);
        btnUCD.setFont(new Font("tahoma",Font.BOLD,15));
        btnUCD.setBackground(new Color(1, 248, 182));
        btnUCD.setForeground(new Color(107, 103, 199));
        panel1.add(btnUCD);
        btnUCD.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnUCD.setBackground(new Color(168, 171, 170));
                btnUCD.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnUCD.setBackground(new Color(1, 248, 182));
                btnUCD.setForeground(new Color(107, 103, 199));
            }
        });
        btnUCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnURS=new SlidingButton("Update Room Status",new Color(4, 233, 250),1.0f);
        btnURS.setBorder(null);
        btnURS.setBounds(35,370,250,35);
        btnURS.setFont(new Font("tahoma",Font.BOLD,15));
        btnURS.setBackground(new Color(1, 248, 182));
        btnURS.setForeground(new Color(107, 103, 199));
        panel1.add(btnURS);
        btnURS.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnURS.setBackground(new Color(168, 171, 170));
                btnURS.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnURS.setBackground(new Color(1, 248, 182));
                btnURS.setForeground(new Color(107, 103, 199));
            }
        });
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnPUS=new SlidingButton("Pick Up Service",new Color(4, 233, 250),1.0f);
        btnPUS.setBorder(null);
        btnPUS.setBounds(35,415,250,35);
        btnPUS.setFont(new Font("tahoma",Font.BOLD,15));
        btnPUS.setBackground(new Color(1, 248, 182));
        btnPUS.setForeground(new Color(107, 103, 199));
        panel1.add(btnPUS);
        btnPUS.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnPUS.setBackground(new Color(168, 171, 170));
                btnPUS.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnPUS.setBackground(new Color(1, 248, 182));
                btnPUS.setForeground(new Color(107, 103, 199));
            }
        });
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUp();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnSR=new SlidingButton("Search Room",new Color(4, 233, 250),1.0f);
        btnSR.setBorder(null);
        btnSR.setBounds(35,460,250,35);
        btnSR.setFont(new Font("tahoma",Font.BOLD,15));
        btnSR.setBackground(new Color(1, 248, 182));
        btnSR.setForeground(new Color(107, 103, 199));
        panel1.add(btnSR);
        btnSR.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnSR.setBackground(new Color(168, 171, 170));
                btnSR.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnSR.setBackground(new Color(1, 248, 182));
                btnSR.setForeground(new Color(107, 103, 199));
            }
        });
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchRoom();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        SlidingButton btnL=new SlidingButton("Log Out",new Color(4, 233, 250),1.0f);
        btnL.setBounds(38,505,120,35);
        btnL.setFont(new Font("tahoma",Font.BOLD,15));
        btnL.setBackground(new Color(1, 248, 182));
        btnL.setForeground(new Color(107, 103, 199));
        btnL.setBorder(null);
        panel1.add(btnL);
        btnL.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnL.setBackground(new Color(168, 171, 170));
                btnL.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnL.setBackground(new Color(1, 248, 182));
                btnL.setForeground(new Color(107, 103, 199));
            }
        });
        btnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });



        SlidingButton btnB=new SlidingButton("Back",new Color(4, 233, 250),1.0f);
        btnB.setBounds(165,505,120,35);
        btnB.setFont(new Font("tahoma",Font.BOLD,15));
        btnB.setBackground(new Color(1, 248, 182));
        btnB.setForeground(new Color(107, 103, 199));
        btnB.setBorder(null);
        panel1.add(btnB);
        btnB.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt)
            {
                btnB.setBackground(new Color(168, 171, 170));
                btnB.setForeground(new Color(3, 3, 248));
            }
            public void mouseExited(MouseEvent evt)
            {
                btnB.setBackground(new Color(1, 248, 182));
                btnB.setForeground(new Color(107, 103, 199));
            }
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
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
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(-5,-5,1580,870,50,50));
        setSize(1550,870);
        setLocation(-10,0);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Reception();
    }
}
