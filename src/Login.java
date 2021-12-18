import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;



public class Login extends JFrame implements ActionListener {
    JLabel login = new JLabel("LOGIN");
    ImageIcon image = new ImageIcon("images/wal.jpg");
    JLabel background = new JLabel("",image,JLabel.CENTER);

    //username
    JTextField userNameTextField = new JTextField();
    JLabel userNameLabel = new JLabel("User name:");

    //password
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password: ");

    JButton loginButton = new JButton("Login");
    JPanel panel = new JPanel();

    JButton create_account = new JButton("Create account");

    HashMap<String,String> loginInfo;


    Login(HashMap<String,String> loginInfoOriginal) {
        loginInfo =loginInfoOriginal;
        background.setBounds(0,0,700,700);





        //panel
        panel.setBounds(115,120,450,400);
        panel.setBackground(Color.orange);
        panel.setOpaque(true);
        panel.setLayout(null);
        add(panel);

        //login text
        login.setBounds(105, 10, 250, 100);
        login.setFont(new Font("Rampart one", Font.BOLD, 60));
        login.setForeground(Color.black);

        //username label
        userNameLabel.setBounds(37,125,150,25);
        userNameLabel.setForeground(Color.gray);
        userNameLabel.setFont(new Font("Tahoma", Font.BOLD,18));
        panel.add(userNameLabel);

        //username textfild
        userNameTextField.setBounds(170,125,215,25);
//        userNameTextField.setBackground(Color.gray);
//        userNameTextField.setForeground(Color.white);
        userNameTextField.setFont(new Font("Thoma",Font.PLAIN,20));
        panel.add(userNameTextField);

        //password label
         passwordLabel.setBounds(37,170,150,25);
        passwordLabel.setForeground(Color.gray);
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD,18));
        panel.add(passwordLabel);

        //password field
        passwordField.setBounds(170,170,215,25);
        panel.add(passwordField);

        //login button
        loginButton.setBounds(170,225,80,32);
        loginButton.addActionListener(this);
        loginButton.setBackground(Color.gray);
        loginButton.setForeground(Color.white);
        loginButton.setFont(new Font("Fira Sans Ultra",Font.BOLD,15));
        loginButton.setFocusPainted(false);
        panel.add(loginButton);


        // create account
        create_account.setBounds(270,235,120,32);
        create_account.addActionListener(this);
        create_account.setForeground(Color.red);
        create_account.setBackground(Color.orange);
        create_account.setFocusPainted(false);
        create_account.setBorder(null);
        create_account.setFont(new Font("Tahoma", Font.ITALIC,15));
        panel.add(create_account);

        //added objects
        panel.add(login);

        add(background);

        //frame
        setTitle("login");
        setResizable(false);
        setBounds(400,100,700,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


      @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==loginButton){
                String userId = userNameTextField.getText();
                String userPassword = String.valueOf(passwordField.getPassword());

                    if(userId.isEmpty()){
                        JOptionPane.showMessageDialog(null,"username cannot be empty");
                    }else if(userPassword.isEmpty()){
                        JOptionPane.showMessageDialog(null,"password cannot be empty");
                    }

                    else {
                        if(loginInfo.containsKey(userId)){
                            if(loginInfo.get(userId).equals(userPassword)){
                                dispose();
                                new Homepage2();
                            }else { 
                                JOptionPane.showMessageDialog(null,"Incorrect username or password");
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Incorrect username or password");
                        }
                    }
            }

            if(e.getSource()==create_account){
                dispose();
                new Signup();
            }
    }
}

