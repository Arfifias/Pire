import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class More extends JFrame implements ActionListener {

    ImageIcon icon;
    JButton submit;
    JButton back;
    JLabel name_surname;
    JTextField nameTextfield;
    JLabel age;
    JTextField ageTextfield;
    JTextField field;
    JTextField field2;
    JLabel more;
    JPanel container3;

    More(){
        icon = new ImageIcon("logo\\Pire.png");//Pire logo

        submit = new JButton("Submit");
        submit.setBounds(400,370,300,120);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFocusable(false);
        submit.setFont(new Font("Arial",Font.PLAIN,25));
        submit.addActionListener(this);//Useful line to set the actionPerformed method

        back = new JButton("Back");
        back.setBounds(70,370,300,120);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.setFont(new Font("Arial",Font.PLAIN,25));
        back.addActionListener(this);
        back.addActionListener(e -> new Menu());//Going back to the main menu
        back.addActionListener(e -> dispose());//Closing the window

        name_surname = new JLabel("Full Name");
        name_surname.setFont(new Font("Arial",Font.BOLD,25));
        name_surname.setBounds(100,120,150,150);
        name_surname.setForeground(Color.BLACK);

        nameTextfield = new JTextField("Enter your full name");
        nameTextfield.setBounds(300,150,400,70);
        nameTextfield.setFont(new Font("Arial",Font.PLAIN,30));
        nameTextfield.setBackground(Color.BLACK);
        nameTextfield.setForeground(Color.WHITE);
        nameTextfield.setCaretColor(Color.WHITE);
        nameTextfield.setEditable(true);//In order for the user to give his name

        age = new JLabel("Age");
        age.setFont(new Font("Arial",Font.BOLD,25));
        age.setBounds(130,240,150,150);
        age.setForeground(Color.BLACK);

        /*
        *The most important lines where again highlighted with comments
        * Here in the more section somebody can give his or her name
        * This causes the app to recognise the user when he or she logs in again
        * This was made in order to make the user interface more interactive
        * Instead of creating a database and storing data in there
         */

        ageTextfield = new JTextField("Enter your Age");
        ageTextfield.setBounds(300,270,400,70);
        ageTextfield.setFont(new Font("Arial",Font.PLAIN,30));
        ageTextfield.setBackground(Color.BLACK);
        ageTextfield.setForeground(Color.WHITE);
        ageTextfield.setCaretColor(Color.WHITE);
        ageTextfield.setEditable(true);//In order for the user to give his age

        field = new JTextField();
        field.setBounds(300,550,400,70);
        field.setFont(new Font("Arial",Font.PLAIN,30));
        field.setBackground(Color.BLACK);
        field.setForeground(Color.WHITE);
        field.setCaretColor(Color.WHITE);
        field.setEditable(false);//On purpose this textField was disabled just to store the name input in this specific field

        field2 = new JTextField();
        field2.setBounds(300,650,400,70);
        field2.setFont(new Font("Arial",Font.PLAIN,30));
        field2.setBackground(Color.BLACK);
        field2.setForeground(Color.WHITE);
        field2.setCaretColor(Color.WHITE);
        field2.setEditable(false);//The same applies here for the age

        more = new JLabel("Personal Details");
        more.setFont( new Font("Arial",Font.BOLD,50));
        more.setForeground(Color.WHITE);

        container3 = new JPanel();
        container3.setBounds(0,0,800,70);
        container3.setBackground(Color.BLACK);
        container3.add(more);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pire");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(800,800));
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,200,20));
        this.setLocation(600,150);
        this.add(submit);
        this.add(back);
        this.add(name_surname);
        this.add(nameTextfield);
        this.add(age);
        this.add(field);
        this.add(field2);
        this.add(ageTextfield);
        this.add(container3);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTextfield.getText();
        String age = ageTextfield.getText();//Storing the name and age inputs in variables
        if (e.getSource() == submit){
            field.setText(name);
            field2.setText(age);//Putting the name and age variable to disables textFields that cannot be edited
            System.out.println("We got your personal details...go back to the main menu!");//Message after the user presses submit
        }
    }
}
