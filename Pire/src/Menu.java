import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    ImageIcon icon;
    JButton interactive_photos;
    JButton interactive_cubes;
    JButton about;
    JButton more;
    JButton back;
    JLabel menu;
    JPanel container2;

    Menu(){
        icon = new ImageIcon("logo\\Pire.png");//Pire logo

        interactive_photos = new JButton("Interactive Photos");
        interactive_photos.setBounds(65,200,300,120);
        interactive_photos.setBackground(Color.BLACK);
        interactive_photos.setForeground(Color.WHITE);
        interactive_photos.setFocusable(false);
        interactive_photos.setFont(new Font("Arial",Font.PLAIN,30));
        interactive_photos.addActionListener(e -> new Photos());//Takes the user to the interactive photos
        interactive_photos.addActionListener(e -> dispose());//Closes the menu

        interactive_cubes = new JButton("Interactive cubes");
        interactive_cubes.setBounds(410,200,300,120);
        interactive_cubes.setBackground(Color.BLACK);
        interactive_cubes.setForeground(Color.WHITE);
        interactive_cubes.setFocusable(false);
        interactive_cubes.setFont(new Font("Arial",Font.PLAIN,30));
        interactive_cubes.addActionListener(e -> new Cubes());//Takes the user to the interactive cubes
        interactive_cubes.addActionListener(e -> dispose());//Closes the menu

        about = new JButton("About");
        about.setBounds(65,450,300,120);
        about.setBackground(Color.BLACK);
        about.setForeground(Color.WHITE);
        about.setFocusable(false);
        about.setFont(new Font("Arial",Font.PLAIN,30));
        about.addActionListener(e -> new About());//Takes the user to the description section
        about.addActionListener(e -> dispose());//Closes the window

        more = new JButton("More");
        more.setBounds(230,620,300,120);
        more.setBackground(Color.BLACK);
        more.setForeground(Color.WHITE);
        more.setFocusable(false);
        more.setFont(new Font("Arial",Font.PLAIN,30));
        more.addActionListener(e -> new More());//Takes the user to the more section
        more.addActionListener(e -> dispose());//Closes the window

        back = new JButton("Back");
        back.setBounds(410,450,300,120);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.setFont(new Font("Arial",Font.PLAIN,30));
        back.addActionListener(e -> new Login());//Back to log in form
        back.addActionListener(e -> dispose());//Closing the window

        /*
        *This is the main menu of the app
        * It consists of five buttons with five sections
        * One:Interactive photos
        * Two:Interactive cubes
        * Three:About section
        * Four:More section where somebody can give his or her name and age to be store in the app just for familiarity next time of login again
        * Five:Back button which takes the user back to the Login form
        * I highlighted the most important lines of code with comments
        * Everything else is just customization and design of the app
         */

        menu = new JLabel("Menu");
        menu.setFont( new Font("Arial",Font.BOLD,50));
        menu.setForeground(Color.WHITE);

        container2 = new JPanel();
        container2.setBounds(0,0,800,70);
        container2.setBackground(Color.BLACK);
        container2.add(menu);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pire");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(800,800));
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,200,20));
        this.setLocation(600,150);
        this.add(interactive_photos);
        this.add(interactive_cubes);
        this.add(about);
        this.add(more);
        this.add(back);
        this.add(container2);
        this.setVisible(true);
    }
}
