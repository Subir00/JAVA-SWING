import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home {
    JFrame f2 = new JFrame("Home Page");

    home(){
        JPanel lg1,lg2,lg3,lg4;
        JLabel name,display;
        ImageIcon imgicon,make;

        Font f = new Font("Serif",Font.BOLD,35);
        lg2 = new JPanel();
        lg2.setBackground(new Color(0,0,0,80));
        lg2.setBounds(0,0,900,100);
        name = new JLabel("C. V. RAMAN GLOBAL UNIVERSITY");
        name.setForeground(Color.black);
        name.setBounds(200,80,400,50);
        name.setFont(f);
        lg2.add(name);

        f2.add(lg2);

        Font f1 = new Font("Arial",Font.BOLD,30);
        lg3 = new JPanel();
        lg3.setBackground(new Color(0,0,0,80));
        lg3.setBounds(0,50,900,50);
        name = new JLabel("Bhubaneswar, Odisha");
        name.setForeground(Color.blue);
        name.setBounds(200,80,400,50);
        name.setFont(f);
        lg3.add(name);

        f2.add(lg3);

        imgicon= new ImageIcon(getClass().getResource("img1.png"));
        Image img = imgicon.getImage();
        Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(temp_img);
        display= new JLabel(imgicon);
        display.setBounds(0,0,900,600);
        f2.add(display);

        //f2.add(background);


        lg1 = new JPanel();
        lg1.setLayout(null);
        lg1.setSize(300,350);
        lg1.setBackground(new Color(0,0,0,80));
        lg1.setBounds(10,175,400,350);

        JButton l3 = new JButton("Student Login");
        l3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                s_login p3=new s_login();
            }
        });
        l3.setBounds(20,20,250,50);
        //l3.setBackground(new Color(0,0,0,80));
        l3.setForeground(Color.black);

        JButton l8 = new JButton("Faculty Login");
        l8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                f_login p3=new f_login();
            }
        });
        l8.setBounds(20,80,250,50);
        //l3.setBackground(new Color(0,0,0,80));
        l8.setForeground(Color.black);

        JButton l5 = new JButton("Courses Offered");
        l5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                course p3=new course();
            }
        });
        l5.setBounds(20,140,250,50);
        //l3.setBackground(new Color(0,0,0,80));
        l5.setForeground(Color.black);

        JButton l6 = new JButton("Academics");
        l6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                academics p3=new academics();
            }
        });
        l6.setBounds(20,200,250,50);
        //l3.setBackground(new Color(0,0,0,80));
        l6.setForeground(Color.black);

        JButton l7 = new JButton("Contact Us");
        l7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                contactUs p3=new contactUs();
            }
        });
        l7.setBounds(20,260,250,50);
        //l3.setBackground(new Color(0,0,0,80));
        l7.setForeground(Color.black);

        lg4 = new JPanel();
        lg4.setLayout(null);
        lg4.setSize(400,350);
        lg4.setBackground(new Color(0,0,0,80));
        lg4.setBounds(480,175,400,350);

        JLabel l4 = new JLabel("<html><h1><u>About Us</u></h1><br><br><p>C V Raman Global University</p><p>Established in 1997</p><p>Initially called as </p><p>C V Raman College of Engineering</p><p>Situated in Bubaneswar Odisha</p><p>It offers multiple Courses</p><p>This Engineering college is famous for</p><p>Cultural activities such as Dance music etc</p><p>Its is a renowned university for Engineering</p></html>");
        l4.setBounds(100,0,300,300);
        //l3.setBackground(new Color(0,0,0,80));
        l4.setForeground(Color.cyan);

        make = new ImageIcon(getClass().getResource("logo2.png"));
        JButton btn = new JButton(make);
        btn.setBounds(10,5,100,90);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                contactUs p3=new contactUs();
            }
        });

        display.add(lg4);
        lg4.add(l4);
        lg1.add(l3);
        lg1.add(l8);
        lg1.add(l5);
        lg1.add(l6);
        lg1.add(l7);

        display.add(btn);
        display.add(lg1);


        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setSize(900,600);
    }
    public static void main(String args[]){
        new home();
    }
}