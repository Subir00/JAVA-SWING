import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contactUs {
    JFrame f2 = new JFrame("Contact Us");

    contactUs(){
        JPanel lg1,lg2,lg3,lg4;
        JLabel name,display;
        ImageIcon imgicon,make;

        Font f = new Font("Serif",Font.BOLD,35);
        lg2 = new JPanel();
        lg2.setBackground(new Color(0,0,0,80));
        lg2.setBounds(0,0,900,100);
        name = new JLabel("Contact Us");
        name.setForeground(Color.white);
        name.setBounds(200,80,400,50);
        name.setFont(f);
        lg2.add(name);

        make = new ImageIcon(getClass().getResource("logo2.png"));
        JButton btn = new JButton(make);
        btn.setBounds(10,5,100,90);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.dispose();
                home p3=new home();
            }
        });

        f2.add(lg2);

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
        lg1.setBounds(250,175,400,350);

        JLabel l4 = new JLabel("<html><h1><u>Contact Us</u></h1><br><h2><p>Bhubaneswar - 752 054(Odisha)</p><br><p>+91 9040272755/ +91 9040272733</p><p>+91 -674-663 6555(Admission)</p><p>9040021102(Admission)</p><br><p>info@cgu-odisha.ac.in</p><p>admission@cgu-odisha.ac.in</p></html>");
        l4.setBounds(100,0,300,300);
        l4.setForeground(Color.cyan);
        display.add(lg1);
        lg1.add(l4);
        f2.add(btn);

        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setSize(900,600);
    }
    public static void main(String args[]){
        new contactUs();
    }
}