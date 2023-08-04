import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    ImageIcon icon;
    JButton go_back;
    JLabel info;
    JLabel about;
    JPanel panel;
    About(){
        icon = new ImageIcon("logo\\Pire.png");//Pire logo

        go_back = new JButton("Back");
        go_back.setBounds(250,600,300,120);
        go_back.setBackground(Color.BLACK);
        go_back.setForeground(Color.WHITE);
        go_back.setFocusable(false);
        go_back.setFont(new Font("Arial",Font.PLAIN,25));
        go_back.addActionListener(e -> new Menu());//Back to the main menu
        go_back.addActionListener(e -> dispose());//Closes window

        info = new JLabel("     I spent again many hours in the design because I am also in production of other projects.");//Main label
        info.setBounds(50,120,675,400);
        info.setFont(new Font("Arial",Font.BOLD,15));
        info.setForeground(Color.WHITE);
        info.setBackground(Color.BLACK);
        info.setOpaque(true);//To see the actual background without adding the label to a panel we need this line of code

        /*
        *This was the simplest class to make
        * It consists of label and a back button
        * It shows that I am currently in production of new projects
        * So stay tuned!!!!
         */

        about = new JLabel("About");
        about.setFont( new Font("Arial",Font.BOLD,50));
        about.setForeground(Color.WHITE);

        panel = new JPanel();
        panel.setBounds(0,0,800,70);
        panel.setBackground(Color.BLACK);
        panel.add(about);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pire");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(800,800));
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,200,20));
        this.setLocation(600,150);
        this.add(go_back);
        this.add(info);
        this.add(panel);
        this.setVisible(true);
    }
}
