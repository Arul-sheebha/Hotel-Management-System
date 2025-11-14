package Hotel.Management.System;


import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class Splash extends JFrame
{
    Splash()
    {
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/loading.gif"));
        JLabel label=new JLabel(imageIcon);
        add(label);

        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(-5,-5,1580,870,50,50));
        setSize(1550,870);
        setLocation(-10,0);
        setVisible(true);
        setLayout(null);

        try
        {
            Thread.sleep(3000);
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
            setVisible(false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
    public static void main(String[] args)
    {
        new Splash();
    }
}
