import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {

    ImageIcon icon;
    JButton proceed;
    JButton submit;
    JLabel title;
    JLabel username;
    JLabel pass;
    JTextField user;
    JPasswordField password;
    JPanel container;


    Login(){
        icon = new ImageIcon("logo\\Pire.png");//Pire logo

        proceed = new JButton("Proceed");
        proceed.setBounds(430,600,300,120);
        proceed.setBackground(Color.BLACK);
        proceed.setForeground(Color.WHITE);
        proceed.setFocusable(false);
        proceed.setFont(new Font("Arial",Font.PLAIN,30));
        proceed.addActionListener(this);//Useful line for the actionPerformed method
        proceed.addActionListener(e -> new Menu());//Here this line of code takes the user to the main menu after he or she presses the proceed button
        proceed.addActionListener(e -> dispose());//Closes the log in window

        submit = new JButton("Submit");
        submit.setBounds(50,600,300,120);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFocusable(false);
        submit.setFont(new Font("Arial",Font.PLAIN,30));
        submit.addActionListener(this);//Useful for the actionPerformed method
        submit.addActionListener(e -> System.out.println("Username:" + user.getText() ));
        submit.addActionListener(e -> System.out.println("Your " + pass.getText() + " is hidden"));//The first two ActionListeners get the input of the user
        submit.addActionListener(e -> this.add(proceed));//This specific line make the proceed button appear after user adds his input in the textFields and of course after he or she presses the submit button

        /*
        *This is the login form and the basic format of the application
        * Contains useful and smart code in order to log in the app
        * This took again too many hours to create...
        * It took me that much because I am also working on other projects
        * The design is similar to the APIC app,but I made a lot of changes
        * Added a lot of new features to make the app look awesome
         */

        title = new JLabel("Pire");
        title.setFont( new Font("Arial",Font.BOLD,50));
        title.setForeground(Color.WHITE);

        username = new JLabel("Username");
        username.setBounds(100,230,200,100);
        username.setFont(new Font("Arial",Font.BOLD,35));
        username.setForeground(Color.BLACK);

        pass = new JLabel("Password");
        pass.setBounds(100,460,200,100);
        pass.setFont(new Font("Arial",Font.BOLD,35));
        pass.setForeground(Color.BLACK);

        /*
        *Most lines of code over here is just customization of the app
        * There is the actionPerformed method which is vital for the app to work properly
        * Most of the hardcore code was put in that method
        * So check the comments down bellow
         */


        user = new JTextField();
        user.setBounds(350,230,400,100);
        user.setFont(new Font("Arial",Font.PLAIN,40));
        user.setForeground(Color.WHITE);
        user.setBackground(Color.BLACK);
        user.setCaretColor(Color.WHITE);
        user.setEditable(true);
        user.addActionListener(this);

        password = new JPasswordField();
        password.setBounds(350,460,400,100);
        password.setFont(new Font("Arial",Font.PLAIN,40));
        password.setForeground(Color.WHITE);
        password.setBackground(Color.BLACK);
        password.setCaretColor(Color.WHITE);
        password.setEditable(true);
        password.addActionListener(this);

        container = new JPanel();
        container.setBounds(0,0,800,70);
        container.setBackground(Color.BLACK);
        container.add(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Pire");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(800,800));
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,200,20));
        this.setLocation(600,150);
        this.add(submit);
        this.add(username);
        this.add(pass);
        this.add(user);
        this.add(password);
        this.add(container);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       char [] myPassword = password.getPassword();//Storing the password into an array of characters
       if (user.getText().equalsIgnoreCase("") && myPassword.length == 0){
           if (e.getSource() == submit) {
               proceed.setEnabled(false);//Disables proceed button
               JOptionPane.showConfirmDialog(null, "Please enter your username and your password!!!");//Message in case of not inserted user input
           }
           /*
           *The most important lines here are 118 and 127
           * These lines of code check if the user put his or her username and password and show either of the above or bellow messages
            */
       }else if (user.getText() != null && myPassword.length>0){
           if(e.getSource() == submit){
               proceed.setEnabled(true);//Enables proceed button
               JOptionPane.showConfirmDialog(null,"Login Success");//Message in case of inserted user input
           }
       }
    }
}

