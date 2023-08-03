import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Photos extends JFrame implements MouseListener {

    ImageIcon icon;
    ImageIcon car1;
    ImageIcon car2;
    ImageIcon car3;
    ImageIcon car4;
    ImageIcon car5;
    ImageIcon car6;
    ImageIcon bike1;
    ImageIcon bike2;
    ImageIcon bike3;
    ImageIcon bike4;
    ImageIcon bike5;
    ImageIcon bike6;
    JLabel text;
    JLabel text2;
    JLabel auto;
    JLabel bikes;
    JButton back;
    JButton show;
    JButton hide;
    JLabel photos;
    JPanel panel;

    Photos(){
        icon = new ImageIcon("logo\\Pire.png");//Pire logo
        car1 = new ImageIcon("images\\Buggati.jpg");
        car2 = new ImageIcon("images\\Ferrari.jpg");
        car3 = new ImageIcon("images\\Ford.jpg");
        car4 = new ImageIcon("images\\Lamborgini.jpeg");
        car5 = new ImageIcon("images\\McLaren.jpg");
        car6 = new ImageIcon("images\\Toyota.jpeg");
        bike1 = new ImageIcon("images\\Bike1.jpg");
        bike2 = new ImageIcon("images\\Bike2.jpg");
        bike3 = new ImageIcon("images\\Bike3.jpg");
        bike4 = new ImageIcon("images\\Bike4.jpg");
        bike5 = new ImageIcon("images\\Bike5.jpg");
        bike6 = new ImageIcon("images\\Bike6.jpg");

        /*
        *This is the photos section where the user presses the show and hide button in order to show or hide the photos
        * The pics depict either cars or bikes selected by no copyright images
        * All the above images are no copyright images utilized to make the app more beautiful
        * Also this section of the app is similar to the cubes because MouseListener interface is used to make same effects except it's with pics here
        * This is way they are similar because with the mouse cursor the pics change that's why twelve pics where put to use
         */

        text = new JLabel("Supercars");
        text.setBounds(170,70,200,200);
        text.setFont(new Font("Arial",Font.BOLD,25));
        text.setForeground(Color.BLACK);

        text2 = new JLabel("Motorcycles");
        text2.setBounds(470,70,200,200);
        text2.setFont(new Font("Arial",Font.BOLD,25));
        text2.setForeground(Color.BLACK);

        auto = new JLabel();
        auto.setBounds(75,200,300,300);
        auto.setIcon(car1);
        auto.setVisible(false);//Setting visibility to false on purpose to make hide and show effects on supercar pics
        auto.addMouseListener(this);//Again using this line because of the MouseListener interface

        bikes = new JLabel();
        bikes.setBounds(400,200,300,300);
        bikes.setIcon(bike1);
        bikes.setVisible(false);//Setting the label to be invisible on purpose to make hide and show effects on bike pics
        bikes.addMouseListener(this);//Same applies here

        back = new JButton("Back");
        back.setBounds(525,600,200,120);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.setFont(new Font("Arial",Font.PLAIN,25));
        back.addActionListener(e -> new Menu());//Takes the user back to the main menu
        back.addActionListener(e -> dispose());//Closes the window

        show = new JButton("Show");
        show.setBounds(50,600,200,120);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        show.setFocusable(false);
        show.setFont(new Font("Arial",Font.PLAIN,25));
        show.addActionListener(e -> auto.setVisible(true));
        show.addActionListener(e -> bikes.setVisible(true));//This and the above lines show the pics with single press pf a button

        hide = new JButton("Hide");
        hide.setBounds(290,600,200,120);
        hide.setBackground(Color.BLACK);
        hide.setForeground(Color.WHITE);
        hide.setFocusable(false);
        hide.setFont(new Font("Arial",Font.PLAIN,25));
        hide.addActionListener(e -> auto.setVisible(false));
        hide.addActionListener(e -> bikes.setVisible(false));//This and the above lines hide the pics with single press pf a button

        photos = new JLabel("Photos");
        photos.setFont( new Font("Arial",Font.BOLD,50));
        photos.setForeground(Color.WHITE);

        panel = new JPanel();
        panel.setBounds(0,0,800,70);
        panel.setBackground(Color.BLACK);
        panel.add(photos);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Pire");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(800,800));
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,200,20));
        this.setLocation(600,150);
        this.add(text);
        this.add(text2);
        this.add(auto);
        this.add(bikes);
        this.add(back);
        this.add(show);
        this.add(hide);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        auto.setIcon(car2);
        bikes.setIcon(bike2);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        auto.setIcon(car3);
        bikes.setIcon(bike3);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        auto.setIcon(car4);
        bikes.setIcon(bike4);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        auto.setIcon(car5);
        bikes.setIcon(bike5);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        auto.setIcon(car6);
        bikes.setIcon(bike6);
    }
    /*
    *For every method one pic changes the label
    * In this way the pics become more interactive
     */
}
