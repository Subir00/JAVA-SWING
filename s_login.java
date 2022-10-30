import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class s_login extends JFrame{

    JFrame frame;
    ImageIcon imgicon,make;
    JLabel background,name,l1,l2;
    JPanel heading,lg;
    s_login(){

        Font f = new Font("Serif",Font.BOLD,30);

        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));
        heading.setBounds(0,40,900,90);
        name = new JLabel("Student Login Page");
        name.setForeground(Color.white);
        name.setBounds(200,50,400,50);
        name.setFont(f);
        heading.add(name);

        make = new ImageIcon(getClass().getResource("logo2.png"));
        JButton btn = new JButton(make);
        btn.setBounds(10,5,100,90);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                home p3=new home();
            }
        });

        frame = new JFrame("Student Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imgicon= new ImageIcon(getClass().getResource("img1.png"));
        Image img = imgicon.getImage();
        Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(temp_img);
        background= new JLabel(imgicon,JLabel.CENTER);

        lg = new JPanel();
        lg.setLayout(null);
        lg.setSize(400,350);
        lg.setBackground(new Color(0,0,0,80));
        lg.setBounds(250,175,400,350);



        JTextField username = new JTextField(20);
        username.setBounds(50,50,300,50);
        username.setOpaque(false);
        username.setForeground(Color.white);
        username.setBackground(new Color(210,180,140));
        lg.add(username);

        JPasswordField password = new JPasswordField(20);
        password.setBounds(50,150,300,50);
        password.setForeground(Color.white);
        password.setOpaque(false);
        password.setBackground(new Color(210,180,140));
        lg.add(password);

        l1 = new JLabel("Student ID");
        l1.setBounds(50,5,100,50);
        l1.setForeground(Color.white);
        lg.add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(50,105,100,50);
        l2.setForeground(Color.white);
        lg.add(l2);

        JButton log = new JButton("LogIn");
        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try {

                    String url = "jdbc:mysql://localhost:/college";
                    String uname = "root";
                    String pass = "user@2002";
                    String query = "SELECT * FROM stud_login where SID = '"+ username.getText()+"'";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url,uname,pass);
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    //rs.next();
                    if(rs.next()) {
                        JOptionPane.showMessageDialog(null,"Login Successfully");
                        frame.dispose();
                        s_detail p2=new s_detail();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Incorrect username or password");
                    }
                    String name = rs.getString("username");
                    System.out.println(name);
                    stmt.close();
                    con.close();

                }
                catch(Exception ae) {
                    System.out.println(ae);
                }

            }
        });
        log.setBounds(150,250,100,50);
        log.setBackground(new Color(160,182,45));

        lg.add(log);

        background.add(lg);


        frame.add(heading);
        heading.add(btn);
        frame.add(background);
        //background.setSize(400,400);
        background.setBounds(0,0,900,600);
        frame.setSize(900,600);
        frame.setVisible(true);
    }


    public static void main(String args[]) throws Exception{
        new s_login();
    }

}