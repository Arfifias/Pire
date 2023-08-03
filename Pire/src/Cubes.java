import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cubes extends JFrame implements MouseListener {

    ImageIcon icon;
    JButton back;
    JLabel cube1;
    JLabel cube2;
    JLabel cube3;
    JLabel cube4;
    JLabel cube5;
    JLabel cube6;
    JLabel cube;
    JPanel panel;
    Cubes(){
        icon = new ImageIcon("logo\\Pire.png");//Pire logo

        back = new JButton("Back");
        back.setBounds(300,620,200,120);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.setFont(new Font("Arial",Font.PLAIN,25));
        back.addActionListener(e -> new Menu());//Takes the user back to the main menu
        back.addActionListener(e -> dispose());//Closes the window

        cube1 = new JLabel();
        cube1.setBounds(120,200,150,150);
        cube1.setBackground(Color.RED);
        cube1.setOpaque(true);
        cube1.addMouseListener(this);//Every MouseListener is responsible for the cubes changing colors

        cube2 = new JLabel();
        cube2.setBounds(320,200,150,150);
        cube2.setBackground(Color.BLACK);
        cube2.setOpaque(true);
        cube2.addMouseListener(this);//Useful for color change

        /*
        *This is the interactive cubes section
        * It's similar to photos section
        * When the user presses or hovers over the cubes with the mouse cursor they change colors
        * The MouseListener method is responsible for this effect
         */

        cube3 = new JLabel();
        cube3.setBounds(520,200,150,150);
        cube3.setBackground(new Color(200,80,1));
        cube3.setOpaque(true);
        cube3.addMouseListener(this);//Same here

        cube4 = new JLabel();
        cube4.setBounds(120,450,150,150);
        cube4.setBackground(Color.WHITE);
        cube4.setOpaque(true);
        cube4.addMouseListener(this);//The same applies here for the MouseListener

        cube5 = new JLabel();
        cube5.setBounds(320,450,150,150);
        cube5.setBackground(Color.PINK);
        cube5.setOpaque(true);
        cube5.addMouseListener(this);//In every cube label had to be added this line because this class implements MouseListener interface

        cube6 = new JLabel();
        cube6.setBounds(520,450,150,150);
        cube6.setBackground(Color.YELLOW);
        cube6.setOpaque(true);
        cube6.addMouseListener(this);//The same applies here as well


        cube = new JLabel("Cubes");
        cube.setFont( new Font("Arial",Font.BOLD,50));
        cube.setForeground(Color.WHITE);

        panel = new JPanel();
        panel.setBounds(0,0,800,70);
        panel.setBackground(Color.BLACK);
        panel.add(cube);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Pire");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(800,800));
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,200,20));
        this.setLocation(600,150);
        this.add(back);
        this.add(cube1);
        this.add(cube2);
        this.add(cube3);
        this.add(cube4);
        this.add(cube5);
        this.add(cube6);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        cube1.setBackground(Color.ORANGE);
        cube2.setBackground(new Color(20,80,100));
        cube3.setBackground(new Color(209,18,8));
        cube4.setBackground(new Color(200,19,70));
        cube5.setBackground(new Color(155,80,100));
        cube6.setBackground(new Color(170,29,100));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        cube1.setBackground(Color.GREEN);
        cube2.setBackground(new Color(90,100,0));
        cube3.setBackground(new Color(29,17,90));
        cube4.setBackground(new Color(55,255,90));
        cube5.setBackground(new Color(70,80,100));
        cube6.setBackground(new Color(190,5,255));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        cube1.setBackground(Color.BLACK);
        cube2.setBackground(new Color(100,29,200));
        cube3.setBackground(new Color(29,255,200));
        cube4.setBackground(new Color(100,100,100));
        cube5.setBackground(new Color(200,200,100));
        cube6.setBackground(new Color(100,18,8));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        cube1.setBackground(Color.WHITE);
        cube2.setBackground(new Color(200,100,70));
        cube3.setBackground(new Color(200,150,0));
        cube4.setBackground(new Color(20,20,180));
        cube5.setBackground(new Color(20,80,20));
        cube6.setBackground(new Color(28,180,255));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        cube1.setBackground(Color.BLUE);
        cube2.setBackground(new Color(200,200,200));
        cube3.setBackground(new Color(209,18,90));
        cube4.setBackground(new Color(28,20,100));
        cube5.setBackground(new Color(200,220,100));
        cube6.setBackground(new Color(20,180,8));
    }

    /*
    *Every each method represents an action with the mouse cursor
    * There are five in total
    * One for the mouse clicks
    * One for the mouse entry to the cubes
    * One for the mouse pressing the cubes
    * One for the mouse releasing the click of the cube
    * And finally the mouse exiting the cubes
    * In every method different colors change each cube in order to be more interactive with the user
     */
}
